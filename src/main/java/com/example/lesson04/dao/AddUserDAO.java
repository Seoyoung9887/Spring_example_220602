package com.example.lesson04.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.lesson04.model.AddUser;

@Repository
public interface AddUserDAO {
	public int insertaddUser(
			@Param("name") String name, 
			@Param("yyyymmdd") String yyyymmdd, 
			@Param("email") String email, 
			@Param("introduce") String introduce );
	
	public AddUser selectLastNewUser();
	
	public boolean existNewUserByName(String name);

}
