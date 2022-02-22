package com.educandoweb.course.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.repositories.ProductRepositories;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepositories repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}

}
