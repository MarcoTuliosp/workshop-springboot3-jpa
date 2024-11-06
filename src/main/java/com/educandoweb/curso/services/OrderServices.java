package com.educandoweb.curso.services;
//import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.curso.entities.Order;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.educandoweb.curso.entities.Order;
//import com.educandoweb.curso.entities.Order;
import com.educandoweb.curso.repositories.OrderRepository;

@Service
public class OrderServices {
	
	@Autowired
	
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}  
	
	//realizando outro end point para pesquisar por Id 
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}

} 
