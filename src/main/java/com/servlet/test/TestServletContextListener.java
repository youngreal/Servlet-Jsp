package com.servlet.test;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class TestServletContextListener implements ServletContextListener {
	
	public TestServletContextListener() {
		System.out.println("TestServletContextListener 객체 생성");
	}

	public void contextInitialized(ServletContextEvent e) {
		System.out.println("ServletContext 객체 초기화");
	}

	public void contextDestroyed(ServletContextEvent e) {
		System.out.println("ServletContext 객체 해제");
	}

}
