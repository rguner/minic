package com.howtodoinjava.core.verify;

import com.example.caching.CacheRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.howtodoinjava.core.beans.DemoManager;
import com.howtodoinjava.core.config.ApplicationConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VerifySpringCoreFeature 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
	    DemoManager  obj = (DemoManager) context.getBean("demoManagerImpl");
	    System.out.println( obj.getServiceName());

		CacheRunner cacheRunner = (CacheRunner) context.getBean("cacheRunner");
		cacheRunner.run();

	}
}
