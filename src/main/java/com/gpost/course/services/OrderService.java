package com.gpost.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gpost.course.entities.Order;
import com.gpost.course.repositories.OrderRepository;

@Service
public class OrderService  {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> finAll(){
		return repository.findAll();
	}
	public Order findById(Long id) {	
	Optional<Order> obj =  repository.findById(id);
	return obj.get();	
	
	}
	

}
