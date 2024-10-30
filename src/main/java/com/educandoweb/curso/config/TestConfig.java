package com.educandoweb.curso.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.curso.entities.User;
import com.educandoweb.curso.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User (null, "Maria Brown", "maria@gmail.com", "98888888", "123456");
		User u2 = new User (null, "Alex Green", "alex@gmail.com", "9777777777", "78910111");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}

}
// minuto 5:32 da aula 269