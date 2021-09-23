package com.revature.models;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	
	private int id; //uniquelly identify our user (primary key)
	private String username; //authentication
	private String password; //authentication
	
	private double fees; //charged fees for late withdrawl
	
	private List<Book> bookList; //list of books that we have. 
	
	public User() {
		
		this("placeholder","placeholder");
		
	}
	
	public User(String username, String password) {
		
		this(-1,username,password,0.0,new ArrayList<>());
		
		
	}

	public User(int id, String username, String password, double fees, List<Book> bookList) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.fees = fees;
		this.bookList = bookList;
	}

	
	
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	
	
	

}
