package com.kamadulski.movieapp.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;


@Entity
@Table(name="reviews")
@Data
public class Reviews {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="movie_id")
    private int movieId;

    @Column(name="title")
    private String title;

    @Column(name="review_text")
    private String reviewText;

    @Column(name="user_email")
    private String userEmail;

    @Column(name="created_at")
    private Timestamp createdAt;

}
