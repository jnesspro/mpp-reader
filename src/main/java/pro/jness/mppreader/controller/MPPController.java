package pro.jness.mppreader.controller;

import net.sf.mpxj.*;
import net.sf.mpxj.mpp.MPPReader;
import org.apache.commons.collections4.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import pro.jness.mppreader.storage.StorageService;
import pro.jness.mppreader.utils.MPP;

import java.nio.file.Path;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.ArrayList;

@RestController
public class MPPController {

    private final Logger logger = LoggerFactory.getLogger(MPPController.class);
    private final StorageService storageService;
    private final MPPReader mppReader;

    @Autowired
    public MPPController(StorageService storageService, MPPReader mppReader) {
        this.storageService = storageService;
        this.mppReader = mppReader;
    }

    @PostMapping("/describe-mpp-now")
    public MPP describeMppNow(@RequestParam("file") MultipartFile file) {
        Path savedFile = storageService.storeMPP(file);
        try {
            ProjectFile mppProject = mppReader.read(savedFile.toFile());
            MPP mpp = new MPP();
            ProjectProperties projectProperties = mppProject.getProjectProperties();
            if (projectProperties != null) {
                mpp.setProjectProperties(new MPP.ProjectProperties());

                mpp.getProjectProperties().setName(projectProperties.getName());
                mpp.getProjectProperties().setShortApplicationName(projectProperties.getShortApplicationName());
                mpp.getProjectProperties().setFullApplicationName(projectProperties.getFullApplicationName());
                mpp.getProjectProperties().setApplicationVersion(projectProperties.getApplicationVersion());
                mpp.getProjectProperties().setAuthor(projectProperties.getAuthor());
                mpp.getProjectProperties().setLastAuthor(projectProperties.getLastAuthor());
                mpp.getProjectProperties().setCompany(projectProperties.getCompany());
                mpp.getProjectProperties().setComments(projectProperties.getComments());
                mpp.getProjectProperties().setProjectTitle(projectProperties.getProjectTitle());
                mpp.getProjectProperties().setCurrencyCode(projectProperties.getCurrencyCode());
                mpp.getProjectProperties().setCurrencySymbol(projectProperties.getCurrencySymbol());
                mpp.getProjectProperties().setDefaultCalendarName(projectProperties.getDefaultCalendarName());
                mpp.getProjectProperties().setMpxProgramName(projectProperties.getMpxProgramName());
                mpp.getProjectProperties().setAmText(projectProperties.getAMText());
                mpp.getProjectProperties().setPmText(projectProperties.getPMText());
                mpp.getProjectProperties().setCategory(projectProperties.getCategory());

                if (projectProperties.getStartDate() != null) {
                    mpp.getProjectProperties().setStartDate(
                            LocalDateTime.ofInstant(projectProperties.getStartDate().toInstant(), ZoneOffset.UTC));
                }

                if (projectProperties.getFinishDate() != null) {
                    mpp.getProjectProperties().setFinishDate(
                            LocalDateTime.ofInstant(projectProperties.getFinishDate().toInstant(), ZoneOffset.UTC));
                }
            }

            if (CollectionUtils.isNotEmpty(mppProject.getTasks())) {
                mpp.setTasks(new ArrayList<>(mppProject.getTasks().size()));

                for (Task task : mppProject.getTasks()) {
                    MPP.Task t = new MPP.Task();
                    t.setDuration(new MPP.Task.Duration(
                            task.getDuration().getUnits(), task.getDuration().getDuration()));
                    if (CollectionUtils.isNotEmpty(task.getPredecessors())) {
                        t.setPredecessors(new ArrayList<>(task.getPredecessors().size()));

                        for (Relation relation : task.getPredecessors()) {
                            MPP.Task.Predecessor p = new MPP.Task.Predecessor();
                            p.setRelationType(relation.getType());
                            if (relation.getTargetTask() != null) {
                                p.setTargetTaskID(relation.getTargetTask().getID());
                            }
                            if (relation.getSourceTask() != null) {
                                p.setSourceTaskID(relation.getSourceTask().getID());
                            }

                            t.getPredecessors().add(p);
                        }
                    }

                    mpp.getTasks().add(t);
                }
            }

            return mpp;
        } catch (MPXJException e) {
            logger.error(e.getMessage(), e);
            throw new RuntimeException("Can not read this file");
        }
    }
}
