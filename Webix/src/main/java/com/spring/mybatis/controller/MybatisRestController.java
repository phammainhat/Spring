package com.spring.mybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mybatis.model.User;
import com.spring.mybatis.service.UserService;

@RestController
public class MybatisRestController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/all")
	public List<User> ListUser(){
		return userService.SelectAll();
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

	@PostMapping("/result")
	public int UserResult(@RequestBody User user) {		
		if (userService.InsertRegisterUser(user)>0) {
			return 1;
		}
		return 0;
	}
	
	@PostMapping("/postUser")
	public int PostLogin(@RequestBody User user) {
		if (userService.SelectLogin(user)!=null) {
			return 1;
		}
		return 0;
	}
//
//	
	@DeleteMapping("/delete/{id}")
	public int DeleteUser(@PathVariable int id){
		if(userService.DeleteUser(id)>0) {
			return 1;
		}
		return 0;
	}
	

	@RequestMapping("/edit/{id}")
	public User UpdateUserPage(@PathVariable int id){
		User user = new User();
		user = userService.FindById(id);
		return user;
	}

	@PostMapping("/update")
	public int EitUser(@RequestBody User user) {
		return userService.UpdateUser(user);
	}
	
	@PostMapping("/findEmail")
	public int FindEmail(@RequestBody User user){
		if (userService.FindEmail(user.getEmail())>0) {
			return 1;
		}
		return 0;
	}
}
