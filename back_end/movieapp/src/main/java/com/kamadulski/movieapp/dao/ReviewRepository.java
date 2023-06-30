package com.kamadulski.movieapp.dao;

import com.kamadulski.movieapp.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
