package com.kamadulski.movieapp.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="ratings")
@Data
public class Rating {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="movie_id")
    private Long movieId;

    @Column(name="user_email")
    private String userEmail;

    @Column(name="rating")
    private int rating;
}
