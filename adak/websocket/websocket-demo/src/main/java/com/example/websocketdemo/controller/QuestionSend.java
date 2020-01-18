package com.example.websocketdemo.controller;


import com.example.websocketdemo.model.LiveQuizQuestionEntity;
import com.example.websocketdemo.service.LiveQuizQuestionService;
import com.example.websocketdemo.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class QuestionSend {

    @Autowired
    private QuestionService serviceQuestion;

    @Autowired
    private LiveQuizQuestionService liveQuizQuestionService;

    @GetMapping("/getResponse/{id}")
    private ResponseEntity<?> boardCase(@PathVariable Integer id)
    {

        Optional<LiveQuizQuestionEntity> liveQuizQuestionEntity =liveQuizQuestionService.getLiveQuestion(id);

        if(liveQuizQuestionEntity.isPresent()) {
            serviceQuestion.SendBoardCase(liveQuizQuestionEntity);
        }

        return ResponseEntity.ok(null);



    }
}
