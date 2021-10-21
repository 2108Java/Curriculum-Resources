package com.revature.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
 * Every time we create a pojo, we have to genereate a lot of boiler plate code 
 * 
 * lombok helps to reduce the amount of boiler plate code
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Food {
	
	private int id;
	private String name;
	private double price;

}
