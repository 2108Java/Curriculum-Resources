package com.revature;

import com.revature.repo.BookDao;
import com.revature.repo.BookDaoImpl;
import com.revature.repo.BookLoanDao;
import com.revature.repo.BookLoanDaoImpl;
import com.revature.repo.UserDao;
import com.revature.repo.UserDaoImpl;
import com.revature.service.AuthenticateService;
import com.revature.service.AuthenticateServiceImpl;
import com.revature.service.UserService;
import com.revature.service.UserServiceImpl;
import com.revature.util.PropertiesParser;

public class MainDriver {
	
	public static void main(String[] args) {
		
		
	   UserDao uDao = new UserDaoImpl();
	   BookDao bDao = new BookDaoImpl();
	   BookLoanDao loanDao = new BookLoanDaoImpl();
	   
	   
	   UserService userService = new UserServiceImpl(uDao, bDao, loanDao);
	   AuthenticateService authService = new AuthenticateServiceImpl(uDao);
	   
	   PropertiesParser.getProperties();
	   
	   
	   System.out.println(authService.verify("bob"));
	   System.out.println(authService.authenticate("bob", "p4ss"));
//	   
	   System.out.println(userService.getUserByUsername("bob"));
//	   
	   System.out.println(bDao.selectAllBooks());
//	   
//	   System.out.println(userService.checkoutBook(userService.getUserByUsername("bob"), "Fake"));
//	   
//	   System.out.println(userService.returnBook(userService.getUserByUsername("bob"), "Fake"));
	   
	   
	   
//	   System.out.println(uDao.selectUserById(1));
//	   
//	   System.out.println(uDao.selectUserByUsername("bob"));
//	   
//	   System.out.println(bDao.selectAllBooks());
//	   
//	   System.out.println(loanDao.selectAllBooksByUserId(1));
//	   
////	   System.out.println(bDao.insertBook(new Book(0, "Fake", "fake author", "fake genre")));
//	   
//	 System.out.println(loanDao.checkIfBookIsLoaned(2));
	   
	   
		
	}

}
