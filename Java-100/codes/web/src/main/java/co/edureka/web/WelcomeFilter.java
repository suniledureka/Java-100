package co.edureka.web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;

@WebFilter("/welcome")
public class WelcomeFilter extends HttpFilter implements Filter {
	private static final long serialVersionUID = 1L;

	public void init(FilterConfig fConfig) throws ServletException {}

	public void destroy() {}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String user = request.getParameter("txt_uid");
		String pass = request.getParameter("txt_pwd");
		
		if(user.equals("admin") && pass.equals("1234")) {
			// pass the request along the filter chain
			chain.doFilter(request, response);
		}
		else {
			PrintWriter out = response.getWriter();
			out.println("<p style=\"text-align:center;font-size:18px;color:yellow\">Username/ Password is Invalid</p>");
			
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);			
		}
	}
}
