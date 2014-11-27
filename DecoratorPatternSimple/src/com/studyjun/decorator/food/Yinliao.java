package com.studyjun.decorator.food;

/**
 * 
 * @author studyjun
 *	饮料
 *
 */
public class Yinliao extends Food{

	private Food food;
	
	public Yinliao(Food food) {
		this.food = food;
	}
	
	public String getDescription() {
		return food.getDescription()+"饮料";
	}
	
	public float getCost() {
		return food.getCost()+5.0f;
	}
}
