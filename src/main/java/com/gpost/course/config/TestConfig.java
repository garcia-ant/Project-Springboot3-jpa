package com.gpost.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.gpost.course.entities.Order;
import com.gpost.course.entities.User;
import com.gpost.course.repositories.OrderRepository;
import com.gpost.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Pio Fgas", "pio@gmail.com", "923555200", "123456");
		User u2 = new User(null, "Gar Antony", "gar@gmail.com", "924500200", "123456");
		
		Order o1 = new Order(null, Instant.parse("2024-08-20T19:53:07Z"), u1);
		Order o2 = new Order(null, Instant.parse("2024-08-21T03:42:10Z"), u2);
		Order o3 = new Order(null, Instant.parse("2024-08-22T15:21:22Z"), u1); 
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
	}
	
	

}
