package com.xywei.service;

import com.xywei.entity.User;

public interface UserService {

	int addUser(User user);
	
	int deleteUserById(Integer id);
	
	int updateUserById(Integer id);
	
	User findUserById(Integer id);
	
	
}
