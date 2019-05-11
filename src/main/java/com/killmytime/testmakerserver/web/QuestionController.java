package com.killmytime.testmakerserver.web;


import com.killmytime.testmakerserver.domain.Question;
import com.killmytime.testmakerserver.domain.QuestionData;
import com.killmytime.testmakerserver.domain.QuestionRepository;
import com.killmytime.testmakerserver.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/question")
public class QuestionController {
    @Autowired
    QuestionRepository questionRepository;
    @Autowired
    QuestionService questionService;
    @GetMapping(path = "/all")
    public @ResponseBody
    List<QuestionData> getQuestions() {
        return questionService.getAllQuestions();
    }
    @GetMapping(path = "/detail")
    public @ResponseBody
    QuestionData getQuestionById(@RequestParam int id){
        return questionService.getQuestionByID(id);
    }
}
