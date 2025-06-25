package com.laptopstore;

import com.laptopstore.entity.User;
import com.laptopstore.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class LaptopstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(LaptopstoreApplication.class, args);
	}

	@Bean
	CommandLineRunner init(UserRepository repo, PasswordEncoder encoder) {
		return args -> {
			if (repo.findByUsername("admin") == null) {
				repo.save(new User(null, "admin", encoder.encode("123"), "ADMIN"));
			}
			if (repo.findByUsername("client") == null) {
				repo.save(new User(null, "client", encoder.encode("123"), "CLIENT"));
			}
		};
	}
}