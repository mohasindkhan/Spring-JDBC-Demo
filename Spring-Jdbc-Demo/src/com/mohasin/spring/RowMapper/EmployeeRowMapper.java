package com.mohasin.spring.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mohasin.spring.Model.Employee;

public class EmployeeRowMapper implements RowMapper<Employee>
{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		// TODO Auto-generated method stub
		
		Employee emp = new Employee();
		emp.setEmpID(rs.getInt(1));
		emp.setEmpName(rs.getString(2));
		emp.setEmpAdd(rs.getString(3));
		emp.setEmpDept(rs.getString(4));
		emp.setEmpSalary(rs.getDouble(5));
		emp.setEmpAge(rs.getInt(6));
		
		return emp;
	}

}
