package com.spring.mybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mybatis.mapper.UserMapper;
import com.spring.mybatis.model.User;

@RestController
public class MybatisRestController {
	@Autowired
	private UserMapper userMapper;
	@GetMapping("/all")
	public List<User> listuer(){
		return userMapper.findAll();
	}	
	
//	@Autowired
//	private UserService userService;
//	
//	@GetMapping("/all")
//	public List<User> listuer(){
//		return userService.selectAll();
//	}	
//
//	@GetMapping("/where/{id}")
//	public @ResponseBody User oneuser(@PathVariable(value="id") int id){
//		return userService.selectUserWhere(id);
//	}
	
	
	
//	private UserMapper userMapper;
	
//	public MybatisRestController(UserMapper userMapper) {
//		this.userMapper = userMapper;
//	}
//	
//	@GetMapping("/all")
//	public List<User> listuer(){
//		return userMapper.findAll();
//	}
//	
//	@GetMapping("/insert")
//	private List<User> updateuser(){
//		User user = new User();
//		user.setId(6);
//		user.setUsername("FFFFF");
//		user.setPassword("123123");
//		userMapper.insert(user);
//		return userMapper.findAll();
//	}
//	
//	@GetMapping("/where/{id}")
//	public @ResponseBody User oneuser(@PathVariable(value="id") int id){
//		return userMapper.getById(id);
//	}
//	
//	@GetMapping("/delete")
//	public List<User> deleteuser(){
//		userMapper.delete(4);
//		return userMapper.findAll();
//	}
//	
//	@GetMapping("/update")
//	public List<User> updateUser(){
//		User user = new User();
//		user.setId(2);
//		user.setUsername("@@@@@@");
//		user.setPassword("123123");
//		userMapper.update(user);
//		return userMapper.findAll();
//	}
}
