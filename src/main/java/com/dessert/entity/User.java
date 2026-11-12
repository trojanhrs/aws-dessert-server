package com.dessert.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "users_pk_id")
    private Integer usersPkId;

    @Column(name = "users_name", nullable = false, length = 10)
    private String usersName;

    @Column(name = "nickname", unique = true, nullable = false, length = 20)
    private String nickname;

    @Column(name = "users_kakao_id", unique = true)
    private Long usersKakaoId;

    @Column(name = "users_id", unique = true, length = 20)
    private String usersId;

    @Column(name = "users_pwd", length = 100)
    private String usersPwd;

    @Column(name = "users_intro", length = 100)
    private String usersIntro;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "tel", length = 12)
    private String tel;

    @Column(name = "profile_image", length = 500)
    private String profileImage;

    @Column(name = "birthday")
    private LocalDate birthday;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "gender", length = 10)
    private String gender;

    @Column(name = "baking_experience")
    private Boolean bakingExperience;

    @Column(name = "baking_interest", nullable = false, length = 10)
    private String bakingInterest;

    @Column(name = "baking_level", nullable = false)
    private Short bakingLevel;

    @Column(name = "eating_habit1")
    private Boolean eatingHabit1;

    @Column(name = "eating_habit2", columnDefinition = "TEXT")
    private String eatingHabit2;

    protected User() {

    }
}
