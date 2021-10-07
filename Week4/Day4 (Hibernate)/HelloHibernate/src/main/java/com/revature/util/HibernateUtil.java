package com.revature.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	/*
	 * Hiberante has some important objects and interfaces 
	 * 
	 * Configuration : 
	 * 		This will parse our configuration file into a java object 
	 * 
	 * SessionFactory: 
	 * 		This is a resource intensive object to create, but once created 
	 * 		can produce sessions for our SQL commands 
	 * 
	 * Session: 
	 * 		ABstractions of our connections. Sessions will manage the the connection to our database 
	 * 			and allows us to do CRUD operations. 
	 * 
	 * Transction ACID
	 * 
	 */
	
	
	private final static SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	
	public static Session getSession() {
		return sf.openSession();
	}
	
	
	
}
