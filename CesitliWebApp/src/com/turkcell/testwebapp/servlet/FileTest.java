package com.turkcell.testwebapp.servlet;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class FileTest extends HttpServlet {
	
	FileWriter writer=null;
	@Override
	public void init() throws ServletException {
		String tmpDirStr = System.getProperty("java.io.tmpdir");
		String hostAndWls=System.getProperty("HostName_WLSName");
		System.out.println("File Name= " + tmpDirStr + "//logtest_" +hostAndWls+".txt");
		File file = new File(tmpDirStr + "//logtest_" +hostAndWls+".txt");
      	// creates the file
      	try {
			//file.createNewFile();
			writer = new FileWriter(file);
			writer.write("Init yapildi "+ hostAndWls + " \n"); 
	      	writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      	// creates a FileWriter Object
      	      	
		super.init();
	}

	@Override
	public void destroy() {
		try {
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		super.destroy();
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
	    SimpleDateFormat ft = 
	    		new SimpleDateFormat ("yyyy.MM.dd hh:mm:ss a zzz");
	    String hostAndWls=System.getProperty("HostName_WLSName");
	    
		PrintWriter out = response.getWriter();
		StringBuffer sb = new StringBuffer();
		System.out.println("�rnek kullan�m: http://my.turkcell.com.tr:7001/logtestapp/filetest?count=1");
		System.out.println("File write testi basliyor ");	
		long start = System.currentTimeMillis();
		sb.append("<html>");
		sb.append("<body>");
		sb.append("<table>");
		String sCount=request.getParameter("count");
		if (sCount==null)
			sCount="1";
		int count = Integer.valueOf(sCount);
		
		for (int i = 0; i < count; i++) 
		{
			try
			{
				Date dNow = new Date();
				String threadName=Thread.currentThread().getName();
				long threadId=Thread.currentThread().currentThread().getId();
				writer.write(ft.format(dNow) + " FileTest " + threadName + " "+ threadId + " " + hostAndWls + " "+ writer.toString()+ " " + i + "\n"); 
		      	writer.flush();
			}
			catch(IOException ioe)
			{
				sb.append("<br>Dosyaya yazilamadi " + ioe.getMessage());
				if (writer!=null)
					sb.append("writer " + writer.toString());
				
				System.out.println("Dosyaya yazilamadi " + ioe.getMessage());
				if (writer!=null)
					System.out.println("writer " + writer.toString());
				ioe.printStackTrace();
			}
		}
		
		long finish = System.currentTimeMillis();
		long timeElapsed = finish - start;
		sb.append("</table>");
		sb.append("<br>File testi bitti sure "+timeElapsed+" ms");
		sb.append("</body>");
		sb.append("</html>");
		System.out.println("File testi bitti sure "+timeElapsed+" ms");
	    out.println(sb.toString());
	    out.close();
		
	}
}
