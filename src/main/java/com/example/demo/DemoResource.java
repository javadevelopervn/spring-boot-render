package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@RestController
public class DemoResource {

    @Autowired
	UserRepository userRepository;


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
