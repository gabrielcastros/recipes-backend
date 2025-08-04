package com.gabriel.recipes.controller;

import com.gabriel.recipes.model.RecipeIngredient;
import com.gabriel.recipes.service.RecipeIngredientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/recipe-ingredient")
public class RecipeIngredientController {

    private final RecipeIngredientService service;

    public RecipeIngredientController(RecipeIngredientService service) {
        this.service = service;
    }

    @PostMapping
    public List<RecipeIngredient> createRecipeIngredient(@RequestBody RecipeIngredient recipeIngredient) {
        return service.createRecipeIngredient(recipeIngredient);
    }

    @GetMapping("/{id}")
    public Optional<RecipeIngredient> getRecipeIngredientById (@PathVariable Long id) {
        return service.getRecipeIngredientById(id);
    }

    @GetMapping("/all")
    public List<RecipeIngredient> getRecipeIngredients() {
        return service.getRecipeIngredients();
    }

    @PutMapping
    public List<RecipeIngredient> updateRecipeIngredient (@RequestBody RecipeIngredient recipeIngredient) {
        return service.updateRecipeIngredient(recipeIngredient);
    }

    @DeleteMapping("/{id}")
    public List<RecipeIngredient> deleteRecipeIngredient (@PathVariable Long id) {
        return service.deleteRecipeIngredient(id);
    }
}