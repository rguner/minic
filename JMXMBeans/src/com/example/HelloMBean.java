package com.example;

// adı MBean ile bitmek zorunda.
public interface HelloMBean {

	public void sayHello();

	public int add(int x, int y);

	public String getName();

	public String setName(String s);

	public int getCacheSize();

	public void setCacheSize(int size);
}
