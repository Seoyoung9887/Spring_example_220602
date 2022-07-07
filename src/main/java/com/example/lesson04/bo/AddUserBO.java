package com.example.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson04.dao.AddUserDAO;
import com.example.lesson04.model.AddUser;
@Service
public class AddUserBO {
	
     @Autowired
     private AddUserDAO addUserDAO;
	public void addUser(String name , String yyyymmdd, String email, String introduce ) {
		addUserDAO.insertaddUser(name, yyyymmdd, email, introduce);
	}
	public AddUser getLastNewUser() {
		return addUserDAO.selectLastNewUser();
		
	}
	public boolean existNewUserByName(String name) {
		return addUserDAO.existNewUserByName(name);
	}

}
