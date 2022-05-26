package com.backend.liv2train.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.liv2train.entities.Center;

public interface CenterRepo extends JpaRepository<Center, String> {
}
