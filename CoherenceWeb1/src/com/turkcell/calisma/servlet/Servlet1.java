package com.turkcell.calisma.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet1() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession httpSession = request.getSession();

		String attribute1 = (String) httpSession.getAttribute("attribute1");
		String attribute2 = (String) httpSession.getAttribute("attribute2");
		Integer count1 = (Integer) httpSession.getAttribute("count1");
		Integer count2 = (Integer) httpSession.getAttribute("count2");
		Date lastDate = (Date) httpSession.getAttribute("lastDate");

		if (count1 == null)
			count1 = 0;
		if (count2 == null)
			count2 = 0;

		httpSession.setAttribute("count1", ++count1);
		httpSession.setAttribute("count2", ++count2);

		if (attribute1 == null)
			httpSession.setAttribute("attribute1", "attribute1 Web1");
		if (attribute2 == null)
			httpSession.setAttribute("attribute2", "attribute2 Web1");

		httpSession.setAttribute("lastDate", new java.util.Date());

		PrintWriter out = response.getWriter();

		out.println("attribute1 --> " + attribute1);
		out.println("attribute2 --> " + attribute2);
		out.println("count1 --> " + count1);
		out.println("count2 --> " + count2);
		out.println("lastDate --> " + lastDate);
		out.println("su anki date -->" + new java.util.Date());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
