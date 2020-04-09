package com.spring.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.spring.mybatis.mapper.UserMapper;
import com.spring.mybatis.model.Account;
import com.spring.mybatis.model.User;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	
	public List<User> selectAll() {
		return userMapper.findAll();
	}
	
	public void inserRegisterAccount(User user) {
		userMapper.insertRegisterAccount(user);
	}
	
	public Account selectLastId() {
		return userMapper.selectLastIdAccount();
	}
	
	public void insertRegisterUser(User user){
		userMapper.insertRegisterUser(user);
	}
	
	public Account selectLogin(Account account) {
		return userMapper.selectLogin(account);
	}
	
	public int deleteUser(int id) {
		if(userMapper.deleteAccount(id)>0 && userMapper.deleteUser(id)>0) {
			return 1;
		}
		return 0;
	}
	
	public User findById(int id) {
		return userMapper.findById(id);
	}
	
	
	public User select(){
		return userMapper.findAll_temp();
	}
	
	public int updateUser(User user) {
		if (userMapper.updateAccount(user)>0 && userMapper.updateUser(user)>0) {
			return 1;
		}
		return 0;
	}
}
