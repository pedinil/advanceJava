package com.questionner.adak.repository;

import com.questionner.adak.model.OnlineQuizEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface QuestionnerRepository extends PagingAndSortingRepository<OnlineQuizEntity,Integer> {
}
