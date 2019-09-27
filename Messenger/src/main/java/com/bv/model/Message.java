package com.bv.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {

	private long id;
	private String message;
	private Date createdDate;
	private String author;
	

public Message(long id, String message, Date createdDate, String author) {
		super();
		this.id = id;
		this.message = message;
		this.createdDate = createdDate;
		this.author = author;
	}
public Message() {
	// TODO Auto-generated constructor stub
}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}


