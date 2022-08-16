package com.example.demo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	@Autowired
	private UserDao Dao;
	
	@GetMapping("/get")
	@CrossOrigin("http://localhost:3000")
	public ResponseEntity<List<User>> getdata() {
		return ResponseEntity.ok(Dao.findAll());

	}
	
	@PostMapping("/post")
	public User postuserdata(@RequestBody User user ) {
		return Dao.save(user);
	}
	@PutMapping("/put")
	@CrossOrigin("http://localhost:3000")
	public User updateUser(@RequestBody User user) {
		service.updateUser(user);
		return Dao.save(user);
	}
	
}