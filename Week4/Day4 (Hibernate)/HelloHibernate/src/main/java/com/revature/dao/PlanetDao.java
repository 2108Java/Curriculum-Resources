package com.revature.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.models.Planet;
import com.revature.util.HibernateUtil;

public class PlanetDao {

	//Hibernate knows that we have crud methods!
	//it provides some basic crud operators for us
	
		public boolean insertPlanet(Planet p) {
			Session ses = HibernateUtil.getSession();
			Transaction tx = ses.beginTransaction();
			
			ses.save(p);
			
			tx.commit();
			ses.close();
			
			return true;
		}
		
		public boolean deletePlanet(Planet p) {
			return false;
		}
		
		public boolean updatePlanet(Planet p) {
			return false;
		}
		
		public Planet selectPlanetById(int id) {

			//This is also another common method
			//Not my Planet or my planet method 
			//I'm retrieiving an object based on it's primary key 
			
			Session ses = HibernateUtil.getSession();
			
			Planet p = ses.get(Planet.class, id);
			
			return p;
		}
		
		public List<Planet> selectAllPlanets() {
			return null;
		}
		
		public List<Planet> selectPlanetByName(String s) {
			return null;
		}
		
		public List<Planet> selectPlanetWithBlueInDescription(){
			return null;
		}
}
