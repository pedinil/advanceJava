package com.example.websocketdemo.service;

import com.example.websocketdemo.model.LiveQuizQuestionEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface QuestionService {

    public void SendBoardCase(Optional<LiveQuizQuestionEntity> liveQuizQuestionEntity);
}
