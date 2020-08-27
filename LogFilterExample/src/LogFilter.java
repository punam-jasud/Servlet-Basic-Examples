import java.io.IOException;
import java.sql.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LogFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		//get init parameters
		String testParam = filterConfig.getInitParameter("test-param");
		
		//print the init parameters
		System.out.println("Test Param : "+testParam);
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//Get the IP Address of the client machine
		String ipAddress = request.getRemoteAddr();
		
		//Log the IP Address and Current TimeStamp
		System.out.println("IP: "+ipAddress+" ,Date and Time: "+java.time.LocalDate.now()+" "+java.time.LocalTime.now());
		
		//pass the request back down to the filter chain
		chain.doFilter(request, response);
		
	}

	
	@Override
	public void destroy() {
		
	}

}
