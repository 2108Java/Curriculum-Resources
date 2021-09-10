package com.revature.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.exceptions.BusinessException;
import com.revature.models.ToDoItem;

public class ToDoDAOImpl implements ToDoDAO {
	
	private String dbLocation = "localhost";
	private String username = "postgres";
	private String password = "p4ssw0rd";
	private String url = "jdbc:postgresql://" + dbLocation + "/postgres";

	@Override
	public ToDoItem[] selectAllToDos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertToDo(ToDoItem todo) throws BusinessException{
		
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
		
		
//		return false;
	}

	@Override
	public ToDoItem[] getAllIncompleteTodos() {

		ToDoItem[] incompleteTodos = new ToDoItem[10];
		try(Connection connection = DriverManager.getConnection(url, username, password)){
			
			String sql = "SELECT title, description, complete FROM todo_table WHERE complete = ?";
			
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setBoolean(1, false);
			
			ResultSet rs = ps.executeQuery();
			
			int i = 0;
			while(rs.next()) {
				
				incompleteTodos[i] = new ToDoItem(rs.getString("title"), 
						rs.getString("description"), 
						rs.getBoolean("complete"));
				i++;
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return incompleteTodos;
	}

	@Override
	public boolean deleteToDo(int deleteId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateToDo(int id) {

		boolean success = false;
		//1. Connect to database!
		try(Connection connection = DriverManager.getConnection(url,username,password)){
			
			//2. Write a SQL statement String
			
			String sql = "UPDATE todo_table SET complete = ? WHERE id = ?";
			
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ps.setBoolean(1, true);
			ps.setInt(2, id);

			
			ps.execute();
			
			success = true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		
		return success;

	}

	@Override
	public ToDoItem getTodoById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
