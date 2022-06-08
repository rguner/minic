package com.turkcelltech.task;

import java.util.concurrent.Callable;

public class Task1Impl implements Callable<Integer>
{
	private int first;
	private int last;
	private int divisor;

	public Task1Impl(int first, int last, int divisor) 
	{
		this.first=first;
		this.last=last;
		this.divisor=divisor;
				
	}

	public Integer call() throws Exception 
	{
		long t=System.currentTimeMillis();
		System.out.println("task1 �al��maya ba�lad�, first number " + first  + " , last number " + last );
		
		int task1Sonuc= FutureTaskDemo.amountOfDivisibleBy(first, last, divisor);
		
		System.out.println("task1 bitti sonuc = " + task1Sonuc + " s�re = " + (System.currentTimeMillis() - t) );
		return task1Sonuc;
	}
}