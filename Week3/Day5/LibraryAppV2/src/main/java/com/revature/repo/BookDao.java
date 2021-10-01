package com.revature.repo;

import java.util.List;

import com.revature.models.Book;

public interface BookDao {
	
	
	public boolean insertBook(Book b);
	
	
	public List<Book> selectAllBooks();
	
	
	public Book selectBookByTitle(String title);
	public Book selectBookById(int id);
	
	
	public boolean updateBook(Book b);
	
	
	public boolean deleteBookById(int id);
	
	
	

}
