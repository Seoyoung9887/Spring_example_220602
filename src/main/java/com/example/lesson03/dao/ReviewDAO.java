package com.example.lesson03.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.lesson03.model.Review;

@Repository
public interface ReviewDAO {
	
	public Review selectReview(@Param("id")int id);
	
	public int insertaddReview(Review review);
	
	public int insertReviewAsField(
			@Param("storeName") String storeName, 
			@Param("menu") String menu, 
			@Param("userName") String userName, 
			@Param("point") double point, 
			@Param ("review")String review);
	
	public int updateReviewById(
			@Param ("id") int id, 
			@Param ("review") String review);

}
