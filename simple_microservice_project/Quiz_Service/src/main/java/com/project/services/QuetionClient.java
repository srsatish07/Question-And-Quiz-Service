package com.project.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.Quiz.question;

@FeignClient(name = "QUETION-SERVICE")
public interface QuetionClient {
	
	@GetMapping("/quiz/{quizno}")
	List<question> getQuetionQuiz(@PathVariable int quizno);

}
