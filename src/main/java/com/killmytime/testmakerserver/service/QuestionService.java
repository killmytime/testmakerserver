package com.killmytime.testmakerserver.service;

import com.killmytime.testmakerserver.domain.Question;
import com.killmytime.testmakerserver.domain.QuestionData;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface QuestionService {
    public List<QuestionData> getAllQuestions();
    public QuestionData getQuestionByID(int questionId);
    public List<QuestionData> getAllQuestionsByAuthor(String authorName);
}
