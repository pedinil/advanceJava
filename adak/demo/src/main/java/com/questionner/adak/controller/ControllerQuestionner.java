package com.questionner.adak.controller;

import com.questionner.adak.repository.QuestionnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerQuestionner {


    @Autowired
    private QuestionnerRepository questionnerRepository;



    @GetMapping(path = "/getlistquestion")
    public ResponseEntity<?> getlistquestion() {

        return ResponseEntity.ok(questionnerRepository.findAll());



    }
}
