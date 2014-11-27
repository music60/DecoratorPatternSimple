package com.studyjun.decorator.food;

import java.io.FileInputStream;


/**
 * 
 * @author studyjun
 *  白饭
 * 
 */
public class Baifan extends Food {

	private Food food;

	public Baifan(Food food) {
		this.food = food;
	}

	public String getDescription() {
		
		return food.getDescription() + "白饭";
	}
	

	
	public float getCost() {
		return food.getCost() + 3.0f;
	}
}
