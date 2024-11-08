package com.educandoweb.curso.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.curso.entities.Category;
import com.educandoweb.curso.repositories.CategoryRepository;

@Service
public class CategoryServices {
	
	@Autowired
	
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}  
	
	//realizando outro end point para pesquisar por Id 
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}

} 
