package com.turkcell.testwebapp4.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class TestSessionListener4 implements HttpSessionListener, ServletContextListener, HttpSessionAttributeListener {

	public void sessionCreated(HttpSessionEvent se) {
		
		System.out.println("TestSessionListener4 Session sessionCreated " + se.getSession().getId());

	}


	public void sessionDestroyed(HttpSessionEvent se) {
		
		System.out.println("TestSessionListener4 Session sessionDestroyed " + se.getSession().getId());
	}


	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("TestSessionListener4 contextInitialized " + sce.getServletContext().getContextPath());
	}


	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("TestSessionListener4 contextDestroyed " + sce.getServletContext().getContextPath());
	}


	public void attributeAdded(HttpSessionBindingEvent se) {
		System.out.println("TestSessionListener4 attributeAdded: name: " + se.getName() + " value: " + se.getValue());
	}


	public void attributeRemoved(HttpSessionBindingEvent se) {
		System.out.println("TestSessionListener4 attributeRemoved: name: " + se.getName() + " value: " + se.getValue());	}

	public void attributeReplaced(HttpSessionBindingEvent se) {
		System.out.println("TestSessionListener4 attributeReplaced: name: " + se.getName() + " value: " + se.getValue());
	}

}
