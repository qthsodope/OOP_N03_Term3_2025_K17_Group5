package com.laptopstore;

import com.laptopstore.dao.UserDao;
import com.laptopstore.entity.User;
import com.laptopstore.util.JdbcUtil;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@SpringBootApplication
public class LaptopstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(LaptopstoreApplication.class, args);
	}

	@Bean
	CommandLineRunner init(PasswordEncoder encoder) {
		return args -> {
			try (Connection conn = JdbcUtil.getConnection()) {
				// Admin
				if (!userExists(conn, "admin")) {
					insertUser(conn, "admin", encoder.encode("123"), "ADMIN");
				}
				// Client
				if (!userExists(conn, "client")) {
					insertUser(conn, "client", encoder.encode("123"), "CLIENT");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		};
	}

	private boolean userExists(Connection conn, String username) throws Exception {
		String sql = "SELECT id FROM user WHERE username = ?";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, username);
			ResultSet rs = stmt.executeQuery();
			return rs.next();
		}
	}

	private void insertUser(Connection conn, String username, String encodedPassword, String role) throws Exception {
		String sql = "INSERT INTO user(username, password, role) VALUES (?, ?, ?)";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, username);
			stmt.setString(2, encodedPassword);
			stmt.setString(3, role);
			stmt.executeUpdate();
		}
	}
}