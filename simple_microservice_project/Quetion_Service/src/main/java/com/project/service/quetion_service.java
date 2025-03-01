package com.project.service;

import java.util.List;

import com.project.Quetions.question;

public interface quetion_service {
	
	question create(question question);
	
	List<question> get();
	
	question getone(int id);
	
	List<question> getquizno(int quizno);

}
