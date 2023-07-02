package co.edureka.ems.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import org.json.JSONObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.ems.dto.Employee;
import co.edureka.ems.services.EmployeeService;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EmployeeSearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private EmployeeService  service;
	
	public void init(ServletConfig config) throws ServletException {
		ApplicationContext context = new ClassPathXmlApplicationContext("ems-beans.xml");
		
		service = (EmployeeService)context.getBean("employee-service");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empno = request.getParameter("eno");
		
		PrintWriter out = response.getWriter();
	   try {	
		if(empno != null) {		 	
			int eno = Integer.parseInt(empno);
			Employee emp = service.searchEmployeeByNo(eno);
			
			if(emp != null) {
				String name = emp.getEmployeeName();
				float sal = emp.getEmployeeSal();
				
				JSONObject jObj = new JSONObject();
				jObj.put("emp_name", name);
				jObj.put("emp_sal", sal);
				
				response.setContentType("application/json");
				out.print(jObj);
			}else {
				out.print("");
			}
		}
	   }catch(Exception ex) {
		   out.print("");
	   }
	   
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
