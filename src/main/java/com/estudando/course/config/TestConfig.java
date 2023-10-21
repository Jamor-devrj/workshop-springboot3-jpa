package com.estudando.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.estudando.course.entities.User;
import com.estudando.course.repositories.UserRepository;

@Configuration	 // <-- para informar ao spring q é uma classe especifica de configuração
@Profile("test")	// <-- para falar q é uma classe especifica para o perfil de teste.
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}	
	
	/*essa classe vai servir para configurar os database seeding
	 * 
	 */	
}
