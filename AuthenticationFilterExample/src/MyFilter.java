import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		
		String password = request.getParameter("password");
		if (password.equals("admin")) {
			chain.doFilter(request, response);
		}
		else {
			printWriter.print("Username or Password Error!");
			RequestDispatcher rDispatcher = request.getRequestDispatcher("index.html");
			rDispatcher.include(request, response);
		}
		
	}

	@Override
	public void destroy() {}

	
	

}
