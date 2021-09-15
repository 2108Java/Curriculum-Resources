package com.revature;

public class User { //Pojo : Plain Old Java Object. 
	//POJO typically only stores states/attributes. 
	
	/*
	 * Encapsulation:
	 * 		Practice of restricting access to resources within your class or objects. 
	 * 		This is to ensure data isn't accessible for dangerous operations. 
	 * 
	 * 		Java implements encapsulation via access modifiers. 
	 * 		From least secure to most secure: 
	 * 
	 * 		public : 
	 * 			This resource is accessible to any system.
	 * 
	 * 		protected: 
	 * 			This resources is only available to the enclosing class or child classes. 
	 * 			Available to any class within the same package. 
	 * 
	 * 		default/package (implicit):
	 * 			This resource is only available to class or objects within the same package.
	 *  
	 * 		private: 
	 * 			Only available to the class, no other system. 
	 */
	
	private String username;
	private double amount;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		//aditional logic 
		this.username = username;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	private String password; //I can't use this attribute anywhere else!
	
	
	public String getPassword() { //This is a GETTER method
		//This is a programmatic way of accessing our attributes. 
		//We can implement logic to stop any dangerous operations. 
		
		return this.password;
	}
	
	protected void setPassword(String newPassword) {
		if(newPassword.length() < 10) {
			System.out.println("Make your password longer!");
		}else {
			this.password = newPassword;
		}
		
	}

}
