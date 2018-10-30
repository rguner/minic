package com.turkcell.testwebapp3.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionSharingTest3 extends HttpServlet {
	
	
	private static final long serialVersionUID = 993830476414917214L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
	    
	    HttpSession httpSession = request.getSession();
	    
	    String attribute3=(String) httpSession.getAttribute("attribute3");
	    String attribute4=(String) httpSession.getAttribute("attribute4");
	    
	    httpSession.setAttribute("attribute3", "attribute3Value");
		
		PrintWriter out = response.getWriter();
		
		StringBuffer requestUrl=request.getRequestURL();
		
		String requestUrlS=requestUrl.toString();
		String contextUrl=requestUrlS.replaceAll(request.getServletPath(),"/");
		
		out.println("SessionSharingTest3");
		out.println("attribute3 --> " + attribute3);
		out.println("attribute4 --> " + attribute4);
		out.println("URL --> " + requestUrlS);
		out.println("URI --> " + request.getRequestURI());
		out.println("servletPath --> " + request.getServletPath());
		out.println("contextUrl --> " + contextUrl);
		out.println("getPathInfo --> " + request.getPathInfo());
		out.println("getRealPath --> " + getServletContext().getRealPath("/"));
		out.println("getContextPath --> " + request.getContextPath());
		
		System.out.println("attributeNames --> --------------");
		Enumeration<String> attributeNames = httpSession.getAttributeNames();
		while(attributeNames.hasMoreElements())
		{
			String s = attributeNames.nextElement();
			System.out.print(s);			
		}
		System.out.println("");
	
		
		out.close();
	}
}
