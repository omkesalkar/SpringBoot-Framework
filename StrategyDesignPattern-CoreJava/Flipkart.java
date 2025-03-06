package com.nt.comp;

import java.util.Arrays;

public class Flipkart //Target class
{
	private Courier courier;
	
	public void setCourier(Courier courier)
	{
		System.out.println("Flipkart.setCourier()");
		this.courier = courier;
	}
	
	//b. method
	public String shopping(String items[], double prices[])
	{
		//calculate bill amount
		double billAmount = 0;
		
		for(double p : prices)
		{
			billAmount += p;
		}
	
		//Generate the order id(Random number as the order id)
		int oid = (int) (Math.random() * 100000);
		
		//Deliver the product using courier
		String msg = courier.deliver(oid);
		
		return Arrays.toString(items) + " Items with bill amount:: " + billAmount + "\n" + msg;
	}
}
