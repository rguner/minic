package com.turkcell.spring.scope;

public class PrototypeSpringService {
	
	private int count=0;
	public void execute()
	{
		count++;
		System.out.println("PrototypeSpringService .. " + count);
	}

}
