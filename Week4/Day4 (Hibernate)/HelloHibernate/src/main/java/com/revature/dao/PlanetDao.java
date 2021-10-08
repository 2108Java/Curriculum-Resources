package com.revature.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

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
//			ses.close();
			
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
			
//			ses.close();
			
			return p;
		}
		
		public List<Planet> selectAllPlanets() {
			
			List<Planet> planetList = null;
			
			Session ses = HibernateUtil.getSession();
			//Named Query 
			
			Query query = ses.getNamedQuery("viewAllPlanets");

			planetList = query.getResultList();
			
//			ses.close();
			
			return planetList;
		}
		
		public List<Planet> selectPlanetByName(String name) {
			
			//Hibernate is not aware of my particular business requirements. 
			//retrieve a Planet based on it's "name", both of which Hibernate did not bother to cater for. 
			
			List<Planet> planetList = null;
			Session ses = HibernateUtil.getSession();
			
			//Native SQL 
				String sql = "select * from planets where planet_name = " + "'" + name + "';" ;
				// SELECT * FROM planets WHEERE planet_name = 'Earth';
				
				
//				planetList = ses.createNativeQuery(sql,Planet.class).list();
				
				//kind of terrible, not modular, very dependant on a specific flavor of SQL 
			
			//Hibernate Query Language 
				
				String hql = "from Planet where name = '" + name + "'";
				//no select key word and no * - I don't specify the columns I get back 
				//we're targetting the Java objects themselves. 
				
				//HQL is to translate our Java object strings into a specific flavor of SQL. 
				
				planetList = ses.createQuery(hql,Planet.class).list();
				
				
			//Named Query 
				Query query = ses.createNamedQuery("viewPlanetsWithName");
				
				query.setParameter("name", name);
				
				planetList = query.getResultList();
				
				
			//Criteria API vs Criteria Builder depcreated version)
				
				//Criteria Builder 
				Criteria criteria = ses.createCriteria(Planet.class)
						.add(Restrictions.ilike("name", name));
				
				planetList = criteria.list();
			
//			ses.close();
			
			return planetList;
		}
		
		public List<Planet> selectPlanetWithBlueInDescription(){
			return null;
		}
}
