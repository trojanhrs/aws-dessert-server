package com.dessert.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "recipe_step")
public class RecipeStep {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "step_pk_id")
    private Integer stepPkId;

    @Column(name = "step_number", nullable = false)
    private Integer stepNumber;

    @Column(name = "step", nullable = false, columnDefinition = "TEXT")
    private String step;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "recipe_pk_id", nullable = false)
    private Recipe recipe;

    protected RecipeStep() {
    }
}