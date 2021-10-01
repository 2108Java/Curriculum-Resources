package com.revature.repo;

import java.util.List;

import com.revature.models.User;

public interface UserDao {
	
	//My interfaces don't declare dependencies
	//dependencies are something we need to achieve functionality. 
	//interfaces don't care "how" we achieve it, I could implement these methods using different dependencies. 
	
	
	public List<User> selectAllUsers();
	
	public User selectUserById(int id);
	
	public User selectUserByUsername(String username);
	
	public boolean insertUser(User u);
	
	public boolean updateUser(User u);

}
