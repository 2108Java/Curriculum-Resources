package com.example.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Planet {

	private int id;
	private String name;
	private boolean rocky;
	private double mass;
	
}
