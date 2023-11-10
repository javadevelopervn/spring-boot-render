package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication extends SpringBootServletInitializer {

	@Autowired
	UserRepository userRepository;

	
	@Override
    protected SpringApplicationBuilder configure(
      SpringApplicationBuilder builder) {
        return builder.sources(DemoApplication.class);
    }


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("count-users")
	public String getCountUsers(){
		long numberUsers = userRepository.count();
		return "Number of users = "+numberUsers;
	}

	@GetMapping("add-user")
	public String addUser(){
		User user = new User();
		user.setFirstName("Render");
		user.setLastName("Spring Boot");
		userRepository.save(user);
		return "User added successfully";
	}

}
