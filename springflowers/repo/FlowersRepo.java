package com.example.springflowers.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springflowers.domain.Flowers;

@Repository

public interface FlowersRepo extends JpaRepository<Flowers, Long> {

}
