package com.turkcell.filetest;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileTest {

	public static String path;
	public static int count;
	public static void main(String[] args) 
	{
		if (args.length==0)
		{
			System.out.println("path ve count olarak iki parametre  belirtin");
			System.exit(0);
		}
		path=args[0];
		if (path.equalsIgnoreCase("."))
			path="";
		count=Integer.valueOf(args[1]);		
		FileTest f= new FileTest();
		f.writeFile();
	}
	
	private void writeFile()
	{
		for (int i=0;i<count;i++)
		{
			try
			{
			  // Create file 
			  FileWriter fstream = new FileWriter(path+"out"+i+".txt");
			  BufferedWriter out = new BufferedWriter(fstream);
			  out.write("out.txt " + i + "\n");
			  System.out.println("yazildi "+i);
			  out.flush();
			  //Close the output stream
			  //out.close();
			}
			catch (Exception e)
			{//Catch exception if any
				  System.err.println("Error: " + e.getMessage());
			}			
		}
		try {
			Thread.currentThread().sleep(100000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
