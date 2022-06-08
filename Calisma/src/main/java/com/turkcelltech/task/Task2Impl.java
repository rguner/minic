package com.turkcelltech.task;

import java.util.concurrent.Callable;

public class Task2Impl implements Callable<Integer> 
{
	
	private int first;
	private int last;
	private int divisor;

	public Task2Impl(int first, int last, int divisor) 
	{
		this.first=first;
		this.last=last;
		this.divisor=divisor;
				
	}
	
	public Integer call() throws Exception {
		return FutureTaskDemo.amountOfDivisibleBy(first, last, divisor);
		
		
	}
}