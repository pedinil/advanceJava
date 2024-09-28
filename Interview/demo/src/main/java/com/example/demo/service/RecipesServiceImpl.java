package com.interview.backendfavouriterecipes.service;

import com.interview.backendfavouriterecipes.handler.EntityNotFoundException;
import com.interview.backendfavouriterecipes.mapper.RecipesMapper;
import com.interview.backendfavouriterecipes.model.RecipesModel;
import com.interview.backendfavouriterecipes.dto.RecipesDTO;
import com.interview.backendfavouriterecipes.repository.RecipesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class RecipesServiceImpl implements RecipesService{



    private final RecipesRepository recipesRepository;
//
    private final RecipesMapper recipesMapper;

    @Autowired
    public RecipesServiceImpl(RecipesRepository recipesRepository, RecipesMapper recipesMapper) {
        this.recipesRepository = recipesRepository;
        this.recipesMapper = recipesMapper;
    }


    @Override
    public RecipesModel save(RecipesDTO recipesDTO) {
     RecipesModel recipesModel  = recipesMapper.toRecipesModel(recipesDTO);
       return recipesRepository.save(recipesModel);


    }

    @Override
    public RecipesModel findById(String Id) {
      return  recipesRepository.findById(Id).orElseThrow(() -> {throw new EntityNotFoundException(RecipesService.class,"id",Id);});
    }

    @Override
    public void deleteById(String Id) {
        recipesRepository.findById(Id).orElseThrow(() -> {throw new EntityNotFoundException(RecipesService.class,"id",Id);});
        recipesRepository.deleteById(Id);
    }

    @Override
    public RecipesModel update(String Id, RecipesDTO recipesDTO) {
      return  recipesRepository.findById(Id).map(recipesRepository::save  )
                .orElseThrow(() -> {throw new EntityNotFoundException(RecipesService.class,"id",Id);});

    }
}
