package com.revature;

import com.revature.controller.RequestMapping;

import io.javalin.Javalin;

public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Javalin app = Javalin.create().start(7000);
		
		RequestMapping.settingUpEndpoints(app);
		
		

	}

}
