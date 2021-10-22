package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.models.Food;
import com.revature.repo.FoodDao;

public class MainDriver {
	
	//Spring Container
	private static ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContextConfig.xml");
	
	private static void inializeDatabase(FoodDao fdao) {
		fdao.insertFood(new Food(0, "Burger", 2));
		fdao.insertFood(new Food(0, "Impossible Burger", 2.07));
		fdao.insertFood(new Food(0, "Beyond Hotdog", 3.5));
		fdao.insertFood(new Food(0, "Rice", 2));
		fdao.insertFood(new Food(0, "Tomatoe", 1));
	}

	public static void main(String[] args) {

			FoodDao fdao = appContext.getBean("FirstFoodDaoBean",FoodDao.class);
			
			inializeDatabase(fdao);
			
			System.out.println(fdao.selectAllFood());
		

	}

}
