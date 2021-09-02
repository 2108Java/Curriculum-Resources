package com.revature.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.models.ToDoItem;

public class ToDoDAOImpl implements ToDoDAO {
	
	//Configuration information to connect to our database
	String server = "localhost";
	String url = "jdbc:postgresql://" + server + "/postgres";
	String username = "postgres";
	String password = "p4ssw0rd";

	
	public boolean insertToDo(ToDoItem todo) {

		boolean success = false;
		//1. Connect to database!
		try(Connection connection = DriverManager.getConnection(url,username,password)){
			
			//2. Write a SQL statement String
			
			String sql = "INSERT INTO todo_table VALUES (?,?,?,?)";
			
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ps.setInt(1, todo.getId());
			ps.setString(2, todo.getTitle());
			ps.setString(3, todo.getDescription());
			ps.setBoolean(4, todo.isComplete());
			
			ps.execute();
			
			success = true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		return success;
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

		ToDoItem[] itemArray = new ToDoItem[10];
		
		//Establish a connection 
		//Establishing a connection is risky, so we're going to have to prepare for an exception
		//We use the Connection interface 
		//(abstracts away connection to the database using methods like "getConnection" to connect our DB)
		// Postgresql driver (our Maven dependency) will actually implement those methods. 
		
		try(Connection connection = DriverManager.getConnection(url, username, password)){
			
			String sql = "SELECT * FROM todo_table";
			
			PreparedStatement ps = connection.prepareStatement(sql);
			
			//ResultSet is the information we receive from the DB, based on our Select query
			//We do a "executeQuery" when we expect something back. 
			ResultSet rs = ps.executeQuery();
			
			int i = 0;
			
			while(rs.next()) { //rs.next() returns true or false depending on whether there is another row available
				
				//looping through all the rows until there are no rows!
				
				itemArray[i] = new ToDoItem(rs.getInt("id"),
									rs.getString("title"),
									rs.getString("description"),
									rs.getBoolean("complete"));
				i++;
				
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return itemArray;
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

		String sql = "UPDATE table todo_table SET complete = ? WHERE id = ?";
		
		//ps.setBoolean(1, true);
		return false;
	}

}
