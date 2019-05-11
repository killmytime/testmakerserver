package com.killmytime.testmakerserver.service;

import com.killmytime.testmakerserver.domain.Paper;
import com.killmytime.testmakerserver.domain.QuestionData;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PaperService {
    List<QuestionData> getPaperById(int id);
    List<Paper> getAllPapers();
    Paper generatePaper(Paper paper);
    Paper modifyPaper(Paper paper);
}
