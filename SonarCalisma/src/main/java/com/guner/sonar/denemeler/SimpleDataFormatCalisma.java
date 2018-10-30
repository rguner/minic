package com.guner.sonar.denemeler;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.DateTime;


public class SimpleDataFormatCalisma {

	public static final int RUN_COUNT=9900000;
	ThreadLocal<SimpleDateFormat> localSimpleDateFormat = new ThreadLocal<SimpleDateFormat>() {
		protected SimpleDateFormat initialValue() {
			return new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		}
	};
	
	public static void main(String[] args) {
		SimpleDataFormatCalisma simpleDataFormatCalisma = new SimpleDataFormatCalisma();
				
		
		/* jvisualvm icin
		for (int i=0;i<Integer.MAX_VALUE;i++)
		{
			simpleDataFormatCalisma.method1();
			simpleDataFormatCalisma.method2();
			simpleDataFormatCalisma.method3();			
			simpleDataFormatCalisma.methodJoda();
		}
		*/
		
		//DateTime dateTime = new DateTime(); //joda initialize için 
		
		long time = System.currentTimeMillis();
		for (int i = 0; i < RUN_COUNT; i++) {
			simpleDataFormatCalisma.method1();  
		}
		System.out.println("method1 " + (System.currentTimeMillis() - time));
		
		time = System.currentTimeMillis();
		for (int i = 0; i < RUN_COUNT; i++) { 
			simpleDataFormatCalisma.method2(); 
		}
		System.out.println("method2 " + (System.currentTimeMillis() - time));
		
		time = System.currentTimeMillis();
		for (int i = 0; i < RUN_COUNT; i++) { 
			simpleDataFormatCalisma.method3(); 
		}
		System.out.println("method3 " + (System.currentTimeMillis() - time));
		
		time = System.currentTimeMillis();
		for (int i = 0; i < RUN_COUNT; i++) { 
			simpleDataFormatCalisma.methodJoda();
		}
		System.out.println("methodJoda " + (System.currentTimeMillis() - time));
		
		time = System.currentTimeMillis();
		for (int i = 0; i < RUN_COUNT; i++) { 
			simpleDataFormatCalisma.methodThreadLocal();
		}
		System.out.println("methodThreadLocal " + (System.currentTimeMillis() - time));
	}
	
	private static SimpleDateFormat sdfStatic = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
	
	private static SimpleDateFormat sdfStaticSyncronized = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");

	private void method1() {
		
		Date date= new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		String formattedDate=sdf.format(date);
		//System.out.println(formattedDate);		
	}
	
	private void method2() {
		Date date= new Date();		
		String formattedDate=sdfStatic.format(date);
		//System.out.println(formattedDate);		
		
	}
	
	private void method3() {
		Date date= new Date();
		String formattedDate;
		synchronized (sdfStaticSyncronized) {
			formattedDate=sdfStatic.format(date);			
		}		
		//System.out.println(formattedDate);		
		
	}
	
	private void methodJoda() {
		DateTime dateTime = new DateTime();
		String formattedDate;
		formattedDate=dateTime.toString("dd/MM/yyy HH:mm:ss");	
		//System.out.println(formattedDate);		
		
	}
	
	private void methodThreadLocal() {
		Date date= new Date();
		String formattedDate;
		formattedDate=localSimpleDateFormat.get().format(date);		
		//System.out.println(formattedDate);		
		
	}
	

}
