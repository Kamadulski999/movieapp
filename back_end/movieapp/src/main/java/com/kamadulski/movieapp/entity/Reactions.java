package com.kamadulski.movieapp.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Table(name="reactions")
@Data
public class Reactions {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="review_id")
    private Long reviewId;

    @Column(name="reaction_text")
    private String reactionText;

    @Column(name="user_email")
    private String userEmail;

    @Column(name="created_at")
    private Timestamp createdAt;
}
