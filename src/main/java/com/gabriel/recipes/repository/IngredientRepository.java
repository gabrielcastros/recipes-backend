package com.gabriel.recipes.repository;

import com.gabriel.recipes.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository <Ingredient, Long> {
}
