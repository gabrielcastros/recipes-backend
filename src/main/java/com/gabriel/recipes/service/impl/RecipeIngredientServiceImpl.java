package com.gabriel.recipes.service.impl;

import com.gabriel.recipes.model.RecipeIngredient;
import com.gabriel.recipes.repository.RecipeIngredientRepository;
import com.gabriel.recipes.service.RecipeIngredientService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecipeIngredientServiceImpl implements RecipeIngredientService {

    private final RecipeIngredientRepository repository;

    public RecipeIngredientServiceImpl(RecipeIngredientRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<RecipeIngredient> createRecipeIngredient(RecipeIngredient recipeIngredient) {
        repository.save(recipeIngredient);
        return getRecipeIngredients();
    }

    @Override
    public List<RecipeIngredient> updateRecipeIngredient(RecipeIngredient recipeIngredient) {
        repository.save(recipeIngredient);
        return getRecipeIngredients();
    }

    @Override
    public List<RecipeIngredient> getRecipeIngredients() {
        return repository.findAll();
    }

    @Override
    public Optional<RecipeIngredient> getRecipeIngredientById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<RecipeIngredient> deleteRecipeIngredient(Long id) {
        repository.deleteById(id);
        return getRecipeIngredients();
    }
}
