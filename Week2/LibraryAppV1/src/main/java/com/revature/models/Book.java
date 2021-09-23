package com.revature.models;

public class Book {

	public static final String[] CATEGORIES = {"Fantasy","Sci-Fi","Non-Fiction"};
	
	
	private int isbn; //id
	private String title;
	private String author; 
	private int pages;
	private String genre;
	
	
	public Book() {
		this("fake title","fake author","fake genre");
		// TODO Auto-generated constructor stub
	}
	
	public Book(String title, String author, String genre) {
		this(-1,title,author,-1,genre);
	}
	
	
	public Book(int isbn, String title, String author, int pages, String genre) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.pages = pages;
		this.genre = genre;
	}
	
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", pages=" + pages + ", genre="
				+ genre + "]";
	}
	
	
	
	
	
	
}
