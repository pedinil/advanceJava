package com.example.websocketdemo.service;

import com.example.websocketdemo.model.LiveQuizQuestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import java.util.Optional;


public interface LiveQuizQuestionService {

public Optional<LiveQuizQuestionEntity> getLiveQuestion(Integer id);


}
