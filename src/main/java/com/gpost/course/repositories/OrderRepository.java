package com.gpost.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gpost.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	
}
