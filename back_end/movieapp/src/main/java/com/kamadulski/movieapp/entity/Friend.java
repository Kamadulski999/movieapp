package com.kamadulski.movieapp.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="friends")
@Data
public class Friend {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;


    @Column(name="friend1")
    private String friend1;

    @Column(name="friend2")
    private String friend2;

}
