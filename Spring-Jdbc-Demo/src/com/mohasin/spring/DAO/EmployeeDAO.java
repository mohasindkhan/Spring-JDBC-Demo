package com.mohasin.spring.DAO;

import java.util.List;

import com.mohasin.spring.Model.Employee;

public interface EmployeeDAO 
{
	
	public int create(Employee employee);
	
	public Employee read(int id);
	
	public int update(Employee employee);
	
	public int delete(int id);
	
	public List<Employee> getAllRecords();

}
