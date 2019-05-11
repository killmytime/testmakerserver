package com.killmytime.testmakerserver.domain;

import java.util.List;

public class QuestionData {
    private int id;
    private String created_on;
    private String updated_on;
    private String authoring_finish_date;
    private String authoring_start_date;
    private String reviewing_finish_date;
    private String reviewing_start_date;
    private int difficulty;
    private String scenario;
    private int score;
    private String stem;
    private String author;
    private String language;
    private String knowledgePoint;
    private String type;
    private String remark;
    private List<QuestionChoice> questionChoices;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreated_on() {
        return created_on;
    }

    public void setCreated_on(String created_on) {
        this.created_on = created_on;
    }

    public String getUpdated_on() {
        return updated_on;
    }

    public void setUpdated_on(String updated_on) {
        this.updated_on = updated_on;
    }

    public String getAuthoring_finish_date() {
        return authoring_finish_date;
    }

    public void setAuthoring_finish_date(String authoring_finish_date) {
        this.authoring_finish_date = authoring_finish_date;
    }

    public String getAuthoring_start_date() {
        return authoring_start_date;
    }

    public void setAuthoring_start_date(String authoring_start_date) {
        this.authoring_start_date = authoring_start_date;
    }

    public String getReviewing_finish_date() {
        return reviewing_finish_date;
    }

    public void setReviewing_finish_date(String reviewing_finish_date) {
        this.reviewing_finish_date = reviewing_finish_date;
    }

    public String getReviewing_start_date() {
        return reviewing_start_date;
    }

    public void setReviewing_start_date(String reviewing_start_date) {
        this.reviewing_start_date = reviewing_start_date;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public String getScenario() {
        return scenario;
    }

    public void setScenario(String scenario) {
        this.scenario = scenario;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getStem() {
        return stem;
    }

    public void setStem(String stem) {
        this.stem = stem;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getKnowledgePoint() {
        return knowledgePoint;
    }

    public void setKnowledgePoint(String knowledgePoint) {
        this.knowledgePoint = knowledgePoint;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<QuestionChoice> getQuestionChoices() {
        return questionChoices;
    }

    public void setQuestionChoices(List<QuestionChoice> questionChoices) {
        this.questionChoices = questionChoices;
    }
}
