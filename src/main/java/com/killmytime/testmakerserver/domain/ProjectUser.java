package com.killmytime.testmakerserver.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "project_user", schema = "testmaker")
public class ProjectUser {
    private int projectId;
    private int userId;

    @Basic
    @Column(name = "PROJECT_ID")
    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    @Basic
    @Column(name = "USER_ID")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjectUser that = (ProjectUser) o;
        return projectId == that.projectId &&
                userId == that.userId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, userId);
    }

    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
