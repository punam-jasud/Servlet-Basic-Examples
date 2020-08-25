package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BasicLogin extends HttpServlet{

	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		String user = request.getParameter("userName");
		String pass = request.getParameter("userPassword");
		
		if(user.equals("Punam") && pass.equals("magic@123"))
			pw.println("Login Success..!");
		else 
			pw.println("Login Failed..!");
		pw.close();
	}
	
}
