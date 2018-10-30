package com.turkcell.anotasyon;

import javax.annotation.Resource;

public class Anno1 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Anno1 anno1=new Anno1();
		anno1.do1();

	}
	
	@Resource
	Anno2 anno2;
	
	public void do1()
	{
		System.out.println("do1");
		anno2.do2();
	}

}
