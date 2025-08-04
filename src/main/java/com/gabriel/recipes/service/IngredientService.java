package com.gabriel.recipes.service;

import com.gabriel.recipes.model.Ingredient;
import com.gabriel.recipes.repository.IngredientRepository;

import java.util.List;
import java.util.Optional;

public interface IngredientService {

    List<Ingredient> createIngredient(Ingredient ingredient);

    List<Ingredient> updateIngredient(Ingredient ingredient);

    List<Ingredient> getIngredients();

    Optional<Ingredient> getIngredientById(Long id);

    List<Ingredient> deleteIngredient(Long id);
}
