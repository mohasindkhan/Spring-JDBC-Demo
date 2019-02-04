package com.mohasin.spring.DAO;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.mohasin.spring.Model.Employee;
import com.mohasin.spring.RowMapper.EmployeeRowMapper;

public class EmployeeDAOImpl implements EmployeeDAO 
{
	
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() 
	{
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) 
	{
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int create(Employee employee) 
	{
		// TODO Auto-generated method stub
		
		String sql = "insert into employee values (?,?,?,?,?,?) ";
		
		int createemp = jdbcTemplate.update(sql, employee.getEmpID(), employee.getEmpName(), employee.getEmpAdd() , employee.getEmpDept(), employee.getEmpSalary(), employee.getEmpAge());
		
		return createemp;
	}

	@Override
	public int update(Employee employee) 
	{
		// TODO Auto-generated method stub
		
		String sql = "update employee set EmpName=? where EMPID=? ";
		
		int update = jdbcTemplate.update(sql, employee.getEmpName(), employee.getEmpID());
		
		return update;
	}

	@Override
	public int delete(int id) 
	{
		// TODO Auto-generated method stub
		
		String sql = "delete from employee where EmpID=?";
		
		int delete = jdbcTemplate.update(sql, id);
		
		return delete;
	}

	@Override
	public Employee read(int id) 
	{
		// TODO Auto-generated method stub
		
		String sql = "select * from employee where EmpID=?";
		
		EmployeeRowMapper emprowmap = new EmployeeRowMapper();
		
		Employee read = jdbcTemplate.queryForObject(sql, emprowmap, id);
		
		return read;
	}

	@Override
	public List<Employee> getAllRecords() 
	{
		// TODO Auto-generated method stub
		
		String sql = "select * from employee";
		
		EmployeeRowMapper emprowmap = new EmployeeRowMapper();
		
		List<Employee> allread = jdbcTemplate.query(sql, emprowmap);
		
		return allread;
		
	}

	
}
