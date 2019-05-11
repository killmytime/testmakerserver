package com.killmytime.testmakerserver.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "knowledge_point", schema = "testmaker")
public class KnowledgePoint {
    private int id;
    private Timestamp createdOn;
    private Timestamp updatedOn;
    private String kLevel;
    private String number;
    private short score;
    private String title;
    private int chapterId;

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
    @Column(name = "k_level")
    public String getkLevel() {
        return kLevel;
    }

    public void setkLevel(String kLevel) {
        this.kLevel = kLevel;
    }

    @Basic
    @Column(name = "number")
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Basic
    @Column(name = "score")
    public short getScore() {
        return score;
    }

    public void setScore(short score) {
        this.score = score;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "chapter_id")
    public int getChapterId() {
        return chapterId;
    }

    public void setChapterId(int chapterId) {
        this.chapterId = chapterId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KnowledgePoint that = (KnowledgePoint) o;
        return id == that.id &&
                score == that.score &&
                chapterId == that.chapterId &&
                Objects.equals(createdOn, that.createdOn) &&
                Objects.equals(updatedOn, that.updatedOn) &&
                Objects.equals(kLevel, that.kLevel) &&
                Objects.equals(number, that.number) &&
                Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createdOn, updatedOn, kLevel, number, score, title, chapterId);
    }
}
