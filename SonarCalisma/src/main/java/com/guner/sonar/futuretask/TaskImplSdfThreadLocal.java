package com.guner.sonar.futuretask;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Callable;

public class TaskImplSdfThreadLocal implements Callable<String>
{
	
	public TaskImplSdfThreadLocal() 
	{
	}

	public String call() throws Exception 
	{
		Date date= new Date();
		SimpleDateFormat sdf=SimpleDateTimePerThread.getDateTimeFormatter();
		String formattedDate;
		formattedDate=sdf.format(date);
		return formattedDate;
	}
}