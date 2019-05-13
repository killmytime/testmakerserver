package com.killmytime.testmakerserver.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "paper", schema = "testmaker")
public class  Paper {
    private int id;
    private String paperName;
    private String questionIds;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "paper_name")
    public String getPaperName() {
        return paperName;
    }

    public void setPaperName(String paperName) {
        this.paperName = paperName;
    }

    @Basic
    @Column(name = "questionIds")
    public String getQuestionIds() {
        return questionIds;
    }

    public void setQuestionIds(String questionIds) {
        this.questionIds = questionIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paper paper = (Paper) o;
        return id == paper.id &&
                Objects.equals(paperName, paper.paperName) &&
                Objects.equals(questionIds, paper.questionIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, paperName, questionIds);
    }
}
