package com.killmytime.testmakerserver.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "project_status", schema = "testmaker")
public class ProjectStatus {
    private int id;
    private Timestamp createdOn;
    private Timestamp updatedOn;
    private boolean isFinish;
    private boolean isStart;
    private String name;

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
    @Column(name = "is_finish")
    public boolean isFinish() {
        return isFinish;
    }

    public void setFinish(boolean finish) {
        isFinish = finish;
    }

    @Basic
    @Column(name = "is_start")
    public boolean isStart() {
        return isStart;
    }

    public void setStart(boolean start) {
        isStart = start;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjectStatus that = (ProjectStatus) o;
        return id == that.id &&
                isFinish == that.isFinish &&
                isStart == that.isStart &&
                Objects.equals(createdOn, that.createdOn) &&
                Objects.equals(updatedOn, that.updatedOn) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createdOn, updatedOn, isFinish, isStart, name);
    }
}
