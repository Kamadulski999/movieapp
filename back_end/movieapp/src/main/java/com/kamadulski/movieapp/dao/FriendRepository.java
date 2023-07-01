package com.kamadulski.movieapp.dao;

import com.kamadulski.movieapp.entity.Friend;
import com.kamadulski.movieapp.entity.Rating;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

public interface FriendRepository extends JpaRepository<Friend, Long> {

//    Page<Friend> findById(@RequestParam("id") Long id, Pageable pageable);

    Page<Friend> findByFriend1(@RequestParam("friend1") String friend1, Pageable pageable);
    }
