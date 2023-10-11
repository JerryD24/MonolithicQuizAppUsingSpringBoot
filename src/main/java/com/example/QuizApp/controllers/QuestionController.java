package com.example.QuizApp.controllers;

import com.example.QuizApp.model.Question;
import com.example.QuizApp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("questions")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping("difficultylevel/{diff}")
    public ResponseEntity<List<Question>> getQuestionByDifficultylevel(@PathVariable String diff){
        return questionService.getQuestionByDifficultylevel(diff);
    }

    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
    }
}
