package com.educandoweb.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.curso.entities.User;


//controlador rest que reponde no caminho Users

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
@GetMapping
	public ResponseEntity<User> FindAll(){
		
		User u = new User(1L, "Maria", "maria@gmail.com" , "9999999", "12345" );
		return  ResponseEntity.ok().body(u);
		
	}

}
