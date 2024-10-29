package com.educandoweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.curso.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
