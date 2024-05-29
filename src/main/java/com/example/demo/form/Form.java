package com.example.demo.form;

import java.util.Date;

public class Form {
	
	private String name;
	private String comment;
	private Date timestamp;
	
	public Form() {}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getComment() {
			return comment;
	}	
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp=timestamp;
	}
}

