package com.emp.dto;

public class EmpDTO {
  private String EmpName;
  private String doj;
  private double basic_salary;
  
  
  
public EmpDTO() {
	super();
	// TODO Auto-generated constructor stub
}

public String getEmpName() {
	return EmpName;
}

public void setEmpName(String empName) {
	EmpName = empName;
}

public String getDoj() {
	return doj;
}

public void setDoj(String doj) {
	this.doj = doj;
}

public double getBasic_salary() {
	return basic_salary;
}

public void setBasic_salary(double basic_salary) {
	this.basic_salary = basic_salary;
}

public EmpDTO(String empName, String doj, double basic_salary) {
	super();
	EmpName = empName;
	this.doj = doj;
	this.basic_salary = basic_salary;
}
  
  
public String toString() {
    return "Name of the Emplyee:" + this.EmpName + ","+"     "
            + "Date of Join:" + this.doj ;
           
}
  
  
}
