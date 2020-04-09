package com.spring.mybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mybatis.mapper.UserMapper;
import com.spring.mybatis.model.Account;
import com.spring.mybatis.model.User;
import com.spring.mybatis.service.UserService;

@RestController
public class MybatisRestController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/all")
	public List<User> listuer(){
		return userService.selectAll();
	}	
	
//	@PostMapping("/result")
//	public List<User> userResult(@ModelAttribute User user) {
//		userService.inserRegisterAccount(user);
//		Account account = new Account();
//		account = userService.selectLastId();
//		user.setIdaccount(account.getIdaccount());
//		userService.insertRegisterUser(user);
//		return userService.selectAll();
//	}
	
//	@PostMapping("/checkLogin")
//	public String checkLogin(@ModelAttribute Account account) {
//		if (userService.selectLogin(account)!=null) {
//			return "Yessssssss";
//		}
//		return "no user";
//	}
	
	@PostMapping("/postUser")
	public int postLogin(@RequestBody Account account) {
		if (userService.selectLogin(account)!=null) {
			return 1;
		}
		return 0;
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable int id){
		if(userService.deleteUser(id)>0) {
			return "Delete complete";
		}
		return "Delete fail";
	}
	
	
//	@GetMapping("/a")
//	public User listuers(){
//		return userService.select();
//	}	
//	
//	@GetMapping("/aa")
//	public User listuerss(){
//		return userService.selectWhere(1);
//	}	

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
