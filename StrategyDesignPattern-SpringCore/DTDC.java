package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("dtdc")
@Lazy(true)
public final class DTDC implements ICourier   //Dependent class - 2
{
	public DTDC() {
		System.out.println("DTDC :: 0 param constructor invoked");
	}
	
	@Override
	public String deliver(int oid) 
	{
		return "DTDC is ready to deliver  OrderID - '"+ oid +"' products";
	}
}
