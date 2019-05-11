package com.killmytime.testmakerserver.service.Impl;

import com.killmytime.testmakerserver.domain.Paper;
import com.killmytime.testmakerserver.domain.PaperRepository;
import com.killmytime.testmakerserver.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PaperServiceImpl implements PaperService {
    @Autowired
    PaperRepository paperRepository;
    @Override
    public Paper getPaperById(int id) {
        return paperRepository.getPaperById(id);
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
