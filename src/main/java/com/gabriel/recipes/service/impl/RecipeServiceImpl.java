package com.gabriel.recipes.service.impl;

import com.gabriel.recipes.model.Recipe;
import com.gabriel.recipes.repository.RecipeRepository;
import com.gabriel.recipes.service.RecipeService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeServiceImpl implements RecipeService {
    private RecipeRepository repository;

    public RecipeServiceImpl(RecipeRepository repository) {
        this.repository = repository;
    }

    public List<Recipe> createRecipe(Recipe recipe) {
        repository.save(recipe);
        return getRecipes();
    }

    public List<Recipe> getRecipes() {
        return repository.findAll();
    }

//    public Recipe getRecipeById(Long id) {
//        return repository.findById(id);
//    }

    public List<Recipe> updateRecipe(Recipe recipe) {
        repository.save(recipe);
        return getRecipes();
    }

    public List<Recipe> deleteRecipe(Long id) {
        repository.deleteById(id);
        return getRecipes();
    }
}
