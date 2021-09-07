package com.revature.repo;

import com.revature.models.User;

public interface UserDao {
	
	public User selectUserByUsername(String username);
	
	public boolean insertUser(User u);

}
