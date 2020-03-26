package com.spring.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.spring.mybatis.mapper.UserMapper;
import com.spring.mybatis.model.User;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	
	public List<User> selectAll() {
		return userMapper.findAll();
	}
//	
//	public User selectUserWhere(int id) {
//		return userMapper.getById(id);
//	}
}
