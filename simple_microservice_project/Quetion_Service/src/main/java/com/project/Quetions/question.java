package com.project.Quetions;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int qutionId;
	private String quetion;
	private int quizno;
	
	
	public int getQuizno() {
		return quizno;
	}
	public void setQuizno(int quizno) {
		this.quizno = quizno;
	}
	public int getQutionId() {
		return qutionId;
	}
	public void setQutionId(int qutionId) {
		this.qutionId = qutionId;
	}
	public String getQuetion() {
		return quetion;
	}
	public void setQuetion(String quetion) {
		this.quetion = quetion;
	}
	public question(int qutionId, String quetion, int quizno) {
		
		this.qutionId = qutionId;
		this.quetion = quetion;
		this.quizno=quizno;
	}
	public question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
