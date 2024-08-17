package com.gpost.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gpost.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}