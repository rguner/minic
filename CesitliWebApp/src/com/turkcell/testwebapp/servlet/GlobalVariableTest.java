package com.turkcell.testwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class GlobalVariableTest extends HttpServlet {
	
	private int globalInt=0;
	private HttpServletResponse httpServletResponse;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		if (httpServletResponse==null)
			httpServletResponse=response;
		
		globalInt++;
		System.out.println("Global Int " + globalInt);
		
		/*
		PrintWriter out = response.getWriter();
		out.println("Global Int " + globalInt);
	    out.close();
	    */
		PrintWriter out = httpServletResponse.getWriter();
		out.println("Global Int " + globalInt);
	    out.close();
	}
}
