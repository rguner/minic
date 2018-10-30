package com.guner.sonar.futuretask;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Callable;

public class TaskImplSdfOneInstanceSyncronized implements Callable<String>
{
	private SimpleDateFormat sdf;

	public TaskImplSdfOneInstanceSyncronized(SimpleDateFormat sdf) 
	{
		this.sdf=sdf;
				
	}

	public String call() throws Exception 
	{
		Date date= new Date();
		String formattedDate;
		synchronized (sdf) {
			formattedDate=sdf.format(date);
		}		
		return formattedDate;
	}
}