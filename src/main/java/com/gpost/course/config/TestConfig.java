package com.gpost.course.config;

import java.sql.Array;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.gpost.course.entities.User;
import com.gpost.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Pio Fgas", "pio@gmail.com", "923555200", "123456");
		User u2 = new User(null, "Gar Antony", "gar@gmail.com", "924500200", "123456");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
	}
	
	

}
