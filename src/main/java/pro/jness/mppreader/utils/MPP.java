package pro.jness.mppreader.utils;

import com.fasterxml.jackson.annotation.JsonProperty;
import net.sf.mpxj.RelationType;
import net.sf.mpxj.TimeUnit;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class MPP {
    private ProjectProperties projectProperties;
    private List<Task> tasks;

    public ProjectProperties getProjectProperties() {
        return projectProperties;
    }

    public void setProjectProperties(ProjectProperties projectProperties) {
        this.projectProperties = projectProperties;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public static class ProjectProperties {
        private String author;
        private String lastAuthor;
        private String name;
        private String projectTitle;
        private String company;
        private String comments;
        private String shortApplicationName;
        private String fullApplicationName;
        private Integer applicationVersion;
        private String currencySymbol;
        private String currencyCode;
        private String defaultCalendarName;
        private String mpxProgramName;
        @JsonProperty("AMText")
        private String amText;
        @JsonProperty("PMText")
        private String pmText;
        private String category;
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
        private LocalDateTime startDate;
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
        private LocalDateTime finishDate;

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getLastAuthor() {
            return lastAuthor;
        }

        public void setLastAuthor(String lastAuthor) {
            this.lastAuthor = lastAuthor;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getProjectTitle() {
            return projectTitle;
        }

        public void setProjectTitle(String projectTitle) {
            this.projectTitle = projectTitle;
        }

        public String getShortApplicationName() {
            return shortApplicationName;
        }

        public void setShortApplicationName(String shortApplicationName) {
            this.shortApplicationName = shortApplicationName;
        }

        public String getFullApplicationName() {
            return fullApplicationName;
        }

        public void setFullApplicationName(String fullApplicationName) {
            this.fullApplicationName = fullApplicationName;
        }

        public Integer getApplicationVersion() {
            return applicationVersion;
        }

        public void setApplicationVersion(Integer applicationVersion) {
            this.applicationVersion = applicationVersion;
        }

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public String getComments() {
            return comments;
        }

        public void setComments(String comments) {
            this.comments = comments;
        }

        public String getCurrencySymbol() {
            return currencySymbol;
        }

        public void setCurrencySymbol(String currencySymbol) {
            this.currencySymbol = currencySymbol;
        }

        public String getCurrencyCode() {
            return currencyCode;
        }

        public void setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
        }

        public String getDefaultCalendarName() {
            return defaultCalendarName;
        }

        public void setDefaultCalendarName(String defaultCalendarName) {
            this.defaultCalendarName = defaultCalendarName;
        }

        public String getMpxProgramName() {
            return mpxProgramName;
        }

        public void setMpxProgramName(String mpxProgramName) {
            this.mpxProgramName = mpxProgramName;
        }

        public String getAmText() {
            return amText;
        }

        public void setAmText(String amText) {
            this.amText = amText;
        }

        public String getPmText() {
            return pmText;
        }

        public void setPmText(String pmText) {
            this.pmText = pmText;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public LocalDateTime getStartDate() {
            return startDate;
        }

        public void setStartDate(LocalDateTime startDate) {
            this.startDate = startDate;
        }

        public LocalDateTime getFinishDate() {
            return finishDate;
        }

        public void setFinishDate(LocalDateTime finishDate) {
            this.finishDate = finishDate;
        }
    }

    public static class Task {
        private Duration duration;
        private List<Predecessor> predecessors;

        public Duration getDuration() {
            return duration;
        }

        public void setDuration(Duration duration) {
            this.duration = duration;
        }

        public List<Predecessor> getPredecessors() {
            return predecessors;
        }

        public void setPredecessors(List<Predecessor> predecessors) {
            this.predecessors = predecessors;
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
    }
}
