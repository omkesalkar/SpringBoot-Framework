package com.nt.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Flipkart;

public class StrategyDPTest 
{
	public static void main(String[] args) 
	{
		//Create the IOC Container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//Get Target Spring bean class obj reference
		Flipkart fpk = ctx.getBean("fpkt", Flipkart.class);
		
		//Invoke the b. Method
		String resultMsg = fpk.shopping(new String[] {"Shirt", "Tshirt", "Jeans"}, new double[] {780.0, 399.0, 1789.0});
		
		//Print the Items
		System.out.println(resultMsg);
		
		//Close Container
		ctx.close();
	}
}
