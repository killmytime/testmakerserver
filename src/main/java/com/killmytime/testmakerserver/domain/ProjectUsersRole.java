package com.killmytime.testmakerserver.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "project_users_role", schema = "testmaker", catalog = "")
public class ProjectUsersRole {
    private int projectUserId;
    private int roleId;
    private String id;

    @Basic
    @Column(name = "project_user_id")
    public int getProjectUserId() {
        return projectUserId;
    }

    public void setProjectUserId(int projectUserId) {
        this.projectUserId = projectUserId;
    }

    @Basic
    @Column(name = "role_id")
    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjectUsersRole that = (ProjectUsersRole) o;
        return projectUserId == that.projectUserId &&
                roleId == that.roleId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectUserId, roleId);
    }

    @Basic
    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
