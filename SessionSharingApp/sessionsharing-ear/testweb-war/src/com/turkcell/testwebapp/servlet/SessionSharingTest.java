package com.turkcell.testwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.turkcell.sessionsharingapp.model.SharedObject;
import com.turkcell.sessionsharingapp.model.SharedObjectAtAppInf;
import com.turkcell.sessionsharingapp.model.SharedObjectInner;
import com.turkcell.sessionsharingapp.model.SharedObjectInnerAtAppInf;

public class SessionSharingTest extends HttpServlet {

	private static final long serialVersionUID = 993830476414917214L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		HttpSession httpSession = request.getSession();
		PrintWriter out = response.getWriter();

		String attribute1 = (String) httpSession.getAttribute("attribute1");
		String attribute2 = (String) httpSession.getAttribute("attribute2");
		SharedObject sharedObjectAtSession = (SharedObject) httpSession.getAttribute("sharedObject");
		if (sharedObjectAtSession == null)
			out.println("sharedObject sessionda null");

		SharedObjectAtAppInf sharedObjectAtAppInfAtSession = (SharedObjectAtAppInf) httpSession.getAttribute("sharedObjectAtAppInf");
		if (sharedObjectAtAppInfAtSession == null)
			out.println("sharedObjectAtAppInf sessionda null");

		httpSession.setAttribute("attribute1", "attribute1Value");
		SharedObject sharedObject = new SharedObject();
		sharedObject.setDate(new Date());
		sharedObject.setI(10);
		sharedObject.setS("ramazan");
		SharedObjectInner sharedObjectInner = new SharedObjectInner();
		sharedObjectInner.setS2("ramazan2");
		sharedObject.setSharedObjectInner(sharedObjectInner);
		httpSession.setAttribute("sharedObject", sharedObject);

		SharedObjectAtAppInf sharedObjectAtAppInf = new SharedObjectAtAppInf();
		sharedObjectAtAppInf.setDate(new Date());
		sharedObjectAtAppInf.setI(20);
		sharedObjectAtAppInf.setS("ramazan20");
		SharedObjectInnerAtAppInf sharedObjectInnerAtAppInf = new SharedObjectInnerAtAppInf();
		sharedObjectInnerAtAppInf.setS2("ramazan200");
		sharedObjectAtAppInf.setSharedObjectInnerAtAppInf(sharedObjectInnerAtAppInf);
		httpSession.setAttribute("sharedObjectAtAppInf", sharedObjectAtAppInf);

		StringBuffer requestUrl = request.getRequestURL();

		String requestUrlS = requestUrl.toString();
		String contextUrl = requestUrlS.replaceAll(request.getServletPath(), "/");

		out.println("SessionSharingTest");
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
