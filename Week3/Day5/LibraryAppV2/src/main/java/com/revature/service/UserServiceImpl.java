package com.revature.service;

import java.sql.Date;
import java.util.List;

import com.revature.models.Book;
import com.revature.models.User;
import com.revature.repo.BookDao;
import com.revature.repo.BookLoanDao;
import com.revature.repo.UserDao;

public class UserServiceImpl implements UserService {
	
	UserDao uDao;
	BookDao bDao;
	BookLoanDao loanDao;
	
	

	public UserServiceImpl(UserDao uDao, BookDao bDao, BookLoanDao loanDao) {
		super();
		this.uDao = uDao;
		this.bDao = bDao;
		this.loanDao = loanDao;
	}
	
	

	@Override
	public User getUserByUsername(String username) {
		// TODO Auto-generated method stub
		
		User user = uDao.selectUserByUsername(username); //we got the user with username and password
		
		List<Book> userBooks = loanDao.selectAllBooksByUserId(user.getId()); // now we complete the user with the books they have!
		
		user.setBookList(userBooks);
		
		return user;
	}

	@Override
	public boolean returnBook(User u, String bookTitle) {

		//For now we are going to not consider the date for simplicity sake 
		//I'm going to remove their 
		List<Book> bookList = u.getBookList();
		
		Book toBeRemoved = null;
		
		boolean deleteOperation = false;
		
		//check if book exists in their inventory
		for(Book b: bookList) {
			
			if(b.getName().equals(bookTitle)) {
				toBeRemoved = b; 
			}
		}
		
//		The Below loop will remove the book from the User object, but this does not PERSIST! We need to use the DAO to persist this into the dao layer
//		if(toBeRemoved != null) {
//			
//			bookList.remove(toBeRemoved);
//			deleteOperation = true;
//			
//		}
		
		
		if(toBeRemoved != null) {
			
			loanDao.deleteBookAndUser(u.getId(), toBeRemoved.getId());
			deleteOperation = true;
			
		}
		return deleteOperation;
	}

	@Override
	public boolean checkoutBook(User u, String bookTitle) {

		
		//Check if the bookTitle exists!
		
		Book b = bDao.selectBookByTitle(bookTitle);
		
		boolean status = false;
		
		if(b != null) {
			
			//Check if the book isn't already checked out!
			boolean alreadyLoaned = loanDao.checkIfBookIsLoaned(b.getId());
			
			if(!alreadyLoaned) {
				
				//Check if the user doesn't already have it!
				boolean userAlreadyOwnsBook = false;
				
				
				for(Book book: u.getBookList()) {
					if(book.getName().equals(bookTitle)) {
						userAlreadyOwnsBook = true;
					}
				}
				
				if(!userAlreadyOwnsBook) {
					
					loanDao.insertBookAndUser(u.getId(), b.getId(), new Date(0));
					status = true;
				}
				
			}
			
			
			
		}
		
		
		
		
		
		return status;
	}
	
	
	

}
