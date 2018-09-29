package com.practice.restws.appsocialmedia.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Message {
	private String id;
	private String author;
	private Date created;
	
	public Message()
	{
		
	}
	public Message(String id, String author, Date created) {
		this.id = id;
		this.author = author;
		this.created = created;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	

}
