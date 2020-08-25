package mytvs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Tv extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html><body>");
		out.println("<h1>Top 5 Smart Tvs in 2020</h1><br>");
		out.println("1.Mi LED TV<br> ");
		out.println("2.Sony Bravia<br>");
		out.println("3.Panasonic<br>");
		out.println("4.Samsung<br>");
		out.println("5.LG<br>");
		out.println("</html></body>");
		
		out.close();
		
	}

}
