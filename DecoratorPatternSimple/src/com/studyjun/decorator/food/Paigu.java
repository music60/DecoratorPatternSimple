package com.studyjun.decorator.food;

/**
 * 
 * @author studyjun
 *	排骨
 *
 */
public class Paigu extends Food{

	private Food food;
	
	public Paigu(Food food) {
		this.food = food;
	}
	
	public String getDescription() {
		return food.getDescription()+"排骨";
	}
	
	public float getCost() {
		return food.getCost()+5f;
	}
}
