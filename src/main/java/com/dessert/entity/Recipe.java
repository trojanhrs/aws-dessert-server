package com.dessert.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "recipe")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recipe_pk_id")
    private Integer recipePkId;

    @Column(name = "recipe_name", nullable = false, length = 100)
    private String recipeName;

    @Column(name = "recipe_intro", length = 150)
    private String recipeIntro;

    @Column(name = "recipe_image", nullable = false, length = 500)
    private String recipeImage;

    @Column(name = "recipe_servings", nullable = false)
    private Integer recipeServings;

    @Column(name = "baking_level", nullable = false)
    private Short bakingLevel;

    @Column(name = "scrap_count", nullable = false)
    private Integer scrapCount;

    @Column(name = "category_big", nullable = false, length = 10)
    private String categoryBig;

    @Column(name = "category_middle", nullable = false, length = 20)
    private String categoryMiddle;

    @Column(name = "category_machine", nullable = false, length = 20)
    private String categoryMachine;

    @Column(name = "ingredient1", nullable = false, columnDefinition = "TEXT")
    private String ingredient1;

    @Column(name = "ingredient2", columnDefinition = "TEXT")
    private String ingredient2;

    @Column(name = "tips", columnDefinition = "TEXT")
    private String tips;

    @Column(name = "tags", length = 100)
    private String tags;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "author_id", nullable = false)
    private User author;

    protected Recipe() {

    }
}
