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


@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String empName=request.getParameter("empname");
		String doj=request.getParameter("doj");
		double basic_salary=Double.parseDouble(request.getParameter("salry"));
		
		
		EmpDTO emp=new EmpDTO(empName,doj,basic_salary);
		 EmpDao dao=new EmpDao();
		 try {
			if(dao.insertEmpDetails(emp)) {
			   int empId=dao.getEmpID(empName);
				request.setAttribute("empId", empId);
	        	RequestDispatcher rd=request.getRequestDispatcher("registerSuccess.jsp");
	        	rd.forward(request, response);
				 
			 }else {
				 response.sendRedirect("register.jsp");
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
