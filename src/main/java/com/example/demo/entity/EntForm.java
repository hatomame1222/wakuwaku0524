package com.example.demo.entity;

import java.time.LocalDateTime;

public class EntForm {
	private String name;
	private String content;
	private LocalDateTime createdAt;
	
	public EntForm() {};
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;	
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String comment) {
		this.content=comment;
	}
}
