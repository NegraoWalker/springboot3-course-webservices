package com.walkernegrao.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.walkernegrao.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
