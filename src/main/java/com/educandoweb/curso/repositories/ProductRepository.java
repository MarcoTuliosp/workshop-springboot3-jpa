package com.educandoweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.curso.entities.Product;



public interface ProductRepository extends JpaRepository<Product,Long>{


	

}
