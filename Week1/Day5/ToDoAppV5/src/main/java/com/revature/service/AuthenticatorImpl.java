package com.revature.service;

import com.revature.dao.TodoDao;
import com.revature.dao.UserDao;
import com.revature.models.User;

public class AuthenticatorImpl implements Authenticator {
	
	private UserDao userDao;
	private TodoDao todoDao;

	public AuthenticatorImpl(UserDao uDao, TodoDao tDao) {
		this.userDao = uDao;
		this.todoDao = tDao;
	}

	@Override
	public boolean authenticate(String username, String password) {

		User u = getUser(username); //might return a null!
		boolean success = false;
		
		if(u != null) {
			if(u.getPassword() != null && u.getPassword().equals(password)) {
				success = true;
			}
			
		}
		
		return success;
	}

	@Override
	public User getUser(String username) {

		User u = userDao.selectUserByUsername(username);
		
		u.setTodoList(todoDao.selectActivitesByUserId(u.getId()));
		
		return u;
	}

}
