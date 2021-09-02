package com.revature.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.models.ToDoItem;

public class ToDoDAOImpl implements ToDoDAO {
	
	String server = "localhost";
	String url = "jdbc:postgresql://" + server + "/postgres";
	String username = "postgres";
	String password = "p4ssw0rd";

	
	public boolean insertToDo(ToDoItem todo) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean deleteToDo(String todoTitle) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean deleteToDo(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public ToDoItem[] selectAllToDo() {

		//Establish a connection 
		//Establishing a connection is risky, so we're going to have to prepare for an exception
		
		try(Connection connection = DriverManager.getConnection(url, username, password)){
			
			String sql = "SELECT * FROM todo_table";
			
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			System.out.println(rs);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	
	public ToDoItem[] selectAllToDoComplete() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public ToDoItem[] selectAllToDoIncomplete() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public ToDoItem selectToDoById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public boolean completeToDo(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
