package com.educandoweb.curso.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.curso.entities.Category;
import com.educandoweb.curso.entities.Order;
import com.educandoweb.curso.entities.Product;
import com.educandoweb.curso.entities.User;
import com.educandoweb.curso.entities.enums.OrderStatus;
import com.educandoweb.curso.repositories.CategoryRepository;
import com.educandoweb.curso.repositories.OrderRepository;
import com.educandoweb.curso.repositories.ProductRepository;
import com.educandoweb.curso.repositories.UserRepository;


@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Eletronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		
		Product p1 = new Product(null, "The Lord of Rings", "Lorem Ipsum dolor sit amet,  consecteur.", 90.5, "", null);
		Product p2 = new Product(null,  "Smart TV", "Nulla  eu imperdiet purus .Maecenas ante", 2190.0, "", null);
		Product p3 = new Product(null, "MacBook Pro","Nam eleifen maximus torto, at mollis.", 1250.0 ,"", null);
		Product p4 = new Product(null, "Pc Gamer ","Donec aliquet odio ac rhoncus cursus.", 1200.0 ,"", null);
		Product p5 = new Product(null, "Rails for Dummies ","Cras fringilla convallis  sem vel faucibus", 100.99 ,"", null);


		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		productRepository.saveAll(Arrays.asList(p1, p2, p3,p4, p5));
		
		p1.getCategories().add(cat2);
		p2.getCategories().add(cat1);
		p2.getCategories().add(cat3);
		p3.getCategories().add(cat3);
		p4.getCategories().add(cat3);
		p5.getCategories().add(cat2);
		
		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5 ));
			
		User u1 = new User (null, "Maria Brown", "maria@gmail.com", "98888888", "123456");
		User u2 = new User (null, "Alex Green", "alex@gmail.com", "9777777777", "78910111");
		
		
		Order o1 = new Order(null, Instant.parse("2024-06-20T19:53:07Z"),OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2024-07-21T03:42:10Z"),OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2024-11-22T15:21:22Z"),OrderStatus.WAITING_PAYMENT, u1);
		
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
		
	}

}
// m2inuto 5:32 da aula 269