package com.turkcelltech.task;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class NamedThreadFactory implements ThreadFactory {
 
    private AtomicInteger counter = new AtomicInteger();
	private String name="Async Task Thread - ";
	
	public Thread newThread(Runnable r) 
	{
	
	    Thread t = new Thread(r);
	    t.setName(name + counter.incrementAndGet());
	    t.setDaemon(false);
	    return t;	
	}

}