package com.gabriel.recipes.service.impl;

import com.gabriel.recipes.model.RecipeType;
import com.gabriel.recipes.repository.RecipeTypeRepository;
import com.gabriel.recipes.service.RecipeTypeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecipeTypeServiceImpl implements RecipeTypeService {

    private final RecipeTypeRepository repository;

    public RecipeTypeServiceImpl(RecipeTypeRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<RecipeType> createRecipeType(RecipeType recipeType) {
        repository.save(recipeType);
        return getRecipeTypes();
    }

    @Override
    public List<RecipeType> updateRecipeType(RecipeType recipeType) {
        repository.save(recipeType);
        return getRecipeTypes();
    }

    @Override
    public List<RecipeType> getRecipeTypes() {
        return repository.findAll();
    }

    @Override
    public Optional<RecipeType> getRecipeTypeById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<RecipeType> deleteRecipeType(Long id) {
        repository.deleteById(id);
        return getRecipeTypes();
    }
}
