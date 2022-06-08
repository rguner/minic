package com.turkcelltech.task;

import java.util.concurrent.Callable;

public class Task3Impl implements Callable<Integer> 
{
	
	private int first;
	private int last;
	private int divisor;

	public Task3Impl(int first, int last, int divisor) 
	{
		this.first=first;
		this.last=last;
		this.divisor=divisor;
				
	}
	
	public Integer call() throws Exception {
		long t=System.currentTimeMillis();
		System.out.println("task3 �al��maya ba�lad�, first number " + first  + " , last number " + last );
		
		int task3Sonuc=FutureTaskDemo.amountOfDivisibleBy(first, last, divisor);
		
		System.out.println("task3 bitti sonuc = " + task3Sonuc + " s�re = " + (System.currentTimeMillis() - t) );
		return task3Sonuc;		
		
		
	}
}