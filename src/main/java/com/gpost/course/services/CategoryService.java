package com.gpost.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gpost.course.entities.Category;
import com.gpost.course.repositories.CategoryRepository;
import com.gpost.course.services.exceptions.ResourceNotFoundException;

@Service
public class CategoryService  {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> finAll(){
		return repository.findAll();
	}
	public Category findById(Long id) {	
	Optional<Category> obj =  repository.findById(id);
	return obj.orElseThrow(() -> new ResourceNotFoundException(id));	
	
	}
	

}
