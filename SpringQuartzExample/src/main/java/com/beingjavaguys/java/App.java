package com.beingjavaguys.java;

/**
 * @author Nagesh Chauhan
 *
 */
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-quartz.xml");
	}
}
