package com.walkernegrao.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.walkernegrao.course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
