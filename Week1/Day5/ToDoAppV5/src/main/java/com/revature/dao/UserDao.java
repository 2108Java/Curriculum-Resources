package com.revature.dao;

import com.revature.models.User;

public interface UserDao {

	User selectUserByUsername(String username);

}
