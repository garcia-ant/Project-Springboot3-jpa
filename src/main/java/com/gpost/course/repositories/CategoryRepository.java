package com.gpost.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gpost.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	
}
