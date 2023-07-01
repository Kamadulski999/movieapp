package com.kamadulski.movieapp.dao;

import com.kamadulski.movieapp.entity.Rating;
import com.kamadulski.movieapp.entity.Reaction;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

public interface RatingRepository extends JpaRepository<Rating, Long> {

    Page<Rating> findByMovieId(@RequestParam("movie_id") Long movieId, Pageable pageable);
}
