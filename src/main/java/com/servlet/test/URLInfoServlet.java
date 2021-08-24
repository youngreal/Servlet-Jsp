package com.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/urlInfo")
public class URLInfoServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		res.setContentType("text/html;charset=EUC-KR");
		PrintWriter out = res.getWriter();
		out.print("<html>");
		out.print("<head><title>Request 정보 출력 Servlet</title></head>");
		out.print("<body>");
		out.print("<h3>요청 방식과 프로토콜 정보</h3>");
		out.print("Request URI : " + req.getRequestURI() + "<br/>"); // 클라이언트가 요청한 문서정보 
		out.print("Request URL : " + req.getRequestURL() + "<br/>"); // 클라이언트가 서비스를 요청한 문서의 전체정보, 즉 URL => 프로토콜부터 URI까지 완벽하게 URL정보를 반환
		out.print("Context Path : " + req.getContextPath() + "<br/>");
		out.print("Request Protocol : " + req.getProtocol() + "<br/>"); // 서비스를처리하면서 사용되는 프로토콜의 구체적정보
		out.print("Servlet Path : " + req.getServletPath() + "<br/>");
		out.print("</body></html>");
		out.close();
		
//		요청 방식과 프로토콜 정보
//		Request URI : /Servlet/urlInfo
//		Request URL : http://localhost:8080/Servlet/urlInfo
//		Context Path : /Servlet
//		Request Protocol : HTTP/1.1
//		Servlet Path : /urlInfo

}
}
