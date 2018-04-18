package pro.jness.mppreader.controller;

import net.sf.mpxj.MPXJException;
import net.sf.mpxj.ProjectFile;
import net.sf.mpxj.ProjectProperties;
import net.sf.mpxj.Task;
import net.sf.mpxj.mpp.MPPReader;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import pro.jness.mppreader.utils.Utils;
import pro.jness.mppreader.utils.mpp.MPP;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class MPPController {

    private final Logger logger = LoggerFactory.getLogger(MPPController.class);
    private final MPPReader mppReader;

    @Autowired
    public MPPController(MPPReader mppReader) {
        this.mppReader = mppReader;
    }

    @PostMapping("/describe-mpp-now")
    public MPP describeMppNow(@RequestParam("file") MultipartFile file,
                              @RequestParam(required = false, defaultValue = "true") Boolean includeProjectProperties,
                              @RequestParam(required = false, defaultValue = "true") Boolean includeTasks,
                              @RequestParam(required = false, defaultValue = "true") Boolean includeTasksHierarchy) {
        ProjectFile mppProject;
        try (InputStream fileIS = file.getInputStream()) {
            mppProject = mppReader.read(fileIS);
        } catch (IOException | MPXJException e) {
            logger.error(e.getMessage(), e);
            throw new RuntimeException("Can not read this file: \n" + ExceptionUtils.getStackTrace(e));
        }

        MPP mpp = new MPP();
        mpp.setTasksTotal(CollectionUtils.size(mppProject.getTasks()));

        if (includeProjectProperties) {
            ProjectProperties projectProperties = mppProject.getProjectProperties();

            MPP.ProjectProperties pp = new MPP.ProjectProperties();
            mpp.setProjectProperties(pp);

            pp.setName(projectProperties.getName());
            pp.setShortApplicationName(projectProperties.getShortApplicationName());
            pp.setFullApplicationName(projectProperties.getFullApplicationName());
            pp.setApplicationVersion(projectProperties.getApplicationVersion());
            pp.setAuthor(projectProperties.getAuthor());
            pp.setLastAuthor(projectProperties.getLastAuthor());
            pp.setCompany(projectProperties.getCompany());
            pp.setComments(projectProperties.getComments());
            pp.setProjectTitle(projectProperties.getProjectTitle());
            pp.setCurrencyCode(projectProperties.getCurrencyCode());
            pp.setCurrencySymbol(projectProperties.getCurrencySymbol());
            pp.setDefaultCalendarName(projectProperties.getDefaultCalendarName());
            pp.setMpxProgramName(projectProperties.getMpxProgramName());
            pp.setAmText(projectProperties.getAMText());
            pp.setPmText(projectProperties.getPMText());
            pp.setCategory(projectProperties.getCategory());

            if (projectProperties.getStartDate() != null) {
                pp.setStartDate(Utils.date(projectProperties.getStartDate()));
            }

            if (projectProperties.getFinishDate() != null) {
                pp.setFinishDate(Utils.date(projectProperties.getFinishDate()));
            }
        }

        if (BooleanUtils.isTrue(includeTasks)) {
            if (CollectionUtils.isNotEmpty(mppProject.getTasks())) {
                mpp.setTasks(new ArrayList<>(mppProject.getTasks().size()));

                for (Task task : mppProject.getTasks()) {
                    mpp.getTasks().add(Utils.task(task));
                }
            }
        }

        if (BooleanUtils.isTrue(includeTasksHierarchy)) {
            List<Task> highLevelTasks = mppProject.getTasks().stream().filter(t -> t.getParentTask() == null).collect(Collectors.toList());

            mpp.setTasksHierarchy(new ArrayList<>(highLevelTasks.size()));

            if (CollectionUtils.isNotEmpty(highLevelTasks)) {
                for (Task task : highLevelTasks) {
                    mpp.getTasksHierarchy().add(Utils.taskWithChildren(task, mppProject.getTasks()));
                }
            }
        }

        return mpp;
    }
}
