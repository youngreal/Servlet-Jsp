package com.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/headerInfo")
public class HeaderInfoServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
		out.print("<html>");
		out.print("<head><title>Request 정보 출력 Servlet</title></head>");
		out.print("<body>");
		out.print("<h3>요청 헤더 정보</h3>");
		Enumeration<String> em = req.getHeaderNames(); 
		while(em.hasMoreElements()) {
			String s = em.nextElement();
			out.print(s + " : " + req.getHeader(s) + "<br/>");
		}
		out.print("</body></html>");
		out.close();
	}

	
//	요청 헤더 정보
//	host : localhost:8080
//	connection : keep-alive
//	sec-ch-ua : "Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92"
//	sec-ch-ua-mobile : ?0
//	upgrade-insecure-requests : 1
//	user-agent : Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.159 Safari/537.36
//	accept : text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9
//	sec-fetch-site : none
//	sec-fetch-mode : navigate
//	sec-fetch-user : ?1
//	sec-fetch-dest : document
//	accept-encoding : gzip, deflate, br
//	accept-language : ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7
//	
	
}
