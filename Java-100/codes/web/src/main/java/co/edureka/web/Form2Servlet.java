package co.edureka.web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/form2")
public class Form2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s1 = request.getParameter("t1");
		String s2 = request.getParameter("t2");
		String s3 = request.getParameter("t3");
		
		HttpSession session = request.getSession();
		
		session.setAttribute("name", s1);
		session.setAttribute("age", s2);
		session.setAttribute("address", s3);
		
		/*
		Cookie cook1 = new Cookie("name", s1);
		Cookie cook2 = new Cookie("age", s2);
		Cookie cook3 = new Cookie("address", s3);
		cook1.setMaxAge(60 * 60 * 24 * 365);
		
		response.addCookie(cook1);
		response.addCookie(cook2);
		response.addCookie(cook3);
		*/
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<body bgcolor=cyan>");
		out.println("<h2>"+session.getId() + " - " + session.isNew() + "</h2>");
		
		out.println("<form action=form3 method=get>");
		out.println("<h2>");		
		
		out.println("Years of Experience <input type=text name=t4 size=5><br><br>");
		out.println("Prg Languages Known <input type=text name=t5 size=30><br><br>");
		
		/* out.println("<input type=hidden name=t1 value=\""+s1+"\">"); */
		
		out.println("<input type=submit value=SUBMIT>");
		out.println("</form>");
		out.println("</h2>");
		out.println("</body>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
