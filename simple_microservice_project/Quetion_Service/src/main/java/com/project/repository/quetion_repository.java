package com.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Quetions.question;

public interface quetion_repository extends JpaRepository<question, Integer>{
	
	List<question> findByQuizno(int quizno);

}
