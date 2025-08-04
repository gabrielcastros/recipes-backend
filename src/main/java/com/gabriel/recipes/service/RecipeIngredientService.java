package com.gabriel.recipes.service;

import com.gabriel.recipes.model.RecipeIngredient;

import java.util.List;
import java.util.Optional;

public interface RecipeIngredientService {

    List<RecipeIngredient> createRecipeIngredient(RecipeIngredient recipeIngredient);

    List<RecipeIngredient> updateRecipeIngredient(RecipeIngredient recipeIngredient);

    List<RecipeIngredient> getRecipeIngredients();

    Optional<RecipeIngredient> getRecipeIngredientById(Long id);

    List<RecipeIngredient> deleteRecipeIngredient(Long id);
}
