package com.example.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson04.dao.StudentDAO;
import com.example.lesson04.model.NewStudent;

@Service
public class StudentBO {
	@Autowired
	private StudentDAO studentDAO;
	public void getStudent(NewStudent newStudent ) {
		studentDAO.insertStudent(newStudent);
	}
	public NewStudent getStudentById(int id) {
		return studentDAO.selectStudentById(id);
	}

}
