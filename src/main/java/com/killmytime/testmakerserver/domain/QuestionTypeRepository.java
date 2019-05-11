package com.killmytime.testmakerserver.domain;

import org.springframework.data.repository.CrudRepository;

public interface QuestionTypeRepository extends CrudRepository<QuestionType,Long> {
    public QuestionType getQuestionTypeById(int id);
}
