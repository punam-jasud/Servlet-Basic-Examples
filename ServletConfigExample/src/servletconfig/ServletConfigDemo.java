package servletconfig;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfigDemo extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		
		ServletConfig servletConfig = getServletConfig();
		String driver = servletConfig.getInitParameter("driver");
		printWriter.print("Driver is : "+driver);
		
		printWriter.close();
		
	}
	
}
