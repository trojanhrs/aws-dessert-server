package com.dessert.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

public class Preference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "preference_pk_id")
    private Integer preferencePkId;

    @Column(name = "my_level", nullable = false, length = 1)
    private String myLevel;

    @Column(name = "my_habit", nullable = false, length = 30)
    private String myHabit;

    @Column(name = "my_find", nullable = false, length = 30)
    private String myFind;

    @Column(name = "is_research", nullable = false)
    private Boolean isResearch;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "users_pk_id", unique = true, nullable = false)
    private User user;


    protected Preference() {

    }
}
