package com.guner.sonar.futuretask;

import java.util.concurrent.Callable;

import org.joda.time.DateTime;

public class TaskImplJoda implements Callable<String>
{
	
	public static final String FORMAT="dd/MM/yyy HH:mm:ss";
	public TaskImplJoda() 
	{
	}

	public String call() throws Exception 
	{
		DateTime dateTime = new DateTime();
		String formattedDate;
		formattedDate=dateTime.toString(FORMAT);	
		return formattedDate;
	}
}