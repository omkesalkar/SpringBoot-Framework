package com.nt.comp;

public final class DTDC implements Courier  //Dependent class - 1 
{
	@Override
	public String deliver(int oid) 
	{		
		return oid + " OrderID, Your items are kept for deliver by DTDC";
	}
}
