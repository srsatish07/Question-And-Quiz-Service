package com.project.controller11;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Quetions.question;
import com.project.service.quetion_service;

@RestController
@RequestMapping("/quetion")
public class Controller1 {

	private quetion_service quetion_service;

	public Controller1(quetion_service quetion_service) {
		super();
		this.quetion_service = quetion_service;
	}
	
	//create
	@PostMapping
	public question create(@RequestBody question question) {
		
		return quetion_service.create(question);
	}
	
	@GetMapping
	public List<question> getalls(){
		
		return quetion_service.get();
	}
	
	@GetMapping("/{id}")
	public question getoneby(@PathVariable int id) {
		
		return quetion_service.getone(id);
	}
	
	@GetMapping("/quiz/{quizno}")
	public List<question> getquetionsofquiz(@PathVariable int quizno){
		return quetion_service.getquizno(quizno);
	}
	
	
}
