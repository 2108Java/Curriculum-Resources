package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Todo;
import com.revature.util.ConnectionFactory;

public class TodoDaoImpl implements TodoDao {
	
	ConnectionFactory connectionFactory = new ConnectionFactory();

	@Override
	public List<Todo> selectActivitesByUserId(int id) {
		
		String sql = "SELECT * FROM todo_table WHERE fk_user_id = ?";
		List<Todo> usersTodos = new ArrayList<>();
		
		try {
			Connection connection = connectionFactory.getConnection();
			
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				usersTodos.add(
						new Todo(rs.getInt("todo_id"),
								rs.getString("title"), 
								rs.getString("description"), 
								rs.getBoolean("complete"))
						);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return usersTodos;
	}

}
