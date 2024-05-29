package com.example.demo.entity;

import java.util.Date;

public class EntForm {
	
	private String name;
	private String comment;
	private Date datetime;
	
	public EntForm() {};
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;	
	}
	
	public String getComment() {
		return comment;
	}
	
	public void setComment(String comment) {
		this.comment=comment;
	}
	
	public Date getDatetime() {
	     return datetime;
	}

    public void setDatetime(Date datetime) {
	     this.datetime = datetime;
	}
}
