package com.gabriel.recipes.service.impl;

import com.gabriel.recipes.model.Ingredient;
import com.gabriel.recipes.repository.IngredientRepository;
import com.gabriel.recipes.service.IngredientService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IngredientServiceImpl implements IngredientService {

    private final IngredientRepository repository;

    public IngredientServiceImpl(IngredientRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Ingredient> createIngredient(Ingredient ingredient) {
        repository.save(ingredient);
        return getIngredients();
    }

    @Override
    public List<Ingredient> updateIngredient(Ingredient ingredient) {
        repository.save(ingredient);
        return getIngredients();
    }

    @Override
    public List<Ingredient> getIngredients() {
        return repository.findAll();
    }

    @Override
    public Optional<Ingredient> getIngredientById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Ingredient> deleteIngredient(Long id) {
        repository.deleteById(id);
        return getIngredients();
    }
}
