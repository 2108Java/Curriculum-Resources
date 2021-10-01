package com.revature.models;

import java.sql.Date;

public class Book {

	
	private int id;
	private String name;
	private String author;
	private String genre;
	private Date dueDate;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int id, String name, String author, String genre) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.genre = genre;
	}
	
	
	public Book(int id, String name, String author, String genre, Date dueDate) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.genre = genre;
		this.dueDate = dueDate;
	}
	
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", genre=" + genre + ", dueDate=" + dueDate
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
