package com.app.service;

import java.util.List;
import java.util.Optional;

import com.app.pojo.User;

public interface UserService {

	Optional<User> login(Integer id);

	User register(User user);

	List<User> getAll();

	User update(User user);

	User findByEmail(String email);
}
