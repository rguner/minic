package com.turkcelltech.task;

import java.util.concurrent.Callable;

public class TaskWithLongSleepImpl implements Callable<Integer>
{
	private int first;
	private int last;
	private int divisor;

	public TaskWithLongSleepImpl(int first, int last, int divisor) 
	{
		this.first=first;
		this.last=last;
		this.divisor=divisor;
				
	}

	public Integer call() throws Exception 
	{
		Thread.currentThread().sleep(30000);
		System.out.println("TaskWithLongSleepImpl bitti");
		return FutureTaskCalisma2.amountOfDivisibleBy(first, last, divisor);
	}
}