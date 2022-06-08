package com.turkcelltech.task;

import java.util.concurrent.Callable;

public class Task4Impl implements Callable<String>
{
	private int first;
	private int last;
	private int divisor;
	private String name;

	public Task4Impl(String name, int first, int last, int divisor) 
	{
		this.name=name;
		this.first=first;
		this.last=last;
		this.divisor=divisor;
				
	}

	public String call() throws Exception 
	{
		long t=System.currentTimeMillis();
		System.out.println(name + " task� �al��maya ba�lad�, first number " + first);
		
		int task4Sonuc= FutureTaskDemo.amountOfDivisibleBy(first, last, divisor);
		task4Sonuc= first; // MT sonuclari dogru mu anlamak icin.
		
		System.out.println(name + " task� bitti sonuc = " + task4Sonuc + " s�re = " + (System.currentTimeMillis() - t) );
		
		return name + " " + task4Sonuc; 
	}
}