package com.example.websocketdemo.repository;

import com.example.websocketdemo.model.LiveQuizQuestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface LiveQuizQuestionRepository extends JpaRepository<LiveQuizQuestionEntity, Integer>, JpaSpecificationExecutor<LiveQuizQuestionEntity> {

}