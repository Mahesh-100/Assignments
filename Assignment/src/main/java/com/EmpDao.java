package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.emp.DBConnection;
import com.emp.dto.EmpDTO;





public class EmpDao {
 
	public boolean insertEmpDetails(EmpDTO emp) throws SQLException  {
		try (Connection connection = DBConnection.getConnection()){
			String sql = "INSERT INTO Employee (empName, DOJ, BasicSalary) VALUES (?, ?, ?)";
		try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, emp.getEmpName() );
            preparedStatement.setString(2, emp.getDoj() );
            preparedStatement.setDouble(3, emp.getBasic_salary() );
             
            int rowsAffected=preparedStatement.executeUpdate();
            return rowsAffected>0;
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}

	public  EmpDTO getSalary(int empID) throws SQLException {
		EmpDTO emp= new EmpDTO();
        try (Connection connection = DBConnection.getConnection()){;
        	String sql="SELECT * FROM employee WHERE emp_id = ?";
          try(PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, empID);
            try (ResultSet rs = statement.executeQuery()) {
                if (rs.next()) {
                	
                	emp.setEmpName(rs.getString("empName"));
                	emp.setDoj(rs.getString("DOJ"));
                	emp.setBasic_salary(rs.getDouble("BasicSalary"));
                	
                	return emp;	
                	
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
       
    }
		
		return emp;
    }	
	public  int getEmpID(String empName) throws SQLException {
		int empId=0;
        try (Connection connection = DBConnection.getConnection()){;
        	String sql="SELECT emp_id FROM employee WHERE empName = ?";
          try(PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, empName);
            try (ResultSet rs = statement.executeQuery()) {
                if (rs.next()) {
                	
                empId=rs.getInt("emp_id");
                	
                	return empId;	
                	
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
       
    }
		return empId;
		
		
    }	

}
