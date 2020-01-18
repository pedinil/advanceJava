package com.example.websocketdemo.controller;

import com.example.websocketdemo.model.ChatMessage;
import com.example.websocketdemo.model.LiveQuizAnswerData;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;


@Controller
public class ChatController {

 
    @MessageMapping("/chat.sendMessage")
    @SendTo("/topic/public")
    public LiveQuizAnswerData sendMessage(@Payload ChatMessage chatMessage) throws InterruptedException {

        Thread.sleep(1000); // simulated delay
            LiveQuizAnswerData livequizanswerdata = new LiveQuizAnswerData();
            livequizanswerdata.setQuestion("test");
            livequizanswerdata.setOptionOne("1");
            livequizanswerdata.setOptionTwo("2");
            return livequizanswerdata;

    }

    @MessageMapping("/chat.addUser")
    @SendTo("/topic/public")
    public ChatMessage addUser(@Payload ChatMessage chatMessage,
                               SimpMessageHeaderAccessor headerAccessor) {
        // Add username in web socket session
        headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
        return chatMessage;
    }

}