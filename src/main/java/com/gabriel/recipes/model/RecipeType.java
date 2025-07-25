package com.gabriel.recipes.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class RecipeType {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PUBLIC.SQ_RECIPE_TYPE")
    @Column(name = "id_recipe_type")
    private Long id;

    @Column(name = "nm_recipe_type")
    @NotNull
    private String name;

    @Column(name = "id_parent")
    private int parentId;

    @Column(name = "vl_level")
    @NotNull
    private int level;
}
