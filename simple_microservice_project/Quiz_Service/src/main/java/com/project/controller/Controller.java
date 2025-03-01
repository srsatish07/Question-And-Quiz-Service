package com.project.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Quiz.Quiz;
import com.project.services.Quiz_service;

@RestController
@RequestMapping("/quiz")
public class Controller {

	private Quiz_service quiz_service;
	
	public Controller(Quiz_service quiz_service) {
		
		this.quiz_service = quiz_service;
	}



	@PostMapping()
	public Quiz create_quiz(@RequestBody Quiz quiz) {
		
		return quiz_service.add(quiz);
	}
	
	@GetMapping()
	public List<Quiz> getall(){
		
		return quiz_service.get();
	}
	
	@GetMapping("/{id}")
	public Quiz gtone(@PathVariable int id){
		
		return quiz_service.get(id);
	}
	
	
	
}
