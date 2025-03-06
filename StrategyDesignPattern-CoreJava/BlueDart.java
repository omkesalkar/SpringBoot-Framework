package com.nt.comp;

public final class BlueDart implements Courier //Dependent class - 2
{
	@Override
	public String deliver(int oid)
	{
		return oid + " OrderID, Your items are kept for deliver by BlueDart";
	}
}
