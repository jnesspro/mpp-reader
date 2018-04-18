package pro.jness.mppreader.utils.mpp;

import com.fasterxml.jackson.annotation.JsonInclude;
import net.sf.mpxj.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Task {
    private Integer ID;
    private boolean active;
    private List<ResourceAssignment> resourceAssignments;
    private Double percentageComplete;
    private Double percentageWorkComplete;
    private BigDecimal actualCost;
    private Duration actualDuration;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime actualFinish;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime actualStart;
    private Duration actualWork;
    private BigDecimal baselineCost;
    private Duration baselineDuration;
    private String baselineDurationText;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime baselineFinish;
    private String baselineFinishText;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime baselineStart;
    private String baselineStartText;
    private Duration baselineWork;
    private Double budgetedCostOfWorkPerformed;
    private Double budgetedCostOfWorkScheduled;
    private boolean confirmed;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime constraintDate;
    private ConstraintType constraintType;
    private String contact;
    private BigDecimal cost;
    private BigDecimal costVariance;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime createDate;
    private boolean critical;
    private BigDecimal earnedValueCostVariance;
    private Duration levelingDelay;
    private Duration duration;
    private String durationText;
    private Duration durationVariance;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime earlyFinish;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime earlyStart;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime finish;
    private String finishText;
    private Duration finishVariance;
    private BigDecimal fixedCost;
    private Duration freeSlack;
    private boolean hideBar;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime lateFinish;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime lateStart;
    private boolean linkedFields;
    private boolean marked;
    private boolean milestone;
    private String name;
    private String notes;
    private Integer objects;
    private Integer outlineLevel;
    private Integer outlineNumber;
    private List<Predecessor> predecessors;
    private Priority priority;
    private String project;
    private BigDecimal remainingCost;
    private Duration remainingDuration;
    private Duration remainingWork;
    private String resourceGroup;
    private String resourceInitials;
    private String resourceNames;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime resume;
    private boolean rollup;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime start;
    private String startText;
    private Duration startVariance;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime stop;
    private String subProjectName;
    private boolean summary;
    private BigDecimal earnedValueScheduleVariance;
    private String text;
    private String outlineCode;
    private Duration totalSlack;
    private Integer uniqueID;
    private boolean updateNeeded;
    private String workBreakdownStructureCode;
    private Duration work;
    private Duration workVariance;
    private Integer parentTaskID;
    private List<Task> childTasks;
    private boolean estimated;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime deadline;
    private TaskType type;
    private boolean nullTask;
    private String wbsLevel;
    private boolean resumeValid;
    private boolean recurring;
    private boolean overAllocated;
    private Integer subProjectTaskID;
    private Integer subProjectTaskUniqueID;
    private Integer subProjectTasksUniqueIDOffset;
    private boolean subProjectReadOnly;
    private boolean externalTask;
    private String externalTaskProject;
    private BigDecimal acwp;
    private TimeUnit levelingDelayFormat;
    private boolean ignoreResourceCalendar;
    private BigDecimal physicalPercentComplete;
    private EarnedValueMethod earnedValueMethod;
    private Duration actualWorkProtected;
    private Duration actualOvertimeWorkProtected;
    private Duration regularWork;
    private boolean effortDriven;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private boolean date;
    private BigDecimal overtimeCost;
    private BigDecimal actualOvertimeCost;
    private Duration actualOvertimeWork;
    private AccrueType fixedCostAccrual;
    private String hyperlink;
    private String hyperlinkAddress;
    private String hyperlinkSubAddress;
    private boolean levelAssignments;
    private boolean levelingCanSplit;
    private Duration overtimeWork;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime preleveledStart;
    private LocalDateTime preleveledFinish;
    private Duration remainingOvertimeWork;
    private BigDecimal remainingOvertimeCost;
    private ProjectCalendar calendar;
    private boolean expanded;
    private Duration startSlack;
    private Duration finishSlack;
    private List<DateRange> splits;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime splitCompleteDuration;
    private SubProject subProject;
    private BigDecimal enterpriseCost;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime enterpriseDate;
    private Duration enterpriseDuration;
    private boolean enterpriseFlag;
    private Double enterpriseNumber;
    private String enterpriseText;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime summaryProgress;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime completeThrough;
    private UUID guid;
    private TaskMode taskMode;
    private Duration baselineEstimatedDuration;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Duration baselineEstimatedStart;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Duration baselineEstimatedFinish;
    private BigDecimal baselineFixedCost;
    private AccrueType baselineFixedCostAccrual;

    public Task() {
    }

    public Task(Integer ID, boolean active, List<ResourceAssignment> resourceAssignments, Double percentageComplete, Double percentageWorkComplete, BigDecimal actualCost, Duration actualDuration, LocalDateTime actualFinish, LocalDateTime actualStart, Duration actualWork, BigDecimal baselineCost, Duration baselineDuration, String baselineDurationText, LocalDateTime baselineFinish, String baselineFinishText, LocalDateTime baselineStart, String baselineStartText, Duration baselineWork, Double budgetedCostOfWorkPerformed, Double budgetedCostOfWorkScheduled, boolean confirmed, LocalDateTime constraintDate, ConstraintType constraintType, String contact, BigDecimal cost, BigDecimal costVariance, LocalDateTime createDate, boolean critical, BigDecimal earnedValueCostVariance, Duration levelingDelay, Duration duration, String durationText, Duration durationVariance, LocalDateTime earlyFinish, LocalDateTime earlyStart, LocalDateTime finish, String finishText, Duration finishVariance, BigDecimal fixedCost, Duration freeSlack, boolean hideBar, LocalDateTime lateFinish, LocalDateTime lateStart, boolean linkedFields, boolean marked, boolean milestone, String name, String notes, Integer objects, Integer outlineLevel, Integer outlineNumber, List<Predecessor> predecessors, Priority priority, String project, BigDecimal remainingCost, Duration remainingDuration, Duration remainingWork, String resourceGroup, String resourceInitials, String resourceNames, LocalDateTime resume, boolean rollup, LocalDateTime start, String startText, Duration startVariance, LocalDateTime stop, String subProjectName, boolean summary, BigDecimal earnedValueScheduleVariance, String text, String outlineCode, Duration totalSlack, Integer uniqueID, boolean updateNeeded, String workBreakdownStructureCode, Duration work, Duration workVariance, Integer parentTaskID, List<Task> childTasks, boolean estimated, LocalDateTime deadline, TaskType type, boolean nullTask, String wbsLevel, boolean resumeValid, boolean recurring, boolean overAllocated, Integer subProjectTaskID, Integer subProjectTaskUniqueID, Integer subProjectTasksUniqueIDOffset, boolean subProjectReadOnly, boolean externalTask, String externalTaskProject, BigDecimal acwp, TimeUnit levelingDelayFormat, boolean ignoreResourceCalendar, BigDecimal physicalPercentComplete, EarnedValueMethod earnedValueMethod, Duration actualWorkProtected, Duration actualOvertimeWorkProtected, Duration regularWork, boolean effortDriven, boolean date, BigDecimal overtimeCost, BigDecimal actualOvertimeCost, Duration actualOvertimeWork, AccrueType fixedCostAccrual, String hyperlink, String hyperlinkAddress, String hyperlinkSubAddress, boolean levelAssignments, boolean levelingCanSplit, Duration overtimeWork, LocalDateTime preleveledStart, LocalDateTime preleveledFinish, Duration remainingOvertimeWork, BigDecimal remainingOvertimeCost, ProjectCalendar calendar, boolean expanded, Duration startSlack, Duration finishSlack, List<DateRange> splits, LocalDateTime splitCompleteDuration, SubProject subProject, BigDecimal enterpriseCost, LocalDateTime enterpriseDate, Duration enterpriseDuration, boolean enterpriseFlag, Double enterpriseNumber, String enterpriseText, LocalDateTime summaryProgress, LocalDateTime completeThrough, UUID guid, TaskMode taskMode, Duration baselineEstimatedDuration, Duration baselineEstimatedStart, Duration baselineEstimatedFinish, BigDecimal baselineFixedCost, AccrueType baselineFixedCostAccrual) {
        this.ID = ID;
        this.active = active;
        this.resourceAssignments = resourceAssignments;
        this.percentageComplete = percentageComplete;
        this.percentageWorkComplete = percentageWorkComplete;
        this.actualCost = actualCost;
        this.actualDuration = actualDuration;
        this.actualFinish = actualFinish;
        this.actualStart = actualStart;
        this.actualWork = actualWork;
        this.baselineCost = baselineCost;
        this.baselineDuration = baselineDuration;
        this.baselineDurationText = baselineDurationText;
        this.baselineFinish = baselineFinish;
        this.baselineFinishText = baselineFinishText;
        this.baselineStart = baselineStart;
        this.baselineStartText = baselineStartText;
        this.baselineWork = baselineWork;
        this.budgetedCostOfWorkPerformed = budgetedCostOfWorkPerformed;
        this.budgetedCostOfWorkScheduled = budgetedCostOfWorkScheduled;
        this.confirmed = confirmed;
        this.constraintDate = constraintDate;
        this.constraintType = constraintType;
        this.contact = contact;
        this.cost = cost;
        this.costVariance = costVariance;
        this.createDate = createDate;
        this.critical = critical;
        this.earnedValueCostVariance = earnedValueCostVariance;
        this.levelingDelay = levelingDelay;
        this.duration = duration;
        this.durationText = durationText;
        this.durationVariance = durationVariance;
        this.earlyFinish = earlyFinish;
        this.earlyStart = earlyStart;
        this.finish = finish;
        this.finishText = finishText;
        this.finishVariance = finishVariance;
        this.fixedCost = fixedCost;
        this.freeSlack = freeSlack;
        this.hideBar = hideBar;
        this.lateFinish = lateFinish;
        this.lateStart = lateStart;
        this.linkedFields = linkedFields;
        this.marked = marked;
        this.milestone = milestone;
        this.name = name;
        this.notes = notes;
        this.objects = objects;
        this.outlineLevel = outlineLevel;
        this.outlineNumber = outlineNumber;
        this.predecessors = predecessors;
        this.priority = priority;
        this.project = project;
        this.remainingCost = remainingCost;
        this.remainingDuration = remainingDuration;
        this.remainingWork = remainingWork;
        this.resourceGroup = resourceGroup;
        this.resourceInitials = resourceInitials;
        this.resourceNames = resourceNames;
        this.resume = resume;
        this.rollup = rollup;
        this.start = start;
        this.startText = startText;
        this.startVariance = startVariance;
        this.stop = stop;
        this.subProjectName = subProjectName;
        this.summary = summary;
        this.earnedValueScheduleVariance = earnedValueScheduleVariance;
        this.text = text;
        this.outlineCode = outlineCode;
        this.totalSlack = totalSlack;
        this.uniqueID = uniqueID;
        this.updateNeeded = updateNeeded;
        this.workBreakdownStructureCode = workBreakdownStructureCode;
        this.work = work;
        this.workVariance = workVariance;
        this.parentTaskID = parentTaskID;
        this.childTasks = childTasks;
        this.estimated = estimated;
        this.deadline = deadline;
        this.type = type;
        this.nullTask = nullTask;
        this.wbsLevel = wbsLevel;
        this.resumeValid = resumeValid;
        this.recurring = recurring;
        this.overAllocated = overAllocated;
        this.subProjectTaskID = subProjectTaskID;
        this.subProjectTaskUniqueID = subProjectTaskUniqueID;
        this.subProjectTasksUniqueIDOffset = subProjectTasksUniqueIDOffset;
        this.subProjectReadOnly = subProjectReadOnly;
        this.externalTask = externalTask;
        this.externalTaskProject = externalTaskProject;
        this.acwp = acwp;
        this.levelingDelayFormat = levelingDelayFormat;
        this.ignoreResourceCalendar = ignoreResourceCalendar;
        this.physicalPercentComplete = physicalPercentComplete;
        this.earnedValueMethod = earnedValueMethod;
        this.actualWorkProtected = actualWorkProtected;
        this.actualOvertimeWorkProtected = actualOvertimeWorkProtected;
        this.regularWork = regularWork;
        this.effortDriven = effortDriven;
        this.date = date;
        this.overtimeCost = overtimeCost;
        this.actualOvertimeCost = actualOvertimeCost;
        this.actualOvertimeWork = actualOvertimeWork;
        this.fixedCostAccrual = fixedCostAccrual;
        this.hyperlink = hyperlink;
        this.hyperlinkAddress = hyperlinkAddress;
        this.hyperlinkSubAddress = hyperlinkSubAddress;
        this.levelAssignments = levelAssignments;
        this.levelingCanSplit = levelingCanSplit;
        this.overtimeWork = overtimeWork;
        this.preleveledStart = preleveledStart;
        this.preleveledFinish = preleveledFinish;
        this.remainingOvertimeWork = remainingOvertimeWork;
        this.remainingOvertimeCost = remainingOvertimeCost;
        this.calendar = calendar;
        this.expanded = expanded;
        this.startSlack = startSlack;
        this.finishSlack = finishSlack;
        this.splits = splits;
        this.splitCompleteDuration = splitCompleteDuration;
        this.subProject = subProject;
        this.enterpriseCost = enterpriseCost;
        this.enterpriseDate = enterpriseDate;
        this.enterpriseDuration = enterpriseDuration;
        this.enterpriseFlag = enterpriseFlag;
        this.enterpriseNumber = enterpriseNumber;
        this.enterpriseText = enterpriseText;
        this.summaryProgress = summaryProgress;
        this.completeThrough = completeThrough;
        this.guid = guid;
        this.taskMode = taskMode;
        this.baselineEstimatedDuration = baselineEstimatedDuration;
        this.baselineEstimatedStart = baselineEstimatedStart;
        this.baselineEstimatedFinish = baselineEstimatedFinish;
        this.baselineFixedCost = baselineFixedCost;
        this.baselineFixedCostAccrual = baselineFixedCostAccrual;
    }

    public static class SubProject{
        private String dosFileName;
        private String dosFullPath;
        private String fileName;
        private String fullPath;
        private Integer taskUniqueID;
        private Integer uniqueIDOffset;
        private boolean externalTask;
        private Integer externalTaskUniqueID;
        private List<Integer> allExternalTaskUniqueIDs;

        public String getDosFileName() {
            return dosFileName;
        }

        public void setDosFileName(String dosFileName) {
            this.dosFileName = dosFileName;
        }

        public String getDosFullPath() {
            return dosFullPath;
        }

        public void setDosFullPath(String dosFullPath) {
            this.dosFullPath = dosFullPath;
        }

        public String getFileName() {
            return fileName;
        }

        public void setFileName(String fileName) {
            this.fileName = fileName;
        }

        public String getFullPath() {
            return fullPath;
        }

        public void setFullPath(String fullPath) {
            this.fullPath = fullPath;
        }

        public Integer getTaskUniqueID() {
            return taskUniqueID;
        }

        public void setTaskUniqueID(Integer taskUniqueID) {
            this.taskUniqueID = taskUniqueID;
        }

        public Integer getUniqueIDOffset() {
            return uniqueIDOffset;
        }

        public void setUniqueIDOffset(Integer uniqueIDOffset) {
            this.uniqueIDOffset = uniqueIDOffset;
        }

        public boolean isExternalTask() {
            return externalTask;
        }

        public void setExternalTask(boolean externalTask) {
            this.externalTask = externalTask;
        }

        public Integer getExternalTaskUniqueID() {
            return externalTaskUniqueID;
        }

        public void setExternalTaskUniqueID(Integer externalTaskUniqueID) {
            this.externalTaskUniqueID = externalTaskUniqueID;
        }

        public List<Integer> getAllExternalTaskUniqueIDs() {
            return allExternalTaskUniqueIDs;
        }

        public void setAllExternalTaskUniqueIDs(List<Integer> allExternalTaskUniqueIDs) {
            this.allExternalTaskUniqueIDs = allExternalTaskUniqueIDs;
        }
    }

    public static class DateRange{
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
        private LocalDateTime start;
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
        private LocalDateTime end;

        public DateRange() {
        }

        public DateRange(LocalDateTime start, LocalDateTime end) {
            this.start = start;
            this.end = end;
        }

        public LocalDateTime getStart() {
            return start;
        }

        public void setStart(LocalDateTime start) {
            this.start = start;
        }

        public LocalDateTime getEnd() {
            return end;
        }

        public void setEnd(LocalDateTime end) {
            this.end = end;
        }
    }

    public static class ProjectCalendar {
        private Integer uniqueID;
        private List<ProjectCalendarWeek> workWeeks;

        public Integer getUniqueID() {
            return uniqueID;
        }

        public void setUniqueID(Integer uniqueID) {
            this.uniqueID = uniqueID;
        }

        public List<ProjectCalendarWeek> getWorkWeeks() {
            return workWeeks;
        }

        public void setWorkWeeks(List<ProjectCalendarWeek> workWeeks) {
            this.workWeeks = workWeeks;
        }
    }

    public static class ResourceAssignment {
        private Integer uniqueID;

        public Integer getUniqueID() {
            return uniqueID;
        }

        public void setUniqueID(Integer uniqueID) {
            this.uniqueID = uniqueID;
        }
    }

    public static class Duration {
        private TimeUnit units;
        private Double duration;

        public Duration() {
        }

        public Duration(TimeUnit units, Double duration) {
            this.units = units;
            this.duration = duration;
        }

        public TimeUnit getUnits() {
            return units;
        }

        public void setUnits(TimeUnit units) {
            this.units = units;
        }

        public Double getDuration() {
            return duration;
        }

        public void setDuration(Double duration) {
            this.duration = duration;
        }
    }

    public static class Predecessor {
        private Integer targetTaskID;
        private Integer sourceTaskID;
        private RelationType relationType;

        public Integer getTargetTaskID() {
            return targetTaskID;
        }

        public void setTargetTaskID(Integer targetTaskID) {
            this.targetTaskID = targetTaskID;
        }

        public Integer getSourceTaskID() {
            return sourceTaskID;
        }

        public void setSourceTaskID(Integer sourceTaskID) {
            this.sourceTaskID = sourceTaskID;
        }

        public RelationType getRelationType() {
            return relationType;
        }

        public void setRelationType(RelationType relationType) {
            this.relationType = relationType;
        }
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<ResourceAssignment> getResourceAssignments() {
        return resourceAssignments;
    }

    public void setResourceAssignments(List<ResourceAssignment> resourceAssignments) {
        this.resourceAssignments = resourceAssignments;
    }

    public Double getPercentageComplete() {
        return percentageComplete;
    }

    public void setPercentageComplete(Double percentageComplete) {
        this.percentageComplete = percentageComplete;
    }

    public Double getPercentageWorkComplete() {
        return percentageWorkComplete;
    }

    public void setPercentageWorkComplete(Double percentageWorkComplete) {
        this.percentageWorkComplete = percentageWorkComplete;
    }

    public BigDecimal getActualCost() {
        return actualCost;
    }

    public void setActualCost(BigDecimal actualCost) {
        this.actualCost = actualCost;
    }

    public Duration getActualDuration() {
        return actualDuration;
    }

    public void setActualDuration(Duration actualDuration) {
        this.actualDuration = actualDuration;
    }

    public LocalDateTime getActualFinish() {
        return actualFinish;
    }

    public void setActualFinish(LocalDateTime actualFinish) {
        this.actualFinish = actualFinish;
    }

    public LocalDateTime getActualStart() {
        return actualStart;
    }

    public void setActualStart(LocalDateTime actualStart) {
        this.actualStart = actualStart;
    }

    public Duration getActualWork() {
        return actualWork;
    }

    public void setActualWork(Duration actualWork) {
        this.actualWork = actualWork;
    }

    public BigDecimal getBaselineCost() {
        return baselineCost;
    }

    public void setBaselineCost(BigDecimal baselineCost) {
        this.baselineCost = baselineCost;
    }

    public Duration getBaselineDuration() {
        return baselineDuration;
    }

    public void setBaselineDuration(Duration baselineDuration) {
        this.baselineDuration = baselineDuration;
    }

    public String getBaselineDurationText() {
        return baselineDurationText;
    }

    public void setBaselineDurationText(String baselineDurationText) {
        this.baselineDurationText = baselineDurationText;
    }

    public LocalDateTime getBaselineFinish() {
        return baselineFinish;
    }

    public void setBaselineFinish(LocalDateTime baselineFinish) {
        this.baselineFinish = baselineFinish;
    }

    public String getBaselineFinishText() {
        return baselineFinishText;
    }

    public void setBaselineFinishText(String baselineFinishText) {
        this.baselineFinishText = baselineFinishText;
    }

    public LocalDateTime getBaselineStart() {
        return baselineStart;
    }

    public void setBaselineStart(LocalDateTime baselineStart) {
        this.baselineStart = baselineStart;
    }

    public String getBaselineStartText() {
        return baselineStartText;
    }

    public void setBaselineStartText(String baselineStartText) {
        this.baselineStartText = baselineStartText;
    }

    public Duration getBaselineWork() {
        return baselineWork;
    }

    public void setBaselineWork(Duration baselineWork) {
        this.baselineWork = baselineWork;
    }

    public Double getBudgetedCostOfWorkPerformed() {
        return budgetedCostOfWorkPerformed;
    }

    public void setBudgetedCostOfWorkPerformed(Double budgetedCostOfWorkPerformed) {
        this.budgetedCostOfWorkPerformed = budgetedCostOfWorkPerformed;
    }

    public Double getBudgetedCostOfWorkScheduled() {
        return budgetedCostOfWorkScheduled;
    }

    public void setBudgetedCostOfWorkScheduled(Double budgetedCostOfWorkScheduled) {
        this.budgetedCostOfWorkScheduled = budgetedCostOfWorkScheduled;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    public LocalDateTime getConstraintDate() {
        return constraintDate;
    }

    public void setConstraintDate(LocalDateTime constraintDate) {
        this.constraintDate = constraintDate;
    }

    public ConstraintType getConstraintType() {
        return constraintType;
    }

    public void setConstraintType(ConstraintType constraintType) {
        this.constraintType = constraintType;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public BigDecimal getCostVariance() {
        return costVariance;
    }

    public void setCostVariance(BigDecimal costVariance) {
        this.costVariance = costVariance;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public boolean isCritical() {
        return critical;
    }

    public void setCritical(boolean critical) {
        this.critical = critical;
    }

    public BigDecimal getEarnedValueCostVariance() {
        return earnedValueCostVariance;
    }

    public void setEarnedValueCostVariance(BigDecimal earnedValueCostVariance) {
        this.earnedValueCostVariance = earnedValueCostVariance;
    }

    public Duration getLevelingDelay() {
        return levelingDelay;
    }

    public void setLevelingDelay(Duration levelingDelay) {
        this.levelingDelay = levelingDelay;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public String getDurationText() {
        return durationText;
    }

    public void setDurationText(String durationText) {
        this.durationText = durationText;
    }

    public Duration getDurationVariance() {
        return durationVariance;
    }

    public void setDurationVariance(Duration durationVariance) {
        this.durationVariance = durationVariance;
    }

    public LocalDateTime getEarlyFinish() {
        return earlyFinish;
    }

    public void setEarlyFinish(LocalDateTime earlyFinish) {
        this.earlyFinish = earlyFinish;
    }

    public LocalDateTime getEarlyStart() {
        return earlyStart;
    }

    public void setEarlyStart(LocalDateTime earlyStart) {
        this.earlyStart = earlyStart;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }

    public String getFinishText() {
        return finishText;
    }

    public void setFinishText(String finishText) {
        this.finishText = finishText;
    }

    public Duration getFinishVariance() {
        return finishVariance;
    }

    public void setFinishVariance(Duration finishVariance) {
        this.finishVariance = finishVariance;
    }

    public BigDecimal getFixedCost() {
        return fixedCost;
    }

    public void setFixedCost(BigDecimal fixedCost) {
        this.fixedCost = fixedCost;
    }

    public Duration getFreeSlack() {
        return freeSlack;
    }

    public void setFreeSlack(Duration freeSlack) {
        this.freeSlack = freeSlack;
    }

    public boolean isHideBar() {
        return hideBar;
    }

    public void setHideBar(boolean hideBar) {
        this.hideBar = hideBar;
    }

    public LocalDateTime getLateFinish() {
        return lateFinish;
    }

    public void setLateFinish(LocalDateTime lateFinish) {
        this.lateFinish = lateFinish;
    }

    public LocalDateTime getLateStart() {
        return lateStart;
    }

    public void setLateStart(LocalDateTime lateStart) {
        this.lateStart = lateStart;
    }

    public boolean isLinkedFields() {
        return linkedFields;
    }

    public void setLinkedFields(boolean linkedFields) {
        this.linkedFields = linkedFields;
    }

    public boolean isMarked() {
        return marked;
    }

    public void setMarked(boolean marked) {
        this.marked = marked;
    }

    public boolean isMilestone() {
        return milestone;
    }

    public void setMilestone(boolean milestone) {
        this.milestone = milestone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Integer getObjects() {
        return objects;
    }

    public void setObjects(Integer objects) {
        this.objects = objects;
    }

    public Integer getOutlineLevel() {
        return outlineLevel;
    }

    public void setOutlineLevel(Integer outlineLevel) {
        this.outlineLevel = outlineLevel;
    }

    public Integer getOutlineNumber() {
        return outlineNumber;
    }

    public void setOutlineNumber(Integer outlineNumber) {
        this.outlineNumber = outlineNumber;
    }

    public List<Predecessor> getPredecessors() {
        return predecessors;
    }

    public void setPredecessors(List<Predecessor> predecessors) {
        this.predecessors = predecessors;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public BigDecimal getRemainingCost() {
        return remainingCost;
    }

    public void setRemainingCost(BigDecimal remainingCost) {
        this.remainingCost = remainingCost;
    }

    public Duration getRemainingDuration() {
        return remainingDuration;
    }

    public void setRemainingDuration(Duration remainingDuration) {
        this.remainingDuration = remainingDuration;
    }

    public Duration getRemainingWork() {
        return remainingWork;
    }

    public void setRemainingWork(Duration remainingWork) {
        this.remainingWork = remainingWork;
    }

    public String getResourceGroup() {
        return resourceGroup;
    }

    public void setResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
    }

    public String getResourceInitials() {
        return resourceInitials;
    }

    public void setResourceInitials(String resourceInitials) {
        this.resourceInitials = resourceInitials;
    }

    public String getResourceNames() {
        return resourceNames;
    }

    public void setResourceNames(String resourceNames) {
        this.resourceNames = resourceNames;
    }

    public LocalDateTime getResume() {
        return resume;
    }

    public void setResume(LocalDateTime resume) {
        this.resume = resume;
    }

    public boolean isRollup() {
        return rollup;
    }

    public void setRollup(boolean rollup) {
        this.rollup = rollup;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public String getStartText() {
        return startText;
    }

    public void setStartText(String startText) {
        this.startText = startText;
    }

    public Duration getStartVariance() {
        return startVariance;
    }

    public void setStartVariance(Duration startVariance) {
        this.startVariance = startVariance;
    }

    public LocalDateTime getStop() {
        return stop;
    }

    public void setStop(LocalDateTime stop) {
        this.stop = stop;
    }

    public String getSubProjectName() {
        return subProjectName;
    }

    public void setSubProjectName(String subProjectName) {
        this.subProjectName = subProjectName;
    }

    public boolean isSummary() {
        return summary;
    }

    public void setSummary(boolean summary) {
        this.summary = summary;
    }

    public BigDecimal getEarnedValueScheduleVariance() {
        return earnedValueScheduleVariance;
    }

    public void setEarnedValueScheduleVariance(BigDecimal earnedValueScheduleVariance) {
        this.earnedValueScheduleVariance = earnedValueScheduleVariance;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getOutlineCode() {
        return outlineCode;
    }

    public void setOutlineCode(String outlineCode) {
        this.outlineCode = outlineCode;
    }

    public Duration getTotalSlack() {
        return totalSlack;
    }

    public void setTotalSlack(Duration totalSlack) {
        this.totalSlack = totalSlack;
    }

    public Integer getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(Integer uniqueID) {
        this.uniqueID = uniqueID;
    }

    public boolean isUpdateNeeded() {
        return updateNeeded;
    }

    public void setUpdateNeeded(boolean updateNeeded) {
        this.updateNeeded = updateNeeded;
    }

    public String getWorkBreakdownStructureCode() {
        return workBreakdownStructureCode;
    }

    public void setWorkBreakdownStructureCode(String workBreakdownStructureCode) {
        this.workBreakdownStructureCode = workBreakdownStructureCode;
    }

    public Duration getWork() {
        return work;
    }

    public void setWork(Duration work) {
        this.work = work;
    }

    public Duration getWorkVariance() {
        return workVariance;
    }

    public void setWorkVariance(Duration workVariance) {
        this.workVariance = workVariance;
    }

    public Integer getParentTaskID() {
        return parentTaskID;
    }

    public void setParentTaskID(Integer parentTaskID) {
        this.parentTaskID = parentTaskID;
    }

    public List<Task> getChildTasks() {
        return childTasks;
    }

    public void setChildTasks(List<Task> childTasks) {
        this.childTasks = childTasks;
    }

    public boolean isEstimated() {
        return estimated;
    }

    public void setEstimated(boolean estimated) {
        this.estimated = estimated;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    public TaskType getType() {
        return type;
    }

    public void setType(TaskType type) {
        this.type = type;
    }

    public boolean isNullTask() {
        return nullTask;
    }

    public void setNullTask(boolean nullTask) {
        this.nullTask = nullTask;
    }

    public String getWbsLevel() {
        return wbsLevel;
    }

    public void setWbsLevel(String wbsLevel) {
        this.wbsLevel = wbsLevel;
    }

    public boolean isResumeValid() {
        return resumeValid;
    }

    public void setResumeValid(boolean resumeValid) {
        this.resumeValid = resumeValid;
    }

    public boolean isRecurring() {
        return recurring;
    }

    public void setRecurring(boolean recurring) {
        this.recurring = recurring;
    }

    public boolean isOverAllocated() {
        return overAllocated;
    }

    public void setOverAllocated(boolean overAllocated) {
        this.overAllocated = overAllocated;
    }

    public Integer getSubProjectTaskID() {
        return subProjectTaskID;
    }

    public void setSubProjectTaskID(Integer subProjectTaskID) {
        this.subProjectTaskID = subProjectTaskID;
    }

    public Integer getSubProjectTaskUniqueID() {
        return subProjectTaskUniqueID;
    }

    public void setSubProjectTaskUniqueID(Integer subProjectTaskUniqueID) {
        this.subProjectTaskUniqueID = subProjectTaskUniqueID;
    }

    public Integer getSubProjectTasksUniqueIDOffset() {
        return subProjectTasksUniqueIDOffset;
    }

    public void setSubProjectTasksUniqueIDOffset(Integer subProjectTasksUniqueIDOffset) {
        this.subProjectTasksUniqueIDOffset = subProjectTasksUniqueIDOffset;
    }

    public boolean isSubProjectReadOnly() {
        return subProjectReadOnly;
    }

    public void setSubProjectReadOnly(boolean subProjectReadOnly) {
        this.subProjectReadOnly = subProjectReadOnly;
    }

    public boolean isExternalTask() {
        return externalTask;
    }

    public void setExternalTask(boolean externalTask) {
        this.externalTask = externalTask;
    }

    public String getExternalTaskProject() {
        return externalTaskProject;
    }

    public void setExternalTaskProject(String externalTaskProject) {
        this.externalTaskProject = externalTaskProject;
    }

    public BigDecimal getAcwp() {
        return acwp;
    }

    public void setAcwp(BigDecimal acwp) {
        this.acwp = acwp;
    }

    public TimeUnit getLevelingDelayFormat() {
        return levelingDelayFormat;
    }

    public void setLevelingDelayFormat(TimeUnit levelingDelayFormat) {
        this.levelingDelayFormat = levelingDelayFormat;
    }

    public boolean isIgnoreResourceCalendar() {
        return ignoreResourceCalendar;
    }

    public void setIgnoreResourceCalendar(boolean ignoreResourceCalendar) {
        this.ignoreResourceCalendar = ignoreResourceCalendar;
    }

    public BigDecimal getPhysicalPercentComplete() {
        return physicalPercentComplete;
    }

    public void setPhysicalPercentComplete(BigDecimal physicalPercentComplete) {
        this.physicalPercentComplete = physicalPercentComplete;
    }

    public EarnedValueMethod getEarnedValueMethod() {
        return earnedValueMethod;
    }

    public void setEarnedValueMethod(EarnedValueMethod earnedValueMethod) {
        this.earnedValueMethod = earnedValueMethod;
    }

    public Duration getActualWorkProtected() {
        return actualWorkProtected;
    }

    public void setActualWorkProtected(Duration actualWorkProtected) {
        this.actualWorkProtected = actualWorkProtected;
    }

    public Duration getActualOvertimeWorkProtected() {
        return actualOvertimeWorkProtected;
    }

    public void setActualOvertimeWorkProtected(Duration actualOvertimeWorkProtected) {
        this.actualOvertimeWorkProtected = actualOvertimeWorkProtected;
    }

    public Duration getRegularWork() {
        return regularWork;
    }

    public void setRegularWork(Duration regularWork) {
        this.regularWork = regularWork;
    }

    public boolean isEffortDriven() {
        return effortDriven;
    }

    public void setEffortDriven(boolean effortDriven) {
        this.effortDriven = effortDriven;
    }

    public boolean isDate() {
        return date;
    }

    public void setDate(boolean date) {
        this.date = date;
    }

    public BigDecimal getOvertimeCost() {
        return overtimeCost;
    }

    public void setOvertimeCost(BigDecimal overtimeCost) {
        this.overtimeCost = overtimeCost;
    }

    public BigDecimal getActualOvertimeCost() {
        return actualOvertimeCost;
    }

    public void setActualOvertimeCost(BigDecimal actualOvertimeCost) {
        this.actualOvertimeCost = actualOvertimeCost;
    }

    public Duration getActualOvertimeWork() {
        return actualOvertimeWork;
    }

    public void setActualOvertimeWork(Duration actualOvertimeWork) {
        this.actualOvertimeWork = actualOvertimeWork;
    }

    public AccrueType getFixedCostAccrual() {
        return fixedCostAccrual;
    }

    public void setFixedCostAccrual(AccrueType fixedCostAccrual) {
        this.fixedCostAccrual = fixedCostAccrual;
    }

    public String getHyperlink() {
        return hyperlink;
    }

    public void setHyperlink(String hyperlink) {
        this.hyperlink = hyperlink;
    }

    public String getHyperlinkAddress() {
        return hyperlinkAddress;
    }

    public void setHyperlinkAddress(String hyperlinkAddress) {
        this.hyperlinkAddress = hyperlinkAddress;
    }

    public String getHyperlinkSubAddress() {
        return hyperlinkSubAddress;
    }

    public void setHyperlinkSubAddress(String hyperlinkSubAddress) {
        this.hyperlinkSubAddress = hyperlinkSubAddress;
    }

    public boolean isLevelAssignments() {
        return levelAssignments;
    }

    public void setLevelAssignments(boolean levelAssignments) {
        this.levelAssignments = levelAssignments;
    }

    public boolean isLevelingCanSplit() {
        return levelingCanSplit;
    }

    public void setLevelingCanSplit(boolean levelingCanSplit) {
        this.levelingCanSplit = levelingCanSplit;
    }

    public Duration getOvertimeWork() {
        return overtimeWork;
    }

    public void setOvertimeWork(Duration overtimeWork) {
        this.overtimeWork = overtimeWork;
    }

    public LocalDateTime getPreleveledStart() {
        return preleveledStart;
    }

    public void setPreleveledStart(LocalDateTime preleveledStart) {
        this.preleveledStart = preleveledStart;
    }

    public LocalDateTime getPreleveledFinish() {
        return preleveledFinish;
    }

    public void setPreleveledFinish(LocalDateTime preleveledFinish) {
        this.preleveledFinish = preleveledFinish;
    }

    public Duration getRemainingOvertimeWork() {
        return remainingOvertimeWork;
    }

    public void setRemainingOvertimeWork(Duration remainingOvertimeWork) {
        this.remainingOvertimeWork = remainingOvertimeWork;
    }

    public BigDecimal getRemainingOvertimeCost() {
        return remainingOvertimeCost;
    }

    public void setRemainingOvertimeCost(BigDecimal remainingOvertimeCost) {
        this.remainingOvertimeCost = remainingOvertimeCost;
    }

    public ProjectCalendar getCalendar() {
        return calendar;
    }

    public void setCalendar(ProjectCalendar calendar) {
        this.calendar = calendar;
    }

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }

    public Duration getStartSlack() {
        return startSlack;
    }

    public void setStartSlack(Duration startSlack) {
        this.startSlack = startSlack;
    }

    public Duration getFinishSlack() {
        return finishSlack;
    }

    public void setFinishSlack(Duration finishSlack) {
        this.finishSlack = finishSlack;
    }

    public List<DateRange> getSplits() {
        return splits;
    }

    public void setSplits(List<DateRange> splits) {
        this.splits = splits;
    }

    public LocalDateTime getSplitCompleteDuration() {
        return splitCompleteDuration;
    }

    public void setSplitCompleteDuration(LocalDateTime splitCompleteDuration) {
        this.splitCompleteDuration = splitCompleteDuration;
    }

    public SubProject getSubProject() {
        return subProject;
    }

    public void setSubProject(SubProject subProject) {
        this.subProject = subProject;
    }

    public BigDecimal getEnterpriseCost() {
        return enterpriseCost;
    }

    public void setEnterpriseCost(BigDecimal enterpriseCost) {
        this.enterpriseCost = enterpriseCost;
    }

    public LocalDateTime getEnterpriseDate() {
        return enterpriseDate;
    }

    public void setEnterpriseDate(LocalDateTime enterpriseDate) {
        this.enterpriseDate = enterpriseDate;
    }

    public Duration getEnterpriseDuration() {
        return enterpriseDuration;
    }

    public void setEnterpriseDuration(Duration enterpriseDuration) {
        this.enterpriseDuration = enterpriseDuration;
    }

    public boolean isEnterpriseFlag() {
        return enterpriseFlag;
    }

    public void setEnterpriseFlag(boolean enterpriseFlag) {
        this.enterpriseFlag = enterpriseFlag;
    }

    public Double getEnterpriseNumber() {
        return enterpriseNumber;
    }

    public void setEnterpriseNumber(Double enterpriseNumber) {
        this.enterpriseNumber = enterpriseNumber;
    }

    public String getEnterpriseText() {
        return enterpriseText;
    }

    public void setEnterpriseText(String enterpriseText) {
        this.enterpriseText = enterpriseText;
    }

    public LocalDateTime getSummaryProgress() {
        return summaryProgress;
    }

    public void setSummaryProgress(LocalDateTime summaryProgress) {
        this.summaryProgress = summaryProgress;
    }

    public LocalDateTime getCompleteThrough() {
        return completeThrough;
    }

    public void setCompleteThrough(LocalDateTime completeThrough) {
        this.completeThrough = completeThrough;
    }

    public UUID getGuid() {
        return guid;
    }

    public void setGuid(UUID guid) {
        this.guid = guid;
    }

    public TaskMode getTaskMode() {
        return taskMode;
    }

    public void setTaskMode(TaskMode taskMode) {
        this.taskMode = taskMode;
    }

    public Duration getBaselineEstimatedDuration() {
        return baselineEstimatedDuration;
    }

    public void setBaselineEstimatedDuration(Duration baselineEstimatedDuration) {
        this.baselineEstimatedDuration = baselineEstimatedDuration;
    }

    public Duration getBaselineEstimatedStart() {
        return baselineEstimatedStart;
    }

    public void setBaselineEstimatedStart(Duration baselineEstimatedStart) {
        this.baselineEstimatedStart = baselineEstimatedStart;
    }

    public Duration getBaselineEstimatedFinish() {
        return baselineEstimatedFinish;
    }

    public void setBaselineEstimatedFinish(Duration baselineEstimatedFinish) {
        this.baselineEstimatedFinish = baselineEstimatedFinish;
    }

    public BigDecimal getBaselineFixedCost() {
        return baselineFixedCost;
    }

    public void setBaselineFixedCost(BigDecimal baselineFixedCost) {
        this.baselineFixedCost = baselineFixedCost;
    }

    public AccrueType getBaselineFixedCostAccrual() {
        return baselineFixedCostAccrual;
    }

    public void setBaselineFixedCostAccrual(AccrueType baselineFixedCostAccrual) {
        this.baselineFixedCostAccrual = baselineFixedCostAccrual;
    }
}
