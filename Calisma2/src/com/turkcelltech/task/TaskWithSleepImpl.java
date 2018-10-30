package com.turkcelltech.task;

import java.util.concurrent.Callable;

public class TaskWithSleepImpl implements Callable<Integer>
{
	private int first;
	private int last;
	private int divisor;

	public TaskWithSleepImpl(int first, int last, int divisor) 
	{
		this.first=first;
		this.last=last;
		this.divisor=divisor;
				
	}

	public Integer call() throws Exception 
	{
		Thread.currentThread().sleep(10000);
		return FutureTaskCalisma2.amountOfDivisibleBy(first, last, divisor);
	}
}