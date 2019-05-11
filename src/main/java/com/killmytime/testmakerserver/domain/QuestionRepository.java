package com.killmytime.testmakerserver.domain;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface QuestionRepository extends CrudRepository<Question,Long> {
    public Question findQuestionById(int id);
    public List<Question> findAllByAuthorId(int authorId);
}
