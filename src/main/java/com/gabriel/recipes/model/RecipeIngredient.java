package com.gabriel.recipes.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class RecipeIngredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_recipe_ingredient")
    private Long id;

    @Column(name = "id_recipe")
    private Long recipeId;

    @Column(name = "id_ingredient")
    private Long ingredientId;

    @Column(name = "qt_amount")
    private String amount;
}
