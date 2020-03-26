package com.spring.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.spring.mybatis.model.User;

@Mapper
public interface UserMapper {
//	@Select("select * from user")
//	List<User> findAll();
//	
//	@Insert("insert into user(id, username, password) value(#{id},#{username},#{password})")
//	//@SelectKey(statement="select last_insert_id()", keyProperty="id", before=false, resultType=Integer.class)
//	void insert(User user);
//	
//	@Select("select * from user where id=#{id}")
//	User getById(int id);
//	
//	@Delete("delete from user where id=#{id}")
//	void delete(int id);
//	
//	@Update("update user set id=#{id}, username=#{username}, password=#{password} ")
//	void update(User user);
	public List<User> findAll();
}
