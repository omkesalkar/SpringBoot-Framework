package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("bDart")
@Lazy(true)
public final class BlueDart implements ICourier //Dependent class - 1
{
	public BlueDart() {
		System.out.println("BlueDart :: 0 param constructor invoked");
	}
	
	@Override
	public String deliver(int oid)
	{
		return "BlueDart courier is ready to deliver OrderID - '"+ oid +"' product.";
	}
}
