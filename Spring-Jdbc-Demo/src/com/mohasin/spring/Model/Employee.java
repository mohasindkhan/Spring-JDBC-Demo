package com.mohasin.spring.Model;

public class Employee 
{
	
	public int EmpID;
	public String EmpName;
	public String EmpAdd;
	public String EmpDept;
	public double EmpSalary;
	public int EmpAge;
	
	
	public int getEmpID() 
	{
		return EmpID;
	}
	

	public void setEmpID(int empID) 
	{
		EmpID = empID;
	}
	
	public String getEmpName() 
	{
		return EmpName;
	}
	
	public void setEmpName(String empName) 
	{
		EmpName = empName;
	}
	
	public String getEmpAdd() 
	{
		return EmpAdd;
	}
	
	public void setEmpAdd(String empAdd) 
	{
		EmpAdd = empAdd;
	}
	
	public String getEmpDept() 
	{
		return EmpDept;
	}
	
	public void setEmpDept(String empDept) 
	{
		EmpDept = empDept;
	}
	
	public double getEmpSalary() 
	{
		return EmpSalary;
	}
	
	public void setEmpSalary(double empSalary) 
	{
		EmpSalary = empSalary;
	}
	
	public int getEmpAge() 
	{
		return EmpAge;
	}
	
	public void setEmpAge(int empAge) 
	{
		EmpAge = empAge;
	}
	
	
	@Override
	public String toString() 
	{
		return "\n Employee [ EmpID = " + EmpID + " , EmpName = " + EmpName + " , EmpAdd = " + EmpAdd + " , EmpDept = " + EmpDept
				+ " , EmpSalary = " + EmpSalary + " , EmpAge = " + EmpAge + " ] \n ";
	} 
	
	
}
