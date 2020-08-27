package servletcontext;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContextDemo extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();

		// Creating ServletContext object
		ServletContext servletContext = getServletContext();

		// Getting the value of all initialization parameters
		Enumeration<String> e = servletContext.getInitParameterNames();

		printWriter.print("Application Scope Initilization Parameters:<br>");
		String str = " ";
		while (e.hasMoreElements()) {
			str = e.nextElement();
			printWriter.print("<br>" +str+" ----> " +servletContext.getInitParameter(str));
		}
		
		printWriter.close();

	}

}
