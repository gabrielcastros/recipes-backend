package com.gabriel.recipes.repository;

import com.gabriel.recipes.model.RecipeType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeTypeRepository extends JpaRepository<RecipeType, Long> {
}
