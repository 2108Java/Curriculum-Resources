package com.revature;

import com.revature.dao.TodoDao;
import com.revature.dao.TodoDaoImpl;
import com.revature.dao.UserDao;
import com.revature.dao.UserDaoImpl;
import com.revature.presentation.Presentation;
import com.revature.presentation.PresentationImpl;
import com.revature.service.Authenticator;
import com.revature.service.AuthenticatorImpl;

public class MainDriver {
	
	/*
	 * I want to allows users to login 
	 * 
	 * After logging in they should be able to see their tasks!
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
//		presentation.display();
		
		UserDao uDao = new UserDaoImpl();
		TodoDao tDao = new TodoDaoImpl();
//		//UserDao uDao = new BetterImpl();
//		
//		System.out.println(uDao.selectUserByUsername("fake"));
//		
//		
//		User u = uDao.selectUserByUsername("fake");
//		
//		u.setTodoList(tDao.selectActivitesByUserId(u.getId()));
//		
//		System.out.println(u);
		
		Authenticator auth = new AuthenticatorImpl(uDao,tDao);
		
//		System.out.println(auth.getUser("fake"));
		
		Presentation presentation = new PresentationImpl(auth);
		
		presentation.display();
		

	}

}
