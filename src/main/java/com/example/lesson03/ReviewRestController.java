package com.example.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson03.bo.ReviewBO;
import com.example.lesson03.model.Review;

@RestController
public class ReviewRestController {
	@Autowired
	private ReviewBO reviewBO;
	
	//http://localhost/lesson03/ex01
	//http://localhost/lesson03/ex01?id=2
	@RequestMapping("/lesson03/ex01")
	public Review ex01(
			//@RequestParam("id") int id //필수 파라미터
			//@RequestParam(value="id") int id // 필수 파라미터
			//@RequestParam(value="id", required=true) int id //필수 파라미터
			//@RequestParam(value="id", required = false) Integer id // 비필수 파라미터
			@RequestParam(value="id", defaultValue = "1") int id // 비필수 파라미터, 디폴드 값은 1
			) {
	    System.out.println("####id:" +id);
		return reviewBO.getReview(id);
		
		
	}

}
