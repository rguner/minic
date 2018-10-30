package com.turkcell.testwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class LogTest extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		PrintWriter out = response.getWriter();
		StringBuffer sb = new StringBuffer();
		System.out.println("�rnek kullan�m: http://my.turkcell.com.tr:7001/logtestapp/logtest?appender=tea.bonus&count=1&severity=error");
		System.out.println("Log testi basliyor ");	
				long start = System.currentTimeMillis();
		sb.append("<html>");
		sb.append("<body>");
		sb.append("<table>");
		int count = Integer.valueOf(request.getParameter("count"));
		String appender = request.getParameter("appender");
		String severity = request.getParameter("severity");
		
		sb.append("<tr><td>");
		sb.append("count="+count);
		sb.append("</td></tr>");
		sb.append("<tr><td>");
		sb.append("appender="+appender);
		sb.append("</td></tr>");sb.append("<tr><td>");
		sb.append("severity="+severity);
		sb.append("</td></tr>");
		
		Logger logger = Logger.getLogger(appender);
		
		for (int i = 0; i < count; i++) 
		{
			String threadName=Thread.currentThread().getName();
			long threadId=Thread.currentThread().currentThread().getId();

			System.out.println("Log testi "+ i +". ad�m");
			if (severity.equalsIgnoreCase("debug"))
				logger.debug("LogTest logabcxyz123 "  + threadName + " "+ threadId + " " +i);
			else if (severity.equalsIgnoreCase("error"))
				logger.error("LogTest logabcxyz123 " + threadName + " "+ threadId + " " +i);
			if (severity.equalsIgnoreCase("fatal"))
				logger.fatal("LogTest logabcxyz123 " + threadName + " "+ threadId + " " +i);
			
		}
		long finish = System.currentTimeMillis();
		long timeElapsed = finish - start;
		sb.append("</table>");
		sb.append("<br>Log testi bitti sure "+timeElapsed+" ms");
		sb.append("</body>");
		sb.append("</html>");
		System.out.println("Log testi bitti sure "+timeElapsed+" ms");
	    out.println(sb.toString());
	    out.close();
		
	}
}
