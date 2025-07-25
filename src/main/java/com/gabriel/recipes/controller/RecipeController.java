package com.gabriel.recipes.controller;

import com.gabriel.recipes.model.Recipe;
import com.gabriel.recipes.service.RecipeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recipe")
public class RecipeController {

    private RecipeService service;

    public RecipeController(RecipeService service) {
        this.service = service;
    }

    @PostMapping
    public List<Recipe> createRecipe(@RequestBody Recipe recipe) {
        return service.createRecipe(recipe);
    }

    @GetMapping("/all")
    public List<Recipe> getRecipes() {
        return service.getRecipes();
    }

    @PutMapping
    public List<Recipe> updateRecipe(@RequestBody Recipe recipe) {
        return service.updateRecipe(recipe);
    }

    @DeleteMapping("/{id}")
    public List<Recipe> deleteRecipe(@PathVariable Long id) {
        return service.deleteRecipe(id);
    }
}
