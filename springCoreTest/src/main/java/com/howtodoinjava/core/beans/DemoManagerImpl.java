package com.howtodoinjava.core.beans;

import org.springframework.stereotype.Service;

@Service
public class DemoManagerImpl implements DemoManager 
{
	@Override
	public String getServiceName() 
	{
		return "My first service with Spring <spring.version>4.3.7.RELEASE</spring.version>";
	}
}
