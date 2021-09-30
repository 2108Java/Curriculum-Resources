package com.revature;

public class User {
	
	private String name;
	private boolean admin;
	
	
	
	public User(String name, boolean admin) {
		super();
		this.name = name;
		this.admin = admin;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", admin=" + admin + "]";
	}
	
	
	

}
