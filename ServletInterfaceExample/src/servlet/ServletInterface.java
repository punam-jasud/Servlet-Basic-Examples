package servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletInterface implements Servlet {
	
	ServletConfig config = null; 
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		
		this.config = config;
		System.out.println("Servlet is Initialized");
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		 
		PrintWriter out = res.getWriter();
		out.print("<html><body>");
		out.print("<b>Servlet Example by Implementing Servlet Interface</b>");
		out.print("</body></html>");  
		
		out.close();
	}
	
	@Override
	public void destroy() {
		System.out.println("Servlet is destroyed");
	}

	@Override
	public ServletConfig getServletConfig() {
		return config;
	}

	@Override
	public String getServletInfo() {
		return "copyright 2007-1010";
	}

	

	

}
