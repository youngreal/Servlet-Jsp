package com.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/netInfo")
public class NetInfoServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
		out.println("<html>");
		out.println("<head><title>Request 정보 출력 Servlet</title></head>");
		out.print("<body>");
		out.print("<h3>네트워크 관련 요청 정보</h3>");
		out.print("Request Scheme : " + req.getScheme() + "<br/>"); // 클라이언트가 웹서버에 서비스를 요청할때 사용한 프로토콜이름 
		out.print("Server Name : " + req.getServerName() + "<br/>"); // 서버 호스트이름 
		out.print("Server Address : " + req.getLocalAddr() + "<br/>"); // 클라이언트로부터 서비스 요청받은 서버의 IP주소
		out.print("Server Port : " + req.getServerPort() + "<br/>");//  클라이언트의 서비스를 요청받아 처리하는 서버의 Port번호
		out.print("Client Address : " + req.getRemoteAddr() + "<br/>");// 클라이언트 IP주소
		out.print("Client Host : " + req.getRemoteHost() + "<br/>");// 클라이언트 호스트이름
		out.print("Client Port : " + req.getRemotePort() + "<br/>");// 클라이언트 Port번호 
		out.print("</body></html>");
		out.close();
		
//		
//		네트워크 관련 요청 정보
//		Request Scheme : http
//		Server Name : localhost
//		Server Address : 0:0:0:0:0:0:0:1
//		Server Port : 8080
//		Client Address : 0:0:0:0:0:0:0:1
//		Client Host : 0:0:0:0:0:0:0:1
//		Client Port : 12746
		
	}

}
