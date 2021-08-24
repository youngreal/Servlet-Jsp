package com.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addInfo")
public class AdditionallInfoServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		res.setContentType("text/html;charset=EUC-KR");
		PrintWriter out = res.getWriter();
		out.print("<html>");
		out.print("<head><title>Request 정보 출력 Servlet</title></head>");
		out.print("<body>");
		out.print("<h3>추가적인 요청 정보</h3>");
		out.print("Request Method : " + req.getMethod() + "<br/>"); // 클라이언트의 요청방식 (명시적으로 사용하지않으면 GET방식으로 요청됨)
		out.print("Path Info : " + req.getPathInfo() + "<br/>");
		out.print("Path Translated : " + req.getPathTranslated() + "<br/>");
		out.print("Query String : " + req.getQueryString() + "<br/>"); // URL에서 ?기호를차아서 ?기호다음에 있는 문자열 찾아서 반환 
		out.print("Content Length : " + req.getContentLength() + "<br/>");
		out.print("Content Type : " + req.getContentType() + "<br/>");
		out.print("</body></html>");
		out.close();
	}
//	
//	추가적인 요청 정보
//	Request Method : GET
//	Path Info : null
//	Path Translated : null
//	Query String : null
//	Content Length : -1    * -1 인이유 : GET방식은 메시지를 바디가 아닌 헤더에 보내게되고 몸체에는 어떤데이터도 없기떄문,아래의 Content Type 이 null인이유도 몸체에 데이터가 존재하지않기때문
//	Content Type : null

}
