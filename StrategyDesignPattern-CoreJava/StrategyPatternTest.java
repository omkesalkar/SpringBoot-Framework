package com.nt.test;

import com.nt.comp.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StrategyPatternTest
{
	public static void main(String[] args) 
	{
		//Use factory pattern to target class obj
		Flipkart fpkt = FlipkartFactory.getInstance("blueDart");
		
		//Invoke the b. method
		String resultMsg = fpkt.shopping(new String[] {"Shirt", "Trouser"}, new double[] {5000.0, 6000.0});
		
		System.out.println(resultMsg);
	}
}
