package com.example.websocketdemo.service;


import com.example.websocketdemo.model.LiveQuizAnswerData;
import com.example.websocketdemo.model.LiveQuizQuestionEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private SimpMessageSendingOperations messagingTemplate;



    public void SendBoardCase(Optional<LiveQuizQuestionEntity> liveQuizQuestionEntity) {


       messagingTemplate.convertAndSend("/topic/greetings", liveQuizQuestionEntity);

    }
}
