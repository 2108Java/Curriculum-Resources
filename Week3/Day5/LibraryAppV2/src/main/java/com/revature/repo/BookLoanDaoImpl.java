package com.revature.repo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Book;
import com.revature.util.ConnectionFactory;

public class BookLoanDaoImpl implements BookLoanDao {

	@Override
	public List<Book> selectAllBooksByUserId(int userId) {

		List<Book> userBookList = new ArrayList<>();

		String sql = "SELECT * FROM (SELECT * FROM books_table, user_book_loan WHERE books_table.book_id = user_book_loan.book_id) AS book_join WHERE book_join.user_id = ?;";
		
		
		
		try(Connection conn = ConnectionFactory.getConnection()){
			
			
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, userId);
			
			ResultSet rs = ps.executeQuery(); // I expect something back, so I use an .executeQuery
			
			
			
			while(rs.next()) {
				
				userBookList.add(
						new Book(rs.getInt("book_id"),
								rs.getString("book_name"),
								rs.getString("author"),
								rs.getString("genre"),
								rs.getDate("due_date")
						));
						
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return userBookList;
	}

	@Override
	public boolean insertBookAndUser(int userId, int bookId, Date date) {

		String sql = "INSERT INTO user_book_loan VALUES (?, ? ,?);";
		
		boolean daoOperation = false;
		
		try(Connection conn = ConnectionFactory.getConnection()){
			
			
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, userId);
			
			ps.setInt(2, bookId);
			
			ps.setDate(3, date);
			
			ps.execute();
			
			daoOperation = true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

		return daoOperation;
	}

	public boolean deleteBookAndUser(int userId, int bookId) {
		
		String sql = "DELETE FROM user_book_loan WHERE user_id = ? AND book_id = ?;";
		
		boolean daoOperation = false;
		
		try(Connection conn = ConnectionFactory.getConnection()){
			
			
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, userId);
			
			ps.setInt(2, bookId);
			
			ps.execute();
			
			daoOperation = true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

		return daoOperation;
		
	}

	@Override
	public boolean checkIfBookIsLoaned(int bookId) {

		

		String sql = "SELECT * FROM user_book_loan WHERE book_id = ?";
		
		boolean bookIsAlreadyLoaned = false;
		
		try(Connection conn = ConnectionFactory.getConnection()){
			
			
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, bookId);
			
			ResultSet rs = ps.executeQuery(); // I expect something back, so I use an .executeQuery
			
			
			//check the result set to see if it's empty or not!
			if(rs.next()) {
				bookIsAlreadyLoaned = true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return bookIsAlreadyLoaned;
	}

	
	
}
