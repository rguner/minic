package com.turkcelltech.task;

import java.util.concurrent.Callable;

public class TaskImpl implements Callable<Integer>
{
	private int first;
	private int last;
	private int divisor;

	public TaskImpl(int first, int last, int divisor) 
	{
		this.first=first;
		this.last=last;
		this.divisor=divisor;
				
	}

	public Integer call() throws Exception 
	{
		return FutureTaskDemo.amountOfDivisibleBy(first, last, divisor);
	}
}