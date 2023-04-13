package com.walkernegrao.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.walkernegrao.course.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
