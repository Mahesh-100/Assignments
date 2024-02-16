package com.emp;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.EmpDao;
import com.emp.dto.EmpDTO;




@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int empId=Integer.parseInt(request.getParameter("empId"));
		EmpDao dao=new EmpDao();
		 try {
			 
			 EmpDTO emp=dao.getSalary(empId);
			double salary=emp.getBasic_salary();
			double hra=(20.0/100.0)*salary;
			double da=(30.0/100.0)*salary;
			double gs=salary+hra+da;
			double pf=(12.5/100)*salary;
			double ns=gs-pf;
			
			request.setAttribute("emp", emp);
			request.setAttribute("salary", salary);
			request.setAttribute("hra", hra);
			request.setAttribute("da", da);
			request.setAttribute("gs", gs);
			request.setAttribute("pf", pf);
			request.setAttribute("ns", ns);
			 String employee=emp.toString();
			 request.setAttribute("employee", employee);
        	RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
        	rd.forward(request, response);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	 
}
