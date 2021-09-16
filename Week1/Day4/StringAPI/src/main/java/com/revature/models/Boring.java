package com.revature.models;

public class Boring {
	
	private int boredomLevel;

	public Boring() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Boring(int boredomLevel) {
		super();
		this.boredomLevel = boredomLevel;
	}

	public int getBoredomLevel() {
		return boredomLevel;
	}

	public void setBoredomLevel(int boredomLevel) {
		this.boredomLevel = boredomLevel;
	}
	
	@Override
	public boolean equals(Object o) {
		
		boolean isSame = false;
		
		try {
			Boring newB = (Boring) o;
			
			if(this.boredomLevel == newB.boredomLevel) {
				isSame = true;
			}
			
		}catch(Exception e) {
			System.out.println("An Exception occured! Might not be the right object!");
		}
		
		
		
		return isSame;
	}
	

}
