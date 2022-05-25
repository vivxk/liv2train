package com.backend.liv2train.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.liv2train.entities.Courses;

public interface CoursesRepo extends JpaRepository<Courses, Integer> {

}
