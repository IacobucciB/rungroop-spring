package com.rungroop.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rungroop.web.models.Club;

public interface ClubRepository extends JpaRepository<Club, Long> {
    
}
