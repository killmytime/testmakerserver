package com.killmytime.testmakerserver.service;

import com.killmytime.testmakerserver.domain.Paper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PaperService {
    Paper getPaperById(int id);
    List<Paper> getAllPapers();
    Paper generatePaper(Paper paper);
    Paper modifyPaper(Paper paper);
}
