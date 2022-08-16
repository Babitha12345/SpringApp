package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class postsController {

	@SuppressWarnings("unused")
	@Autowired
	private postsService service;
	
	@Autowired
	private postsDao Dao;
	
	@GetMapping("/getposts")
	@CrossOrigin("http://localhost:4200")
	public ResponseEntity<List<posts>> getallposts() {
		return ResponseEntity.ok(Dao.findAll());

	}
	
	@PostMapping("/postposts")
	@CrossOrigin("http://localhost:4200")
	public posts addposts(@RequestBody posts post ) {
		return Dao.save(post);
	}
//	@PutMapping("/put")
//	@CrossOrigin("http://localhost:4200")
//	public posts updateUsers(@RequestBody posts post) {
//		service.updateposts(post);
//		return Dao.save(post);
//	}
}
