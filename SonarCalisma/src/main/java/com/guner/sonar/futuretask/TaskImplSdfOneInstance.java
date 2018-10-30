package com.guner.sonar.futuretask;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Callable;

public class TaskImplSdfOneInstance implements Callable<String>
{
	private SimpleDateFormat sdf;

	public TaskImplSdfOneInstance(SimpleDateFormat sdf) 
	{
		this.sdf=sdf;
				
	}

	public String call() throws Exception 
	{
		Date date= new Date();		
		String formattedDate=sdf.format(date);
		return formattedDate;
	}
	
//	public void calisma()
//	{
//		
//	}
	
	public void printOut()
	{
		System.out.println("ramazan");
	}
	
	public void printOutDiger()
	{
		System.out.println("diger");
	}
	
	
}