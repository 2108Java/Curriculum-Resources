package com.revature.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.revature.models.User;
import com.revature.util.ConnectionFactory;

public class UserDaoImpl implements UserDao {
	
	

	@Override
	public List<User> selectAllUsers() {
		
		
		return null;
	}

	@Override
	public User selectUserById(int id) {
		
		User u = null;

		String sql = "SELECT * FROM users_table WHERE id = ?";
		
		try(Connection conn = ConnectionFactory.getConnection()){
			
			
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery(); // I expect something back, so I use an .executeQuery
			
			
			
			while(rs.next()) {
				
				u = new User(id, 
						rs.getString("username"), 
						rs.getString("password"), 
						null);
						
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return u;
	}

	@Override
	public User selectUserByUsername(String username) {
		
		User u = null;

		String sql = "SELECT * FROM users_table WHERE username = ?";
		
		try(Connection conn = ConnectionFactory.getConnection()){
			
			
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, username);
			
			ResultSet rs = ps.executeQuery(); // I expect something back, so I use an .executeQuery
			
			
			
			while(rs.next()) {
				
				u = new User(rs.getInt("id"), 
						username, 
						rs.getString("password"), 
						null);
						
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return u;
	}

	@Override
	public boolean insertUser(User u) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUser(User u) {


		String sql = "UPDATE users_table SET username = ? AND password = ? WHERE id = ?";
		
		boolean operationSuccess = false;
		
		try(Connection conn = ConnectionFactory.getConnection()){
			
			
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, u.getUsername());
			ps.setString(2, u.getPassword());
			ps.setInt(3, u.getId());
			
			
			ps.execute(); // I expect something back, so I use an .executeQuery
			
			operationSuccess = true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			
		}
		
		return operationSuccess;
	}

}
