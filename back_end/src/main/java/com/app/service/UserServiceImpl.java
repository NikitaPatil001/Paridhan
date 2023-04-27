package com.app.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.UserDao;
import com.app.pojo.User;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public Optional<User> login(Integer id) {
		return userDao.findById(id);
	}

	@Override
	public User register(User user) {
		return userDao.save(user);
	}

	@Override
	public List<User> getAll() {
		return userDao.findAll();
	}

	@Override
	public User update(User user) {
		return userDao.save(user);
	}

	@Override
	public User findByEmail(String email) {
		return userDao.findByEmail(email);
	}
}
