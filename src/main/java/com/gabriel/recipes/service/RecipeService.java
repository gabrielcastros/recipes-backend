package com.gabriel.recipes.service;

import com.gabriel.recipes.model.Recipe;

import java.util.List;

public interface RecipeService {

    public List<Recipe> createRecipe(Recipe recipe);

    public List<Recipe> getRecipes();

//  public List<Recipe> getRecipeById(Long id);

    public List<Recipe> updateRecipe(Recipe recipe);

    public List<Recipe> deleteRecipe(Long id);
}
