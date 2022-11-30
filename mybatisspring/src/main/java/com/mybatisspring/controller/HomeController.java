package com.mybatisspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mybatisspring.model.User;
import com.mybatisspring.repository.UserRepository;

@RestController
public class HomeController {
	@Autowired UserRepository userRepository;
	@GetMapping("/")
	public String getHome() {
		List<User> user = userRepository.getAll();
		String result = "";
		for (User u : user) {
			result+=u.getId()+" - "+u.getEmail()+" - "+u.getFirstName()+" - "+u.getLastName()+"<br>";
		}
		return result;
	}
}
