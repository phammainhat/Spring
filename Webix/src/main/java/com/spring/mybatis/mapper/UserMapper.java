package com.spring.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.spring.mybatis.model.User;

@Mapper
public interface UserMapper {
	List<User> FindAll();
	
	//User findAll_temp();

	int InsertRegisterUser(User user);
//	
	User SelectLogin(User user);
//	
	int DeleteUser(int id);
//	
	User FindById(int id);
//
	int UpdateUser(User user);
	
	User FindEmail(String email);

}
