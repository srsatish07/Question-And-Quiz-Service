package com.project.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.project.Quiz.Quiz;
import com.project.quiz_rep.Quiz_Repository;
import com.project.services.QuetionClient;
import com.project.services.Quiz_service;

@Service
public class QuizServiceimpl implements Quiz_service{

	private Quiz_Repository quiz_Repository;
	
	private QuetionClient quetionClient;
	
	
	
	public QuizServiceimpl(Quiz_Repository quiz_Repository, QuetionClient quetionClient) {
		super();
		this.quiz_Repository = quiz_Repository;
		this.quetionClient = quetionClient;
	}

	@Override
	public Quiz add(Quiz quiz) {
		// TODO Auto-generated method stub
		return quiz_Repository.save(quiz);
	}

	@Override
	public List<Quiz> get() {
		// TODO Auto-generated method stub
		List<Quiz> quizes=quiz_Repository.findAll();
		
		List<Quiz> newQuizlist=quizes.stream().map(quiz -> {
			quiz.setQuetion(quetionClient.getQuetionQuiz(quiz.getId()));
			return quiz;
		}).collect(Collectors.toList());
		
		return newQuizlist;
	}

	@Override
	public Quiz get(int id) {
		// TODO Auto-generated method stub
		
		Quiz quiz=quiz_Repository.findById(id).orElseThrow(()-> new RuntimeException("Quiz Not Found"));
		quiz.setQuetion(quetionClient.getQuetionQuiz(quiz.getId()));
		
		return quiz;
	}

}
