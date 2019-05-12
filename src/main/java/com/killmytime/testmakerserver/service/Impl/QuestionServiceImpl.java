package com.killmytime.testmakerserver.service.Impl;

import com.killmytime.testmakerserver.domain.*;
import com.killmytime.testmakerserver.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    QuestionRepository questionRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    KnowledgePointRepository knowledgePointRepository;
    @Autowired
    QuestionTypeRepository questionTypeRepository;
    @Autowired
    QuestionChoiceRepository questionChoiceRepository;

    private QuestionData questionToQuestionData(Question question){
        if (question==null) return null;
        QuestionData questionData=new QuestionData();
        questionData.setId(question.getId());
        questionData.setCreated_on(question.getCreatedOn().toString());
        questionData.setUpdated_on(question.getUpdatedOn().toString());
        questionData.setAuthoring_start_date(question.getAuthoringStartDate().toString());
        questionData.setAuthoring_finish_date(question.getAuthoringFinishDate().toString());
        questionData.setDifficulty(question.getDifficulty());
        questionData.setScenario(question.getScenario());
        questionData.setScore(question.getScore());
        questionData.setStem(question.getStem());
        questionData.setAuthor(userRepository.findUserById(question.getAuthorId()).getFullName());
        questionData.setKnowledgePoint(knowledgePointRepository.getKnowledgePointById(question.getKnowledgePoint()).getTitle());
        questionData.setType(questionTypeRepository.getQuestionTypeById(question.getType()).getName());
        questionData.setRemark(question.getRemark());
        questionData.setQuestionChoices(questionChoiceRepository.getQuestionChoicesByQuestionId(question.getId()));
        return questionData;
    }


    @Override
    public List<QuestionData> getAllQuestions() {
        List<Question> questions= (List<Question>) questionRepository.findAll();
        List<QuestionData> questionDatas=new ArrayList<>();
        for(Question question:questions){
            questionDatas.add(questionToQuestionData(question));
        }
        return questionDatas;
    }

    @Override
    public QuestionData getQuestionByID(int quesionId) {
        Question question=questionRepository.findQuestionById(quesionId);
        return questionToQuestionData(question);
    }

    @Override
    public List<QuestionData> getAllQuestionsByAuthor(String authorName) {
        return null;
    }
}
