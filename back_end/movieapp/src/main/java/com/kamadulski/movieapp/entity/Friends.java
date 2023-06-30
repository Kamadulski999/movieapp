package com.kamadulski.movieapp.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="friends")
@Data
public class Friends {

    @Id
    @Column(name="friend1_email")
    private String friend1Email;

    @Column(name="friend2_email")
    private String friend2Email;

}
