package com.gabriel.recipes.controller;

import com.gabriel.recipes.model.Ingredient;
import com.gabriel.recipes.service.IngredientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ingredient")
public class IngredientController {

    private final IngredientService service;

    public IngredientController(IngredientService service) {
        this.service = service;
    }

    @PostMapping
    public List<Ingredient> createIngredient(@RequestBody Ingredient ingredient) {
        return service.createIngredient(ingredient);
    }

    @GetMapping("/{id}")
    public Optional<Ingredient> getIngredientById (@PathVariable Long id) {
        return service.getIngredientById(id);
    }

    @GetMapping("/all")
    public List<Ingredient> getIngredients() {
        return service.getIngredients();
    }

    @PutMapping
    public List<Ingredient> updateIngredient (@RequestBody Ingredient ingredient) {
        return service.updateIngredient(ingredient);
    }

    @DeleteMapping("/{id}")
    public List<Ingredient> deleteIngredient (@PathVariable Long id) {
        return service.deleteIngredient(id);
    }
}