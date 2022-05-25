package com.backend.liv2train.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.backend.liv2train.entities.Courses;
import com.backend.liv2train.repositories.CoursesRepo;

public class CourseServiceImpl implements CourseService {

	@Autowired
	private CoursesRepo courseRepo;

	@Override
	public Courses addCourses(Courses courses) {
		Courses savedCourses = courseRepo.save(courses);
		return savedCourses;
	}

}
