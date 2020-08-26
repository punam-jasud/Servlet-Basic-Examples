import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		
		String nString = req.getParameter("userName");
		String pString = req.getParameter("userPass");
		
		if (pString.equals("magic@123")) {
			
			RequestDispatcher rDispatcher = req.getRequestDispatcher("servlet2");
			rDispatcher.forward(req, resp);
			
		}else {
			printWriter.print("Sorry Username or Password Error!");
			RequestDispatcher rDispatcher = req.getRequestDispatcher("/index.html");
			rDispatcher.include(req, resp);
		}
	}
	
	

}
