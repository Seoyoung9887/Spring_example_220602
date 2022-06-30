package com.example.lesson04.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.lesson04.model.NewStudent;

@Repository
public interface StudentDAO {
	public void insertStudent(
			NewStudent newStudent );
	
	public NewStudent selectStudentById(int id);

}
