package com.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/queryTest3")
public class QueryTest3Servlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<html><head><title>문자열 테스트</title></head>");
		out.print("<body>");
		out.print("<h1>GET 방식으로 요청되었습니다</h1>");

		String name = req.getParameter("name");
		out.print("이름 : " + name + "<br/>");

		out.print("</body></html>");
		out.close();
	
	
	
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8"); 
		PrintWriter out = resp.getWriter(); // 서버 -> 클라이언트로보내는응답, 즉 클라이언트는 이정보를보고 응답받은 데이터를 html로 처리하고 문자처리할때는 utf-8사용 
		out.print("<html><head><title>질의 문자열 테스트</title></head>");
		out.print("<body>");
		out.print("<h1>POST 방식으로 요청되었습니다</h1>");

		req.setCharacterEncoding("UTF-8"); // 클라이언트가 보낸 정보를 서버에서처리할떄 UTF-8사용하여 인코딩처리해줌 
		String name = req.getParameter("name");
		out.print("이름 : " + name + "<br/>");

		out.print("</body></html>");
		out.close();
	}

}
