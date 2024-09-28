package com.interview.backendfavouriterecipes.mapper;


import com.interview.backendfavouriterecipes.dto.RecipesDTO;
import com.interview.backendfavouriterecipes.model.RecipesModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public interface RecipesMapper {

    RecipesMapper INSTANCE = Mappers.getMapper( RecipesMapper.class );

//    @Mapping(source = "", target = "")
    RecipesModel toRecipesModel(RecipesDTO recipesDTO);

}
