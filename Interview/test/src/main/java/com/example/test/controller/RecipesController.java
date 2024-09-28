package com.interview.backendfavouriterecipes.controller;



import com.interview.backendfavouriterecipes.model.RecipesModel;
import com.interview.backendfavouriterecipes.dto.RecipesDTO;
import com.interview.backendfavouriterecipes.service.RecipesService;
import io.swagger.v3.oas.annotations.Operation;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;



@Slf4j
@RestController
@RequestMapping("/api/v1/recipes")
//@RequiredArgsConstructor
@Validated
public class RecipesController {



     private final RecipesService recipesService;

    @Autowired
    public RecipesController(RecipesService recipesService) {
        this.recipesService = recipesService;
    }

    @Operation(summary = "Register Recipes" )
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "200", description = "Found the ",
//                    content = { @Content
//                    (mediaType = "application/json",
//                            schema = @Schema(implementation = RecipesModel.class)) }),
//            @ApiResponse(responseCode = "400", description = "Invalid id supplied",
//                    content = @Content),
//            @ApiResponse(responseCode = "404", description = "Book not found",
//                    content = @Content) })
    @PostMapping(path = "/save")
    public RecipesModel registerRecipes(@RequestBody RecipesDTO recipes) {

        return recipesService.save(recipes);

    }


    @Operation(summary = "get Recipes by ID" )
    @GetMapping(path = "/{id}")
    public RecipesModel findOneRecipes(@PathVariable String id) {
         return   recipesService.findById(id);
    }

    @Operation(summary = "Delete Recipes by ID" )
    @DeleteMapping(path = "/{id}")
    public void deleteRecipes(@PathVariable String id)
    {

        recipesService.deleteById(id);

    }

    @Operation(summary = "Update Recipes by ID" )
    @PutMapping(path = "/{id}")
    public void updateRecipes(@PathVariable String id,@RequestBody RecipesDTO recipes)
    {
        recipesService.update(id,recipes);

    }

}
