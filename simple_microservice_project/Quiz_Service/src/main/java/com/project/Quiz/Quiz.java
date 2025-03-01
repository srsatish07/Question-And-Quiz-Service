package com.project.Quiz;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Quiz {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	
	@Transient
	private List<question> quetion;
	
	public List<question> getQuetion() {
		return quetion;
	}
	public void setQuetion(List<question> quetion) {
		this.quetion = quetion;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Quiz(int id, String title) {
		
		this.id = id;
		this.title = title;
	}
	public Quiz() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
