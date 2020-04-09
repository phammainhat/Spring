package com.spring.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

import com.spring.mybatis.model.Account;
import com.spring.mybatis.model.User;

@Mapper
public interface UserMapper {
	List<User> findAll();
	
	User findAll_temp();

	void insertRegisterAccount(User user);
	Account selectLastIdAccount();
	void insertRegisterUser(User user);
	
	Account selectLogin(Account account);
	
	int deleteUser(int id);
	int deleteAccount(int id);
	
	User findById(int id);
	
	int updateAccount(User user);
	int updateUser(User user);

}
