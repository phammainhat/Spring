package com.spring.mybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mybatis.model.Account;
import com.spring.mybatis.model.User;
import com.spring.mybatis.service.UserService;

@Controller
public class MainController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/register")
	public ModelAndView register() {
		return new ModelAndView("register", "user", new User()) ;
	}

	@PostMapping("/result")
	public String userResult(@ModelAttribute User user) {
		userService.inserRegisterAccount(user);
		Account account = new Account();
		account = userService.selectLastId();
		user.setIdaccount(account.getIdaccount());
		userService.insertRegisterUser(user);
		return "UserList";
	}
	
	@RequestMapping("/login")
	public ModelAndView login() {
		return new ModelAndView("login", "account", new Account());
	}
	
	@RequestMapping("/listUser")
	public String listUser() {
		return "UserList";
	}
	
	@RequestMapping("/update/{id}")
	public ModelAndView updateUserPage(@PathVariable int id){
		User user = new User();
		user = userService.findById(id);
		return new ModelAndView("UserEdit", "user", user);
	}
	
	@PostMapping("/edit")
	public String editUser(@ModelAttribute User user) {
		userService.updateUser(user);
		return "UserList";
	}
	
	
//	@RequestMapping("/")
//	public String userList() {
//		return "UserList";
//	}
//	
//	@GetMapping("/edit/{id}")
//	public String editUser(@PathVariable(value="id") int id, Model model) {
//		User user = new User();
//		user = userService.selectUserWhere(id);
//		model.addAttribute("user", user);
//		return "UserEdit";
//	}
//	
//	@PostMapping("/edit")
//	public String updateUser(User user) {
//		userService.updateUser(user);
//		return "UserList";
//	}
}
