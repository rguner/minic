package com.mkyong.common;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Spring-Quartz.xml");
		
		/*
		SingletenSpringService singletenSpringService=(SingletenSpringService) context.getBean("singletonSpringService");
		PrototypeSpringService prototypeSpringService=(PrototypeSpringService) context.getBean("prototypeSpringService");
		
		singletenSpringService.execute();
		prototypeSpringService.execute();
		*/
		
		/* Multithreaded kullanim
		SingletonCaller singletonCaller = new SingletonCaller();
		singletonCaller.context=context;
		singletonCaller.start();
		SingletonCaller singletonCaller2 = new SingletonCaller();
		singletonCaller2.context=context;
		singletonCaller2.start();
		*/
		
		
		
	}
}