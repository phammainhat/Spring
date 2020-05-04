package com.spring.mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.mybatis.service.UserService;

@Controller
public class MainController {
	@Autowired
	private UserService userService;
	
//	@RequestMapping("/register")
//	public ModelAndView Register() {
//		return new ModelAndView("register", "user", new User()) ;
//	}
//
//	
//	@RequestMapping(value= {"/","/login"})
//	public ModelAndView Login() {
//		return new ModelAndView("login", "account", new User());
//	}
//	
//	@RequestMapping("/listUser")
//	public String ListUser() {
//		return "UserList";
//	}
	
//	@RequestMapping("/update/{id}")
//	public ModelAndView updateUserPage(@PathVariable int id){
//		User user = new User();
//		user = userService.FindById(id);
//		return new ModelAndView("UserEdit", "user", user);
//	}
	
//	@PostMapping("/edit")
//	public String editUser(@ModelAttribute User user) {
//		userService.updateUser(user);
//		return "redirect:/listUser";
//	}
//// Webix test
	
	@RequestMapping("/loginWebix")
	public String LoginWebix() {
		return "login-webix";
	}

	@GetMapping("/editWebix")
	public String EditWebix() {
		return "edit-webix";
	}
	
	@RequestMapping("/registerWebix")
	public String RegisterWebix() {
		return "register-webix";
	}
	
	@RequestMapping("/listWebix")
	public String ListUserWebix() {
		return "list-webix";
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
