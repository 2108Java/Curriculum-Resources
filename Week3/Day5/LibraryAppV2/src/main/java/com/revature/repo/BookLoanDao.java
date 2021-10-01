package com.revature.repo;

import java.sql.Date;
import java.util.List;

import com.revature.models.Book;

public interface BookLoanDao {

	
	
	public List<Book> selectAllBooksByUserId(int userId);
	
	public boolean insertBookAndUser(int userId, int bookId, Date date);
	
	public boolean deleteBookAndUser(int userId, int bookId);
	

	public boolean checkIfBookIsLoaned(int bookId);
}
