package com.gabriel.recipes.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Date;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_recipe")
    private Long id;

    @Column(name = "nm_recipe")
    @NotNull
    private String name;

    @Column(name = "ds_instruction")
    @NotNull
    private String instructions;

    @Column(name = "dt_created_at")
    @NotNull
    private Date createdAt;

    @Column(name = "id_recipe_type")
    private Long typeId;

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", instructions='" + instructions + '\'' +
                ", createdAt=" + createdAt +
                ", typeId=" + typeId +
                '}';
    }
}
