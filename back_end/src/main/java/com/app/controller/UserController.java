package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.LoginRequest;
import com.app.pojo.User;
import com.app.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody LoginRequest request) {
		User user = userService.findByEmail(request.getEmail());
		return new ResponseEntity<>(userService.login(user.getId()), HttpStatus.OK);
	}

	@PostMapping("/register")
	public ResponseEntity<?> register(@RequestBody User user) {
		return new ResponseEntity<>(userService.register(user), HttpStatus.OK);
	}

	@GetMapping("/getAllEmployee")
	public ResponseEntity<?> getAllEmployee() {
		return new ResponseEntity<>(userService.getAll(), HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<?> update(@RequestBody User user, @PathVariable Integer id) {
		user.setId(id);
		return new ResponseEntity<>(userService.update(user), HttpStatus.OK);
	}
}
