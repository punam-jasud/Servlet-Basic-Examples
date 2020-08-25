package servlets;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Welcome extends HttpServlet {
	
	private String message;
	
	public void init() throws ServletException{
		//Do required initialization
		message = "Welcome to Servlet Programming!";
	}
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		
		//Set response content type
		response.setContentType("text/html");
		
		//Actual logic goes here
		PrintWriter out = response.getWriter();
		out.println("<h1>"+message+"</h1>");
		
	}
	
	public void destroy() {
		//do nothing
	}

}