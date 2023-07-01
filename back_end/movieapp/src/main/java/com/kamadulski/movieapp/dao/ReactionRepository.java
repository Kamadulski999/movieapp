package com.kamadulski.movieapp.dao;

import com.kamadulski.movieapp.entity.Reaction;
import com.kamadulski.movieapp.entity.Review;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

public interface ReactionRepository extends JpaRepository<Reaction, Long> {
    Page<Reaction> findByReviewId(@RequestParam("review_id") Long reviewId, Pageable pageable);


}
