package pro.jness.mppreader.utils.mpp;

import net.sf.mpxj.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class TaskBuilder {
    private Integer id;
    private boolean active;
    private Double percentageComplete;
    private Double percentageWorkComplete;
    private BigDecimal actualCost;
    private Task.Duration actualDuration;
    private LocalDateTime actualFinish;
    private LocalDateTime actualStart;
    private Task.Duration actualWork;
    private BigDecimal baselineCost;
    private Task.Duration baselineDuration;
    private String baselineDurationText;
    private LocalDateTime baselineFinish;
    private String baselineFinishText;
    private LocalDateTime baselineStart;
    private String baselineStartText;
    private Task.Duration baselineWork;
    private Double budgetedCostOfWorkPerformed;
    private Double budgetedCostOfWorkScheduled;
    private boolean confirmed;
    private LocalDateTime constraintDate;
    private ConstraintType constraintType;
    private String contact;
    private BigDecimal cost;
    private BigDecimal costVariance;
    private LocalDateTime createDate;
    private boolean critical;
    private BigDecimal earnedValueCostVariance;
    private Task.Duration levelingDelay;
    private Task.Duration duration;
    private String durationText;
    private Task.Duration durationVariance;
    private LocalDateTime earlyFinish;
    private LocalDateTime earlyStart;
    private LocalDateTime finish;
    private String finishText;
    private Task.Duration finishVariance;
    private BigDecimal fixedCost;
    private Task.Duration freeSlack;
    private boolean hideBar;
    private LocalDateTime lateFinish;
    private LocalDateTime lateStart;
    private boolean linkedFields;
    private boolean marked;
    private boolean milestone;
    private String name;
    private String notes;
    private Integer objects;
    private Integer outlineLevel;
    private Integer outlineNumber;
    private List<Task.Predecessor> predecessors;
    private Priority priority;
    private String project;
    private BigDecimal remainingCost;
    private Task.Duration remainingDuration;
    private Task.Duration remainingWork;
    private String resourceGroup;
    private String resourceInitials;
    private String resourceNames;
    private LocalDateTime resume;
    private boolean rollup;
    private LocalDateTime start;
    private String startText;
    private Task.Duration startVariance;
    private LocalDateTime stop;
    private String subProjectName;
    private boolean summary;
    private BigDecimal earnedValueScheduleVariance;
    private String outlineCode;
    private Task.Duration totalSlack;
    private Integer uniqueID;
    private boolean updateNeeded;
    private String workBreakdownStructureCode;
    private Task.Duration work;
    private Task.Duration workVariance;
    private Integer parentTaskID;
    private List<Task> childTasks;
    private boolean estimated;
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
    private Task.Duration actualWorkProtected;
    private Task.Duration actualOvertimeWorkProtected;
    private Task.Duration regularWork;
    private boolean effortDriven;
    private boolean date;
    private BigDecimal overtimeCost;
    private BigDecimal actualOvertimeCost;
    private Task.Duration actualOvertimeWork;
    private AccrueType fixedCostAccrual;
    private String hyperlink;
    private String hyperlinkAddress;
    private String hyperlinkSubAddress;
    private boolean levelAssignments;
    private boolean levelingCanSplit;
    private Task.Duration overtimeWork;
    private LocalDateTime preleveledStart;
    private LocalDateTime preleveledFinish;
    private Task.Duration remainingOvertimeWork;
    private BigDecimal remainingOvertimeCost;
    private Task.ProjectCalendar calendar;
    private boolean expanded;
    private Task.Duration startSlack;
    private Task.Duration finishSlack;
    private List<Task.DateRange> splits;
    private LocalDateTime splitCompleteDuration;
    private Task.SubProject subProject;
    private BigDecimal enterpriseCost;
    private LocalDateTime enterpriseDate;
    private Task.Duration enterpriseDuration;
    private boolean enterpriseFlag;
    private Double enterpriseNumber;
    private String enterpriseText;
    private LocalDateTime summaryProgress;
    private LocalDateTime completeThrough;
    private UUID guid;
    private TaskMode taskMode;
    private Task.Duration baselineEstimatedDuration;
    private Task.Duration baselineEstimatedStart;
    private Task.Duration baselineEstimatedFinish;
    private BigDecimal baselineFixedCost;
    private AccrueType baselineFixedCostAccrual;

    public TaskBuilder setID(Integer id) {
        this.id = id;
        return this;
    }

    public TaskBuilder setActive(boolean active) {
        this.active = active;
        return this;
    }

    public TaskBuilder setPercentageComplete(Double percentageComplete) {
        this.percentageComplete = percentageComplete;
        return this;
    }

    public TaskBuilder setPercentageWorkComplete(Double percentageWorkComplete) {
        this.percentageWorkComplete = percentageWorkComplete;
        return this;
    }

    public TaskBuilder setActualCost(BigDecimal actualCost) {
        this.actualCost = actualCost;
        return this;
    }

    public TaskBuilder setActualDuration(Task.Duration actualDuration) {
        this.actualDuration = actualDuration;
        return this;
    }

    public TaskBuilder setActualFinish(LocalDateTime actualFinish) {
        this.actualFinish = actualFinish;
        return this;
    }

    public TaskBuilder setActualStart(LocalDateTime actualStart) {
        this.actualStart = actualStart;
        return this;
    }

    public TaskBuilder setActualWork(Task.Duration actualWork) {
        this.actualWork = actualWork;
        return this;
    }

    public TaskBuilder setBaselineCost(BigDecimal baselineCost) {
        this.baselineCost = baselineCost;
        return this;
    }

    public TaskBuilder setBaselineDuration(Task.Duration baselineDuration) {
        this.baselineDuration = baselineDuration;
        return this;
    }

    public TaskBuilder setBaselineDurationText(String baselineDurationText) {
        this.baselineDurationText = baselineDurationText;
        return this;
    }

    public TaskBuilder setBaselineFinish(LocalDateTime baselineFinish) {
        this.baselineFinish = baselineFinish;
        return this;
    }

    public TaskBuilder setBaselineFinishText(String baselineFinishText) {
        this.baselineFinishText = baselineFinishText;
        return this;
    }

    public TaskBuilder setBaselineStart(LocalDateTime baselineStart) {
        this.baselineStart = baselineStart;
        return this;
    }

    public TaskBuilder setBaselineStartText(String baselineStartText) {
        this.baselineStartText = baselineStartText;
        return this;
    }

    public TaskBuilder setBaselineWork(Task.Duration baselineWork) {
        this.baselineWork = baselineWork;
        return this;
    }

    public TaskBuilder setBudgetedCostOfWorkPerformed(Double budgetedCostOfWorkPerformed) {
        this.budgetedCostOfWorkPerformed = budgetedCostOfWorkPerformed;
        return this;
    }

    public TaskBuilder setBudgetedCostOfWorkScheduled(Double budgetedCostOfWorkScheduled) {
        this.budgetedCostOfWorkScheduled = budgetedCostOfWorkScheduled;
        return this;
    }

    public TaskBuilder setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
        return this;
    }

    public TaskBuilder setConstraintDate(LocalDateTime constraintDate) {
        this.constraintDate = constraintDate;
        return this;
    }

    public TaskBuilder setConstraintType(ConstraintType constraintType) {
        this.constraintType = constraintType;
        return this;
    }

    public TaskBuilder setContact(String contact) {
        this.contact = contact;
        return this;
    }

    public TaskBuilder setCost(BigDecimal cost) {
        this.cost = cost;
        return this;
    }

    public TaskBuilder setCostVariance(BigDecimal costVariance) {
        this.costVariance = costVariance;
        return this;
    }

    public TaskBuilder setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
        return this;
    }

    public TaskBuilder setCritical(boolean critical) {
        this.critical = critical;
        return this;
    }

    public TaskBuilder setEarnedValueCostVariance(BigDecimal earnedValueCostVariance) {
        this.earnedValueCostVariance = earnedValueCostVariance;
        return this;
    }

    public TaskBuilder setLevelingDelay(Task.Duration levelingDelay) {
        this.levelingDelay = levelingDelay;
        return this;
    }

    public TaskBuilder setDuration(Task.Duration duration) {
        this.duration = duration;
        return this;
    }

    public TaskBuilder setDurationText(String durationText) {
        this.durationText = durationText;
        return this;
    }

    public TaskBuilder setDurationVariance(Task.Duration durationVariance) {
        this.durationVariance = durationVariance;
        return this;
    }

    public TaskBuilder setEarlyFinish(LocalDateTime earlyFinish) {
        this.earlyFinish = earlyFinish;
        return this;
    }

    public TaskBuilder setEarlyStart(LocalDateTime earlyStart) {
        this.earlyStart = earlyStart;
        return this;
    }

    public TaskBuilder setFinish(LocalDateTime finish) {
        this.finish = finish;
        return this;
    }

    public TaskBuilder setFinishText(String finishText) {
        this.finishText = finishText;
        return this;
    }

    public TaskBuilder setFinishVariance(Task.Duration finishVariance) {
        this.finishVariance = finishVariance;
        return this;
    }

    public TaskBuilder setFixedCost(BigDecimal fixedCost) {
        this.fixedCost = fixedCost;
        return this;
    }

    public TaskBuilder setFreeSlack(Task.Duration freeSlack) {
        this.freeSlack = freeSlack;
        return this;
    }

    public TaskBuilder setHideBar(boolean hideBar) {
        this.hideBar = hideBar;
        return this;
    }

    public TaskBuilder setLateFinish(LocalDateTime lateFinish) {
        this.lateFinish = lateFinish;
        return this;
    }

    public TaskBuilder setLateStart(LocalDateTime lateStart) {
        this.lateStart = lateStart;
        return this;
    }

    public TaskBuilder setLinkedFields(boolean linkedFields) {
        this.linkedFields = linkedFields;
        return this;
    }

    public TaskBuilder setMarked(boolean marked) {
        this.marked = marked;
        return this;
    }

    public TaskBuilder setMilestone(boolean milestone) {
        this.milestone = milestone;
        return this;
    }

    public TaskBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public TaskBuilder setNotes(String notes) {
        this.notes = notes;
        return this;
    }

    public TaskBuilder setObjects(Integer objects) {
        this.objects = objects;
        return this;
    }

    public TaskBuilder setOutlineLevel(Integer outlineLevel) {
        this.outlineLevel = outlineLevel;
        return this;
    }

    public TaskBuilder setOutlineNumber(Integer outlineNumber) {
        this.outlineNumber = outlineNumber;
        return this;
    }

    public TaskBuilder setPredecessors(List<Task.Predecessor> predecessors) {
        this.predecessors = predecessors;
        return this;
    }

    public TaskBuilder setPriority(Priority priority) {
        this.priority = priority;
        return this;
    }

    public TaskBuilder setProject(String project) {
        this.project = project;
        return this;
    }

    public TaskBuilder setRemainingCost(BigDecimal remainingCost) {
        this.remainingCost = remainingCost;
        return this;
    }

    public TaskBuilder setRemainingDuration(Task.Duration remainingDuration) {
        this.remainingDuration = remainingDuration;
        return this;
    }

    public TaskBuilder setRemainingWork(Task.Duration remainingWork) {
        this.remainingWork = remainingWork;
        return this;
    }

    public TaskBuilder setResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }

    public TaskBuilder setResourceInitials(String resourceInitials) {
        this.resourceInitials = resourceInitials;
        return this;
    }

    public TaskBuilder setResourceNames(String resourceNames) {
        this.resourceNames = resourceNames;
        return this;
    }

    public TaskBuilder setResume(LocalDateTime resume) {
        this.resume = resume;
        return this;
    }

    public TaskBuilder setRollup(boolean rollup) {
        this.rollup = rollup;
        return this;
    }

    public TaskBuilder setStart(LocalDateTime start) {
        this.start = start;
        return this;
    }

    public TaskBuilder setStartText(String startText) {
        this.startText = startText;
        return this;
    }

    public TaskBuilder setStartVariance(Task.Duration startVariance) {
        this.startVariance = startVariance;
        return this;
    }

    public TaskBuilder setStop(LocalDateTime stop) {
        this.stop = stop;
        return this;
    }

    public TaskBuilder setSubProjectName(String subProjectName) {
        this.subProjectName = subProjectName;
        return this;
    }

    public TaskBuilder setSummary(boolean summary) {
        this.summary = summary;
        return this;
    }

    public TaskBuilder setEarnedValueScheduleVariance(BigDecimal earnedValueScheduleVariance) {
        this.earnedValueScheduleVariance = earnedValueScheduleVariance;
        return this;
    }

    public TaskBuilder setOutlineCode(String outlineCode) {
        this.outlineCode = outlineCode;
        return this;
    }

    public TaskBuilder setTotalSlack(Task.Duration totalSlack) {
        this.totalSlack = totalSlack;
        return this;
    }

    public TaskBuilder setUniqueID(Integer uniqueID) {
        this.uniqueID = uniqueID;
        return this;
    }

    public TaskBuilder setUpdateNeeded(boolean updateNeeded) {
        this.updateNeeded = updateNeeded;
        return this;
    }

    public TaskBuilder setWorkBreakdownStructureCode(String workBreakdownStructureCode) {
        this.workBreakdownStructureCode = workBreakdownStructureCode;
        return this;
    }

    public TaskBuilder setWork(Task.Duration work) {
        this.work = work;
        return this;
    }

    public TaskBuilder setWorkVariance(Task.Duration workVariance) {
        this.workVariance = workVariance;
        return this;
    }

    public TaskBuilder setParentTaskID(Integer parentTaskID) {
        this.parentTaskID = parentTaskID;
        return this;
    }

    public TaskBuilder setChildTasks(List<Task> childTasks) {
        this.childTasks = childTasks;
        return this;
    }

    public TaskBuilder setEstimated(boolean estimated) {
        this.estimated = estimated;
        return this;
    }

    public TaskBuilder setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
        return this;
    }

    public TaskBuilder setType(TaskType type) {
        this.type = type;
        return this;
    }

    public TaskBuilder setNullTask(boolean nullTask) {
        this.nullTask = nullTask;
        return this;
    }

    public TaskBuilder setWbsLevel(String wbsLevel) {
        this.wbsLevel = wbsLevel;
        return this;
    }

    public TaskBuilder setResumeValid(boolean resumeValid) {
        this.resumeValid = resumeValid;
        return this;
    }

    public TaskBuilder setRecurring(boolean recurring) {
        this.recurring = recurring;
        return this;
    }

    public TaskBuilder setOverAllocated(boolean overAllocated) {
        this.overAllocated = overAllocated;
        return this;
    }

    public TaskBuilder setSubProjectTaskID(Integer subProjectTaskID) {
        this.subProjectTaskID = subProjectTaskID;
        return this;
    }

    public TaskBuilder setSubProjectTaskUniqueID(Integer subProjectTaskUniqueID) {
        this.subProjectTaskUniqueID = subProjectTaskUniqueID;
        return this;
    }

    public TaskBuilder setSubProjectTasksUniqueIDOffset(Integer subProjectTasksUniqueIDOffset) {
        this.subProjectTasksUniqueIDOffset = subProjectTasksUniqueIDOffset;
        return this;
    }

    public TaskBuilder setSubProjectReadOnly(boolean subProjectReadOnly) {
        this.subProjectReadOnly = subProjectReadOnly;
        return this;
    }

    public TaskBuilder setExternalTask(boolean externalTask) {
        this.externalTask = externalTask;
        return this;
    }

    public TaskBuilder setExternalTaskProject(String externalTaskProject) {
        this.externalTaskProject = externalTaskProject;
        return this;
    }

    public TaskBuilder setAcwp(BigDecimal acwp) {
        this.acwp = acwp;
        return this;
    }

    public TaskBuilder setLevelingDelayFormat(TimeUnit levelingDelayFormat) {
        this.levelingDelayFormat = levelingDelayFormat;
        return this;
    }

    public TaskBuilder setIgnoreResourceCalendar(boolean ignoreResourceCalendar) {
        this.ignoreResourceCalendar = ignoreResourceCalendar;
        return this;
    }

    public TaskBuilder setPhysicalPercentComplete(BigDecimal physicalPercentComplete) {
        this.physicalPercentComplete = physicalPercentComplete;
        return this;
    }

    public TaskBuilder setEarnedValueMethod(EarnedValueMethod earnedValueMethod) {
        this.earnedValueMethod = earnedValueMethod;
        return this;
    }

    public TaskBuilder setActualWorkProtected(Task.Duration actualWorkProtected) {
        this.actualWorkProtected = actualWorkProtected;
        return this;
    }

    public TaskBuilder setActualOvertimeWorkProtected(Task.Duration actualOvertimeWorkProtected) {
        this.actualOvertimeWorkProtected = actualOvertimeWorkProtected;
        return this;
    }

    public TaskBuilder setRegularWork(Task.Duration regularWork) {
        this.regularWork = regularWork;
        return this;
    }

    public TaskBuilder setEffortDriven(boolean effortDriven) {
        this.effortDriven = effortDriven;
        return this;
    }

    public TaskBuilder setDate(boolean date) {
        this.date = date;
        return this;
    }

    public TaskBuilder setOvertimeCost(BigDecimal overtimeCost) {
        this.overtimeCost = overtimeCost;
        return this;
    }

    public TaskBuilder setActualOvertimeCost(BigDecimal actualOvertimeCost) {
        this.actualOvertimeCost = actualOvertimeCost;
        return this;
    }

    public TaskBuilder setActualOvertimeWork(Task.Duration actualOvertimeWork) {
        this.actualOvertimeWork = actualOvertimeWork;
        return this;
    }

    public TaskBuilder setFixedCostAccrual(AccrueType fixedCostAccrual) {
        this.fixedCostAccrual = fixedCostAccrual;
        return this;
    }

    public TaskBuilder setHyperlink(String hyperlink) {
        this.hyperlink = hyperlink;
        return this;
    }

    public TaskBuilder setHyperlinkAddress(String hyperlinkAddress) {
        this.hyperlinkAddress = hyperlinkAddress;
        return this;
    }

    public TaskBuilder setHyperlinkSubAddress(String hyperlinkSubAddress) {
        this.hyperlinkSubAddress = hyperlinkSubAddress;
        return this;
    }

    public TaskBuilder setLevelAssignments(boolean levelAssignments) {
        this.levelAssignments = levelAssignments;
        return this;
    }

    public TaskBuilder setLevelingCanSplit(boolean levelingCanSplit) {
        this.levelingCanSplit = levelingCanSplit;
        return this;
    }

    public TaskBuilder setOvertimeWork(Task.Duration overtimeWork) {
        this.overtimeWork = overtimeWork;
        return this;
    }

    public TaskBuilder setPreleveledStart(LocalDateTime preleveledStart) {
        this.preleveledStart = preleveledStart;
        return this;
    }

    public TaskBuilder setPreleveledFinish(LocalDateTime preleveledFinish) {
        this.preleveledFinish = preleveledFinish;
        return this;
    }

    public TaskBuilder setRemainingOvertimeWork(Task.Duration remainingOvertimeWork) {
        this.remainingOvertimeWork = remainingOvertimeWork;
        return this;
    }

    public TaskBuilder setRemainingOvertimeCost(BigDecimal remainingOvertimeCost) {
        this.remainingOvertimeCost = remainingOvertimeCost;
        return this;
    }

    public TaskBuilder setCalendar(Task.ProjectCalendar calendar) {
        this.calendar = calendar;
        return this;
    }

    public TaskBuilder setExpanded(boolean expanded) {
        this.expanded = expanded;
        return this;
    }

    public TaskBuilder setStartSlack(Task.Duration startSlack) {
        this.startSlack = startSlack;
        return this;
    }

    public TaskBuilder setFinishSlack(Task.Duration finishSlack) {
        this.finishSlack = finishSlack;
        return this;
    }

    public TaskBuilder setSplits(List<Task.DateRange> splits) {
        this.splits = splits;
        return this;
    }

    public TaskBuilder setSplitCompleteDuration(LocalDateTime splitCompleteDuration) {
        this.splitCompleteDuration = splitCompleteDuration;
        return this;
    }

    public TaskBuilder setSubProject(Task.SubProject subProject) {
        this.subProject = subProject;
        return this;
    }

    public TaskBuilder setEnterpriseCost(BigDecimal enterpriseCost) {
        this.enterpriseCost = enterpriseCost;
        return this;
    }

    public TaskBuilder setEnterpriseDate(LocalDateTime enterpriseDate) {
        this.enterpriseDate = enterpriseDate;
        return this;
    }

    public TaskBuilder setEnterpriseDuration(Task.Duration enterpriseDuration) {
        this.enterpriseDuration = enterpriseDuration;
        return this;
    }

    public TaskBuilder setEnterpriseFlag(boolean enterpriseFlag) {
        this.enterpriseFlag = enterpriseFlag;
        return this;
    }

    public TaskBuilder setEnterpriseNumber(Double enterpriseNumber) {
        this.enterpriseNumber = enterpriseNumber;
        return this;
    }

    public TaskBuilder setEnterpriseText(String enterpriseText) {
        this.enterpriseText = enterpriseText;
        return this;
    }

    public TaskBuilder setSummaryProgress(LocalDateTime summaryProgress) {
        this.summaryProgress = summaryProgress;
        return this;
    }

    public TaskBuilder setCompleteThrough(LocalDateTime completeThrough) {
        this.completeThrough = completeThrough;
        return this;
    }

    public TaskBuilder setGuid(UUID guid) {
        this.guid = guid;
        return this;
    }

    public TaskBuilder setTaskMode(TaskMode taskMode) {
        this.taskMode = taskMode;
        return this;
    }

    public TaskBuilder setBaselineEstimatedDuration(Task.Duration baselineEstimatedDuration) {
        this.baselineEstimatedDuration = baselineEstimatedDuration;
        return this;
    }

    public TaskBuilder setBaselineEstimatedStart(Task.Duration baselineEstimatedStart) {
        this.baselineEstimatedStart = baselineEstimatedStart;
        return this;
    }

    public TaskBuilder setBaselineEstimatedFinish(Task.Duration baselineEstimatedFinish) {
        this.baselineEstimatedFinish = baselineEstimatedFinish;
        return this;
    }

    public TaskBuilder setBaselineFixedCost(BigDecimal baselineFixedCost) {
        this.baselineFixedCost = baselineFixedCost;
        return this;
    }

    public TaskBuilder setBaselineFixedCostAccrual(AccrueType baselineFixedCostAccrual) {
        this.baselineFixedCostAccrual = baselineFixedCostAccrual;
        return this;
    }

    public Task createTask() {
        return new Task(id, active, percentageComplete, percentageWorkComplete, actualCost, actualDuration, actualFinish, actualStart, actualWork, baselineCost, baselineDuration, baselineDurationText, baselineFinish, baselineFinishText, baselineStart, baselineStartText, baselineWork, budgetedCostOfWorkPerformed, budgetedCostOfWorkScheduled, confirmed, constraintDate, constraintType, contact, cost, costVariance, createDate, critical, earnedValueCostVariance, levelingDelay, duration, durationText, durationVariance, earlyFinish, earlyStart, finish, finishText, finishVariance, fixedCost, freeSlack, hideBar, lateFinish, lateStart, linkedFields, marked, milestone, name, notes, objects, outlineLevel, outlineNumber, predecessors, priority, project, remainingCost, remainingDuration, remainingWork, resourceGroup, resourceInitials, resourceNames, resume, rollup, start, startText, startVariance, stop, subProjectName, summary, earnedValueScheduleVariance, outlineCode, totalSlack, uniqueID, updateNeeded, workBreakdownStructureCode, work, workVariance, parentTaskID, childTasks, estimated, deadline, type, nullTask, wbsLevel, resumeValid, recurring, overAllocated, subProjectTaskID, subProjectTaskUniqueID, subProjectTasksUniqueIDOffset, subProjectReadOnly, externalTask, externalTaskProject, acwp, levelingDelayFormat, ignoreResourceCalendar, physicalPercentComplete, earnedValueMethod, actualWorkProtected, actualOvertimeWorkProtected, regularWork, effortDriven, date, overtimeCost, actualOvertimeCost, actualOvertimeWork, fixedCostAccrual, hyperlink, hyperlinkAddress, hyperlinkSubAddress, levelAssignments, levelingCanSplit, overtimeWork, preleveledStart, preleveledFinish, remainingOvertimeWork, remainingOvertimeCost, calendar, expanded, startSlack, finishSlack, splits, splitCompleteDuration, subProject, enterpriseCost, enterpriseDate, enterpriseDuration, enterpriseFlag, enterpriseNumber, enterpriseText, summaryProgress, completeThrough, guid, taskMode, baselineEstimatedDuration, baselineEstimatedStart, baselineEstimatedFinish, baselineFixedCost, baselineFixedCostAccrual);
    }
}