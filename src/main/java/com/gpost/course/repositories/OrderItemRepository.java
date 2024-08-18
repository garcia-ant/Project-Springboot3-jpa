package com.gpost.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gpost.course.entities.OrderItem;
import com.gpost.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
	
	
}
