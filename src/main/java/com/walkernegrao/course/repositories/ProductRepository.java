package com.walkernegrao.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.walkernegrao.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
