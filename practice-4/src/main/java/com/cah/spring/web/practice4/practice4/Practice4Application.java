package com.cah.spring.web.practice4.practice4;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Practice4Application {
	@Autowired
	private UserRepository userRepository;
	public static void main(String[] args) {
		SpringApplication.run(Practice4Application.class, args);
	}
	@PostConstruct
	private void initDb() {
		User user = new User();
		user.setUserType(UserType.STUDENT);
		user.setUserName("PeterM");
		user.setPassword("ABC123abc*");
		user.setDateofBirth(new Date());
		user.setCreationTime(new Date());

		userRepository.save(user);
	}

}
