package com.revature.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Book;
import com.revature.models.User;
import com.revature.util.ConnectionFactory;

public class BookDaoImpl implements BookDao {

	@Override
	public boolean insertBook(Book b) {

		String sql = "INSERT INTO books_table (book_name,author,genre) VALUES (?,?,?)";
		boolean success = false;
		
		try(Connection conn = ConnectionFactory.getConnection()){
			
			
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, b.getName());
			ps.setString(2, b.getAuthor());
			ps.setString(3, b.getGenre());
			
			ps.execute(); // I expect something back, so I use an .executeQuery
			
			success = true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return success;
	}

	@Override
	public List<Book> selectAllBooks() {

		List<Book> bookList = new ArrayList<>();

		String sql = "SELECT * FROM books_table";
		
		try(Connection conn = ConnectionFactory.getConnection()){
			
			
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			
			ResultSet rs = ps.executeQuery(); // I expect something back, so I use an .executeQuery
			
			
			
			while(rs.next()) {
				
				bookList.add(
						new Book(rs.getInt("book_id"),
								rs.getString("book_name"),
								rs.getString("author"),
								rs.getString("genre")
						));
						
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return bookList;
	}

	@Override
	public Book selectBookByTitle(String title) {

		Book b = null;

		String sql = "SELECT * FROM books_table WHERE book_name = ?";
		
		try(Connection conn = ConnectionFactory.getConnection()){
			
			
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, title);
			
			ResultSet rs = ps.executeQuery(); // I expect something back, so I use an .executeQuery
			
			
			
			while(rs.next()) {
				
				b = 
						new Book(rs.getInt("book_id"),
								rs.getString("book_name"),
								rs.getString("author"),
								rs.getString("genre")
						);
						
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return b;
	}

	@Override
	public Book selectBookById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateBook(Book b) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteBookById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
