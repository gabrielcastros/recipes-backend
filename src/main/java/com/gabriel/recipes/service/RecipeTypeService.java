package com.gabriel.recipes.service;

import com.gabriel.recipes.model.RecipeType;

import java.util.List;
import java.util.Optional;

public interface RecipeTypeService {

    List<RecipeType> createRecipeType(RecipeType recipeType);

    List<RecipeType> updateRecipeType(RecipeType recipeType);

    List<RecipeType> getRecipeTypes();

    Optional<RecipeType> getRecipeTypeById(Long id);

    List<RecipeType> deleteRecipeType(Long id);
}
