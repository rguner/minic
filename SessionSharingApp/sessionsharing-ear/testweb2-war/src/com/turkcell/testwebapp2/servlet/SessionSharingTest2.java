package com.turkcell.testwebapp2.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.turkcell.sessionsharingapp.model.SharedObject;
import com.turkcell.sessionsharingapp.model.SharedObjectAtAppInf;

public class SessionSharingTest2 extends HttpServlet {

	private static final long serialVersionUID = 993830476414917214L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		HttpSession httpSession = request.getSession();

		String attribute1 = (String) httpSession.getAttribute("attribute1");
		String attribute2 = (String) httpSession.getAttribute("attribute2");
		SharedObjectAtAppInf sharedObjectAtAppInf = (SharedObjectAtAppInf) httpSession.getAttribute("sharedObjectAtAppInf");
		SharedObject sharedObject = (SharedObject) httpSession.getAttribute("sharedObject");

		httpSession.setAttribute("attribute2", "attribute2Value");

		PrintWriter out = response.getWriter();

		StringBuffer requestUrl = request.getRequestURL();

		String requestUrlS = requestUrl.toString();
		String contextUrl = requestUrlS.replaceAll(request.getServletPath(), "/");

		out.println("SessionSharingTest2");
		out.println("attribute1 --> " + attribute1);
		out.println("attribute2 --> " + attribute2);
		out.println("sharedObject --> " + sharedObject.getI() + " " + sharedObject.getS() + " " + sharedObject.getDate());
		out.println("sharedObjectAtAppInf --> " + sharedObjectAtAppInf.getI() + " " + sharedObjectAtAppInf.getS() + " " + sharedObjectAtAppInf.getDate());
		out.println("URL --> " + requestUrlS);
		out.println("URI --> " + request.getRequestURI());
		out.println("servletPath --> " + request.getServletPath());
		out.println("contextUrl --> " + contextUrl);
		out.println("getPathInfo --> " + request.getPathInfo());
		out.println("getRealPath --> " + getServletContext().getRealPath("/"));
		out.println("getContextPath --> " + request.getContextPath());

		System.out.println("attributeNames --> --------------");
		Enumeration<String> attributeNames = httpSession.getAttributeNames();
		while (attributeNames.hasMoreElements())
		{
			String s = attributeNames.nextElement();
			System.out.print(s);
		}
		System.out.println("");

		out.close();
	}
}
