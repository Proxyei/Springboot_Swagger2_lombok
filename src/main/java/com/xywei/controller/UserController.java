package com.xywei.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xywei.entity.User;
import com.xywei.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(tags = "用户管理接口")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/user")
	public int addUser(User user) {
		return userService.addUser(user);
	}

	@DeleteMapping("/user/{id}")
	public int deleteUserById(@PathVariable("id") Integer id) {
		return userService.deleteUserById(id);
	}

	@PutMapping("/user/{id}")
	public User updateUserById(@PathVariable("id") Integer id, String username) {
		return new User(id, username, "bbb");
	}

	@GetMapping("/user/{id}")
	@ApiOperation("根据Id查找用户")
	public User findUserById(@PathVariable("id") Integer id) {
		User user = new User(1, "a", "a");
		return user;
	}
}
