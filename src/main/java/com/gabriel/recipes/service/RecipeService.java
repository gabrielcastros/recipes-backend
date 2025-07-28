package com.gabriel.recipes.service;

import com.gabriel.recipes.model.Recipe;

import java.util.List;
import java.util.Optional;

public interface RecipeService {

    public List<Recipe> createRecipe(Recipe recipe);

    public List<Recipe> getRecipes();

    public Optional<Recipe> getRecipeById(Long id);

    public List<Recipe> updateRecipe(Recipe recipe);

    public List<Recipe> deleteRecipe(Long id);
}
