package com.kamadulski.movieapp.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;


import java.util.Date;


@Entity
@Table(name="reviews")
@Data
public class Review {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="movie_id")
    private Long movieId;

    @Column(name="title")
    private String title;

    @Column(name="review_text")
    private String reviewText;

    @Column(name="user_email")
    private String userEmail;

    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @Column(name="created_at")
    private Date createdAt;

}
