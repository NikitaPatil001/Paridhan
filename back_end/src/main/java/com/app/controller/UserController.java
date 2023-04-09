package com.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojo.User;

@RestController
@RequestMapping("/user")
public class UserController {

	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody User user) {
		if (user.getEmail().equals("Mahikolhe") && user.getPassword().equals("Mahikolhe23"))
			return new ResponseEntity<>("Login success", HttpStatus.OK);
		return null;
	}
}
