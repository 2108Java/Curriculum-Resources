package com.revature.dao;

import java.util.List;

import com.revature.models.Todo;

public interface TodoDao {

	List<Todo> selectActivitesByUserId(int id);

}
