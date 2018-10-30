package com.turkcell.testwebapp.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class TestSessionListener implements HttpSessionListener, ServletContextListener, HttpSessionAttributeListener {

	public void sessionCreated(HttpSessionEvent se) {
		
		System.out.println("TestSessionListener Session sessionCreated " + se.getSession().getId());

	}


	public void sessionDestroyed(HttpSessionEvent se) {
		
		System.out.println("TestSessionListener Session sessionDestroyed " + se.getSession().getId());
	}


	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("TestSessionListener contextInitialized " + sce.getServletContext().getContextPath());
	}


	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("TestSessionListener contextDestroyed " + sce.getServletContext().getContextPath());
	}


	public void attributeAdded(HttpSessionBindingEvent se) {
		System.out.println("TestSessionListener attributeAdded: name: " + se.getName() + " value: " + se.getValue());
	}


	public void attributeRemoved(HttpSessionBindingEvent se) {
		System.out.println("TestSessionListener attributeRemoved: name: " + se.getName() + " value: " + se.getValue());	}

	public void attributeReplaced(HttpSessionBindingEvent se) {
		System.out.println("TestSessionListener attributeReplaced: name: " + se.getName() + " value: " + se.getValue());
	}

}
