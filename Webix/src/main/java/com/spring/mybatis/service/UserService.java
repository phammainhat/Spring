package com.spring.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mybatis.mapper.UserMapper;
import com.spring.mybatis.model.User;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	
	//Select All User
	public List<User> SelectAll() {
		return userMapper.FindAll();
	}
	
	//Select User Login
	public User SelectLogin(User user) {
		return userMapper.SelectLogin(user);
	}
	
	// Insert User
	public int InsertRegisterUser(User user){
		if (userMapper.InsertRegisterUser(user)>0) {
			return 1;
		}	
		return 0;
	}
	//Delete User
	public int DeleteUser(int id) {
		if(userMapper.DeleteUser(id)>0) {
			return 1;
		}
		return 0;
	}
	//Find User By Id
	public User FindById(int id) {
		return userMapper.FindById(id);
	}
	//Update User
	public int UpdateUser(User user) {
		if (userMapper.UpdateUser(user)>0) {
			return 1;
		}
		return 0;
	}
	//Find Email
	public int FindEmail(String email) {
		if (userMapper.FindEmail(email)!=null) {
			return 1;
		}
		return 0;	
	}
}
