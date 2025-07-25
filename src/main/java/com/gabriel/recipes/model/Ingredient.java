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
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PUBLIC.SQ_INGREDIENT")
    @Column(name = "id_ingredient")
    private Long id;

    @Column(name = "nm_ingredient")
    @NotNull
    private String name;
}
