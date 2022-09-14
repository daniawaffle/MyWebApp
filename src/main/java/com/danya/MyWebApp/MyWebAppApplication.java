package com.danya.MyWebApp;

import com.danya.MyWebApp.user.User;
import com.danya.MyWebApp.user.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyWebAppApplication
		implements CommandLineRunner
{
	private final UserRepository userRepository;

	public MyWebAppApplication(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(MyWebAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User dania = new User();
		dania.setFirstName("danya");
		dania.setLastName("obidat");
		dania.setEmail("danya@email.com");
		dania.setPassword("123");
		userRepository.save(dania);
	}
}
