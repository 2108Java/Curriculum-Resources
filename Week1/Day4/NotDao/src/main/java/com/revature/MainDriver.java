package com.revature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MainDriver {
	
	/*
	 * Username
	 * Password
	 * Endpoint/URL
	 * 
	 */
	
	/*
	 * JDBC: 
	 * 		Java Database Connectivity. 
	 * 		This is what creates an API to abstract away connectin to my database. 
	 * 		A set of interfaces, that provides methods to interact with our DB. 
	 */
	
	public static String username = "java_login";
	public static String password = "password";
	public static String url = "jdbc:postgresql://database-2.cqoseij0k35s.us-east-2.rds.amazonaws.com/postgres";
	
	public static void main(String[] args) {
		
		
		System.out.println("Hello, what do you want to do?");		
		System.out.println("1) See all secrets!");
		System.out.println("2) Insert a secret");
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		switch(input) {
			case "1":
				try {
					Connection conn = DriverManager.getConnection(url, username, password);
					
					String sql = "select * from super_important_table;";
					
					PreparedStatement ps = conn.prepareStatement(sql);
					
					ResultSet rs = ps.executeQuery();
					
					while(rs.next()) {
						System.out.println(rs.getInt("id"));
						System.out.println(rs.getString("secret"));
					}
					
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			case "2":
				System.out.println("Put in the secret!");
				String secret = sc.nextLine();
				
				if(secret == null) {
					
				}else if(secret.length() == 0) {
					System.out.println("Scecret has to have letters in it!");
				}
				
			try {
				Connection conn =DriverManager.getConnection(url, username, password);
				
				String sql = "insert into super_important_table(secret) values (?);";
				
				PreparedStatement ps = conn.prepareStatement(sql);
				
				ps.setString(1, secret);
				
				ps.execute();
				
				System.out.println("secret inserted!");
				
				
//				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
				break;
			default:
				System.out.println("Invalid choice");
		}
		
		
		
		
		
		
	}

}
