package com.project.services;

import java.util.List;

import com.project.Quiz.Quiz;


public interface Quiz_service {
	
	Quiz add(Quiz quiz);
	
	List<Quiz> get();
	
	Quiz get(int id);

}
