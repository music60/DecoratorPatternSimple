package com.studyjun.decorator.food;

/**
 * 
 * @author studyjun
 *	加汤
 *
 */
public class Jiatang extends Food{

	private Food food;
	
	public Jiatang(Food food) {
		this.food = food;
	}
	
	public String getDescription() {
		return food.getDescription()+"加汤";
	}
	
	public float getCost() {
		return food.getCost()+8.0f;
	}
}
