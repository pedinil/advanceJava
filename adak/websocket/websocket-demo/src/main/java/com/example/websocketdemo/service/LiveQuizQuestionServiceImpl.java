package com.example.websocketdemo.service;

import com.example.websocketdemo.model.LiveQuizQuestionEntity;
import com.example.websocketdemo.repository.LiveQuizQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class LiveQuizQuestionServiceImpl  implements LiveQuizQuestionService{

    @Autowired
    private LiveQuizQuestionRepository LiveQuizQuestionService;

    public Optional<LiveQuizQuestionEntity> getLiveQuestion(Integer id) {
        return LiveQuizQuestionService.findById(id);
    }
}
