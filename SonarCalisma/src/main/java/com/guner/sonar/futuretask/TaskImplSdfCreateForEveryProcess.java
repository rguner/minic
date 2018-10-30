package com.guner.sonar.futuretask;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Callable;

public class TaskImplSdfCreateForEveryProcess implements Callable<String>
{
	public static final String FORMAT="dd/MM/yyy HH:mm:ss";
	public TaskImplSdfCreateForEveryProcess() 
	{
	}

	public String call() throws Exception 
	{
		Date date= new Date();
		SimpleDateFormat sdf = new SimpleDateFormat(FORMAT);
		String formattedDate=sdf.format(date);
		return formattedDate;
	}
}