package com.servlet.test;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/hello2")
public class FirstServlet extends HttpServlet{
	
	@Override
	public void init(ServletConfig config) throws ServletException{
		System.out.println("init() 실행됨!");
		
	}
	// 서블릿의 초기화를 담당하는 메서드
	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException{
		System.out.println("service() 실행됨!");
	}
	
	// 서블릿 실행 요청이 있을때마다 실행되어야하는내용 구현 
	
	
	

}
