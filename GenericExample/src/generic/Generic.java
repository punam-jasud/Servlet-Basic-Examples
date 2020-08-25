package generic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Generic extends GenericServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter printWriter = res.getWriter();
		printWriter.print("<html>");
		printWriter.print("<body>");
		printWriter.print("<h2>Generic Servlet Example</h2>");
		printWriter.print("<p>Welocome to Servlet Programming!</p>");
		printWriter.print("</html>");
		printWriter.print("</body>");
		
	}

}
