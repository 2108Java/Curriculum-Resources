package com.revature.pojo;

import com.revature.User;

public class ChildUser extends User{

	
	public void aMethod() {
		System.out.println(this.password);
		System.out.println(this.amount);
		System.out.println(this.username);
	}
	
	@Override
	protected void setPassword(String password) {
		
	}
	
}
