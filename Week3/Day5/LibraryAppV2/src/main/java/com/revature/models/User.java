package com.revature.models;


import java.util.List;

public class User {
	
	
	private int id;
	private String username;
	private String password;
	private List<Book> bookList;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(int id, String username, String password, List<Book> bookList) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
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


	public List<Book> getBookList() {
		return bookList;
	}


	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", bookList=" + bookList + "]";
	}
	
	
	
	
	
	
	

}
