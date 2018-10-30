package com.turkcell.testwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContextTest extends HttpServlet {
	
	
	private static final long serialVersionUID = 993830476414917214L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		PrintWriter out = response.getWriter();
		
		StringBuffer requestUrl=request.getRequestURL();
		
		String requestUrlS=requestUrl.toString();
		String contextUrl=requestUrlS.replaceAll(request.getServletPath(),"/");
		
		out.println("URL --> " + requestUrlS);
		out.println("URI --> " + request.getRequestURI());
		out.println("servletPath --> " + request.getServletPath());
		out.println("contextUrl --> " + contextUrl);
		out.println("getPathInfo --> " + request.getPathInfo());
		out.println("getRealPath --> " + getServletContext().getRealPath("/"));
		out.println("getContextPath --> " + request.getContextPath());
		
		out.println(request.getLocalAddr() + ":" + request.getLocalPort());
		out.println(request.getLocalName());
	
		
	    out.close();
	}
}
