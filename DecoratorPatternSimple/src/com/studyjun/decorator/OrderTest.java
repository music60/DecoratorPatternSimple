package com.studyjun.decorator;

import com.studyjun.decorator.food.Baifan;
import com.studyjun.decorator.food.Food;
import com.studyjun.decorator.food.Taocan;
import com.studyjun.decorator.food.Jiatang;
import com.studyjun.decorator.food.Lawei;
import com.studyjun.decorator.food.Paigu;
import com.studyjun.decorator.food.Yinliao;

public class OrderTest {
	
	public static void main(String[] args) {
		
		//腊味套餐
		Taocan fo = new Taocan();
		Food baifan= new Baifan(fo);
		Food lawei = new Lawei(baifan);
		System.out.println("套餐："+lawei.getDescription());
		System.out.println("价格："+lawei.getCost());
		System.out.println("+++++++++++++++++++++++++++++++");
		
		//腊味加汤套餐
		Taocan fo1 = new Taocan();
		Food baifan1= new Baifan(fo1);
		Food lawei1 = new Lawei(baifan1);
		Food jiatang1 = new Jiatang(lawei1);
		System.out.println("套餐："+jiatang1.getDescription());
		System.out.println("价格："+jiatang1.getCost());
		System.out.println("+++++++++++++++++++++++++++++++");
		
		//排骨饮料套餐
		Taocan fo2 = new Taocan();
		Food baifan2= new Baifan(fo2);
		Food paigu2 = new Paigu(baifan2);
		Food yinliao2= new Yinliao(paigu2);
		System.out.println("套餐："+yinliao2.getDescription());
		System.out.println("价格："+yinliao2.getCost());
		System.out.println("+++++++++++++++++++++++++++++++");
		
	}
	
}
