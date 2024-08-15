package com.gpost.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gpost.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	

}
