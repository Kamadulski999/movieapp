package com.kamadulski.movieapp.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;


import java.util.Date;

@Entity
@Table(name="reactions")
@Data
public class Reaction {

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

    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @Column(name="created_at")
    private Date createdAt;
}
