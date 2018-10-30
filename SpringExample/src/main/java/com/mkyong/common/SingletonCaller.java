package com.mkyong.common;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.turkcell.spring.scope.SingletenSpringService;

public class SingletonCaller extends Thread {
	
	public ClassPathXmlApplicationContext context;
	
	@Override
	public void run() {
		SingletenSpringService singletenSpringService=(SingletenSpringService) context.getBean("singletonSpringService");
		
		while(true)
		{
			singletenSpringService.execute();
		}
	
	}

}
