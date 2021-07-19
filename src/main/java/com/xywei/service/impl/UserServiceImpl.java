package com.xywei.service.impl;

import org.springframework.stereotype.Service;

import com.xywei.entity.User;
import com.xywei.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public int addUser(User user) {
		return 1;
	}

	@Override
	public int deleteUserById(Integer id) {
		return 1;
	}

	@Override
	public int updateUserById(Integer id) {
		return 1;
	}

	@Override
	public User findUserById(Integer id) {
		User user = new User(1,"a","a");
		return user;
	}

}
