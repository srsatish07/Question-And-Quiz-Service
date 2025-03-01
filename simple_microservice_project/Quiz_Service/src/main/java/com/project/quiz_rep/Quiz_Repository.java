package com.project.quiz_rep;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Quiz.Quiz;

public interface Quiz_Repository extends JpaRepository<Quiz, Integer>{
	
	

}
