package com.killmytime.testmakerserver.web;

import com.killmytime.testmakerserver.domain.Paper;
import com.killmytime.testmakerserver.domain.QuestionData;
import com.killmytime.testmakerserver.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/paper")
public class paperController {
    @Autowired
    PaperService paperService;
    @GetMapping(path = "/generate")
    public @ResponseBody
    Paper generatePaper(@Valid Paper paper){
        return paperService.generatePaper(paper);
    }
    @GetMapping(path = "/all")
    public @ResponseBody
    List<Paper> getAllPaper(){
        return paperService.getAllPapers();
    }
    @GetMapping(path = "/get_one")
    public @ResponseBody
    List<QuestionData> getPaperByOne(@RequestParam int id){
        return paperService.getPaperById(id);
    }
    @GetMapping(path = "/modify")
    public @ResponseBody
    Paper modify(@Valid Paper paper){
        return paperService.modifyPaper(paper);
    }
}
