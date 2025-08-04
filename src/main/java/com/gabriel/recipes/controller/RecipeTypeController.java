package com.gabriel.recipes.controller;

import com.gabriel.recipes.model.RecipeType;
import com.gabriel.recipes.service.RecipeTypeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/type")
public class RecipeTypeController {

    private final RecipeTypeService service;

    public RecipeTypeController(RecipeTypeService service) {
        this.service = service;
    }

    @PostMapping
    public List<RecipeType> createRecipeType(@RequestBody RecipeType recipeType) {
        return service.createRecipeType(recipeType);
    }

    @GetMapping("/{id}")
    public Optional<RecipeType> getRecipeTypeById (@PathVariable Long id) {
        return service.getRecipeTypeById(id);
    }

    @GetMapping("/all")
    public List<RecipeType> getRecipeTypes() {
        return service.getRecipeTypes();
    }

    @PutMapping
    public List<RecipeType> updateRecipeType (@RequestBody RecipeType recipeType) {
        return service.updateRecipeType(recipeType);
    }

    @DeleteMapping("/{id}")
    public List<RecipeType> deleteRecipeType (@PathVariable Long id) {
        return service.deleteRecipeType(id);
    }
}