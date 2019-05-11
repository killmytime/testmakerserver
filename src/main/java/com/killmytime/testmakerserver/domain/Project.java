package com.killmytime.testmakerserver.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Project {
    private int id;
    private Timestamp createdOn;
    private Timestamp updatedOn;
    private String customField1;
    private String customField2;
    private String customField3;
    private Timestamp exportedOn;
    private Date finishDate;
    private String name;
    private Date startDate;
    private Integer exportedBy;
    private int facilitatorId;
    private int statusId;
    private Integer syllabusId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "created_on")
    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    @Basic
    @Column(name = "updated_on")
    public Timestamp getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Timestamp updatedOn) {
        this.updatedOn = updatedOn;
    }

    @Basic
    @Column(name = "custom_field1")
    public String getCustomField1() {
        return customField1;
    }

    public void setCustomField1(String customField1) {
        this.customField1 = customField1;
    }

    @Basic
    @Column(name = "custom_field2")
    public String getCustomField2() {
        return customField2;
    }

    public void setCustomField2(String customField2) {
        this.customField2 = customField2;
    }

    @Basic
    @Column(name = "custom_field3")
    public String getCustomField3() {
        return customField3;
    }

    public void setCustomField3(String customField3) {
        this.customField3 = customField3;
    }

    @Basic
    @Column(name = "exported_on")
    public Timestamp getExportedOn() {
        return exportedOn;
    }

    public void setExportedOn(Timestamp exportedOn) {
        this.exportedOn = exportedOn;
    }

    @Basic
    @Column(name = "finish_date")
    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "start_date")
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "exported_by")
    public Integer getExportedBy() {
        return exportedBy;
    }

    public void setExportedBy(Integer exportedBy) {
        this.exportedBy = exportedBy;
    }

    @Basic
    @Column(name = "facilitator_id")
    public int getFacilitatorId() {
        return facilitatorId;
    }

    public void setFacilitatorId(int facilitatorId) {
        this.facilitatorId = facilitatorId;
    }

    @Basic
    @Column(name = "status_id")
    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    @Basic
    @Column(name = "syllabus_id")
    public Integer getSyllabusId() {
        return syllabusId;
    }

    public void setSyllabusId(Integer syllabusId) {
        this.syllabusId = syllabusId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return id == project.id &&
                facilitatorId == project.facilitatorId &&
                statusId == project.statusId &&
                Objects.equals(createdOn, project.createdOn) &&
                Objects.equals(updatedOn, project.updatedOn) &&
                Objects.equals(customField1, project.customField1) &&
                Objects.equals(customField2, project.customField2) &&
                Objects.equals(customField3, project.customField3) &&
                Objects.equals(exportedOn, project.exportedOn) &&
                Objects.equals(finishDate, project.finishDate) &&
                Objects.equals(name, project.name) &&
                Objects.equals(startDate, project.startDate) &&
                Objects.equals(exportedBy, project.exportedBy) &&
                Objects.equals(syllabusId, project.syllabusId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createdOn, updatedOn, customField1, customField2, customField3, exportedOn, finishDate, name, startDate, exportedBy, facilitatorId, statusId, syllabusId);
    }
}
