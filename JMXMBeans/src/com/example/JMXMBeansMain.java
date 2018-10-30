package com.example;

import javax.management.MBeanServer;
import javax.management.ObjectName;

import java.lang.management.ManagementFactory;

public class JMXMBeansMain {

	public static void main(String[] args) throws Exception {

		MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();

		ObjectName name = new ObjectName("com.example:type=Hello");
		Hello mbean = new Hello();
		mbs.registerMBean(mbean, name);

		ObjectName nameMerhaba = new ObjectName("com.example:type=ConsoledaGorunenMBeanAdi");
		Merhaba merhaba = new Merhaba();
		mbs.registerMBean(merhaba, nameMerhaba);

		for (int i = 0; i < 1000; i++) {
			mbean.setCacheSize(i);
			mbean.setName("ramazan" + i);
			Thread.sleep(100);

		}
		System.out.println("Waiting forever...");
		Thread.sleep(Long.MAX_VALUE);
	}
}
