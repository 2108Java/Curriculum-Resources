package com.revature.repo;



import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.models.Food;

@Repository("FirstFoodDaoBean")
@Transactional
public class FoodDao {
	
	//We will need sessions
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	
//	@Transactional
	public void insertFood(Food food) {
		
//		Session ses = sessionFactory.openSession();
//		
//		Transaction tx = ses.beginTransaction();
//		
//		ses.save(food);
//		
//		tx.commit();
//		
//		ses.close();
		
		sessionFactory.getCurrentSession().save(food);
		
	}
	
//	@Transactional
	public List<Food> selectAllFood(){
		
//		Session ses = sessionFactory.openSession();
//		
//		List<Food> foodList = ses.createQuery("from Food",Food.class).list();
//		
//		ses.close();
		
		List<Food> foodList = sessionFactory.getCurrentSession().createQuery("from Food", Food.class).list();
		
		return foodList;
	}

}
