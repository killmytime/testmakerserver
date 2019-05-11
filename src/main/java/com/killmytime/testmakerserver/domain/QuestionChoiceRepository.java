package com.killmytime.testmakerserver.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface QuestionChoiceRepository extends CrudRepository<QuestionChoice,Long> {
    public List<QuestionChoice> getQuestionChoicesByQuestionId(int questionId);
}
