package com.example.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.lesson04.bo.StudentBO;
import com.example.lesson04.model.NewStudent;

@RequestMapping("/lesson04")
@Controller
public class NewStudentController {
	@Autowired
	private StudentBO studentBO;
	//http://localhost/lesson04/add_student_view
	@RequestMapping("/add_student_view")
	public String addStudentView() {
		return "lesson04/addStudentView";
	}
	//http://localhost/lesson04/add_student
	@PostMapping("/add_student")
	public String addStudent(
			@ModelAttribute NewStudent newStudent, //태그에서 name 속성에 일치하는 필드에 값이 들어간다.
			Model model) { 
		
		//db insert
		studentBO.getStudent(newStudent);
		//db select => 가입했던 데이터
		newStudent =  studentBO.getStudentById(newStudent.getId());
		//model에 담는다.
		model.addAttribute("result", newStudent);
		model.addAttribute("subject", "학생정보");
		//return jsp 경로
		return"lesson04/afterStudentView";
	}

}
