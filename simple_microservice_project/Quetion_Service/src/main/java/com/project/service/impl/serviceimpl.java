package com.project.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.Quetions.question;
import com.project.repository.quetion_repository;
import com.project.service.quetion_service;

@Service
public class serviceimpl implements quetion_service{
	
	private quetion_repository repository;
	
	

	public serviceimpl(quetion_repository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public question create(question question) {
		// TODO Auto-generated method stub
		return repository.save(question);
	}

	@Override
	public List<question> get() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	

	@Override
	public question getone(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElseThrow(()->new RuntimeException("Quetion not found"));
	}

	@Override
	public List<question> getquizno(int quizno) {
		// TODO Auto-generated method stub
		return repository.findByQuizno(quizno);
	}
	

}
