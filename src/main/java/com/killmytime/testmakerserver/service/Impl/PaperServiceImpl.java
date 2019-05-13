package com.killmytime.testmakerserver.service.Impl;

import com.killmytime.testmakerserver.domain.Paper;
import com.killmytime.testmakerserver.domain.PaperRepository;
import com.killmytime.testmakerserver.domain.QuestionData;
import com.killmytime.testmakerserver.service.PaperService;
import com.killmytime.testmakerserver.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PaperServiceImpl implements PaperService {
    @Autowired
    PaperRepository paperRepository;
    @Autowired
    QuestionService questionService;
    @Override
    public List<QuestionData> getPaperById(int id) {
        String questionIds;
        try {
            questionIds = paperRepository.getPaperById(id).getQuestionIds();
            String[] str = questionIds.split(",");

            List<QuestionData> questionData = new ArrayList<>();
            for (String index : str)
                questionData.add(questionService.getQuestionByID(Integer.parseInt(index)));
            // Integer.parseInt(str)
            return questionData;
        } catch (Exception e) {
            return new ArrayList<>();
        }

    }
    @Override
    public List<Paper> getAllPapers() {
        return (List<Paper>) paperRepository.findAll();
    }

    @Override
    public Paper generatePaper(Paper paper) {
        return paperRepository.save(paper);
    }

    @Override
    public Paper modifyPaper(Paper paper) {
        Paper paper0=paperRepository.getPaperById(paper.getId());
        paper0.setPaperName(paper.getPaperName());
        paper0.setQuestionIds(paper.getQuestionIds());
        return paperRepository.save(paper0);
    }
}
