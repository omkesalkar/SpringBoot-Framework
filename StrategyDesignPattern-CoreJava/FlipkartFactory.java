package com.nt.factory;

import com.nt.comp.BlueDart;
import com.nt.comp.Courier;
import com.nt.comp.DTDC;
import com.nt.comp.Flipkart;

public class FlipkartFactory //Factory Pattern Class
{
	//Static factory method having factory pattern logic
	public static Flipkart getInstance(String CourierType)
	{
		//Create Depenedent class obj
		Courier courier = null;
		
		if(CourierType.equalsIgnoreCase("dtdc")) 
			courier = (Courier) new DTDC();
		else if(CourierType.equalsIgnoreCase("blueDart"))
			courier = (Courier) new BlueDart();
		else 
			throw new IllegalArgumentException("Invalid Courier Type");
		
		//Create target class obj
		Flipkart fpkt = new Flipkart();
		
		//Assign dependent class object to target class obj
		fpkt.setCourier(courier);
		
		return fpkt;
	}
}
