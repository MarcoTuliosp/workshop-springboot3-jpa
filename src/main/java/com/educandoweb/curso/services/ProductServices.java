package com.educandoweb.curso.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.curso.entities.Product;
import com.educandoweb.curso.repositories.ProductRepository;

@Service
public class ProductServices {
	
	@Autowired
	
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}  
	
	//realizando outro end point para pesquisar por Id 
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}

} 
