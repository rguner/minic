package com.turkcell.spring.scope;

public class SingletenSpringService 
{
	private int count=0;
	public void execute()
	{
		//synchronized (this) 
		{
			count++;
		}
		
		System.out.println("SingletenSpringService .. " + count);
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
