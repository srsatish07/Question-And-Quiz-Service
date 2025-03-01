package com.project.Quiz;


public class question {
	
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
