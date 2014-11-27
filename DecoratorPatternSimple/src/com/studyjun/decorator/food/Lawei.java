package com.studyjun.decorator.food;

/**
 * 
 * @author studyjun
 *	腊味
 *
 */
public class Lawei extends Food{

	private Food food;
	
	public Lawei(Food food) {
		this.food = food;
	}
	
	public String getDescription() {
		return food.getDescription()+"腊味";
	}
	
	public float getCost() {
		return food.getCost()+5f;
	}
}
