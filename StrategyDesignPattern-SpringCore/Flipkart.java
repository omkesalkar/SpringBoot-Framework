package com.nt.sbeans;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public final class Flipkart  //Target class
{
	//HAS-A Property
	@Autowired
	@Qualifier("bDart")
	private ICourier courier;
	
	public Flipkart()
	{
		System.out.println("Flipkart :: 0 param constructor invoked");
	}
	
	//b. Method
	public String shopping(String items[], double prices[])
	{
		System.out.println("Flipkart Shopping method");
		
		//Calculate Bill Amount
		double billAmount = 0.0;
		
		for(double p : prices) {
			billAmount += p;
		}
		
		//Generate Order ID Randomly
		int oid = (int) (Math.random() * 100000);
		
		//Deliver the order using courier
		String msg = courier.deliver(oid);
		
		return Arrays.toString(items) + " items are buying having total bill amount Rs."+ billAmount +"\n"+ msg;
		
	}
	
}

