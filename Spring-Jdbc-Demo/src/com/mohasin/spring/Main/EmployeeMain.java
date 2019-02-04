package com.mohasin.spring.Main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mohasin.spring.DAO.EmployeeDAO;
import com.mohasin.spring.DAO.EmployeeDAOImpl;
import com.mohasin.spring.Model.Employee;

public class EmployeeMain 
{
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		System.out.println(" \n Application Context XML LOADED SUCCESSFULLY ");
		
		System.out.println(" \n ---------------------------------------------------------- ");
		
		//CREATING BEAN EMPLOYEEDAO
		EmployeeDAO edao = (EmployeeDAOImpl) context.getBean("employeedao");
		System.out.println(" \n EMPLOYEE DAO BEAN LOADED SUCCESSFULLY ");
		
		System.out.println(" \n ---------------------------------------------------------- ");
		
//		System.out.println(" \n CREATE OPERATION ");
//		
//		System.out.println(" \n ---------------------------------------------------------- ");
		
		
		Employee e = new Employee();
		e.setEmpID(2);
		e.setEmpName("Irfan D Khan");
		e.setEmpAdd("Pune");
		e.setEmpDept("Computer");
		e.setEmpSalary(52000.00);
		e.setEmpAge(18);
		
		Employee e1 = new Employee();
		e1.setEmpID(3);
		e1.setEmpName("Brad Traversy");
		e1.setEmpAdd("Boston");
		e1.setEmpDept("Javascript");
		e1.setEmpSalary(78000.00);
		e1.setEmpAge(35);
		
		Employee e2 = new Employee();
		e2.setEmpID(4);
		e2.setEmpName("Chad Darby");
		e2.setEmpAdd("Philadelphia");
		e2.setEmpDept("Spring");
		e2.setEmpSalary(87000.00);
		e2.setEmpAge(42);
		
		Employee e3 = new Employee();
		e3.setEmpID(5);
		e3.setEmpName("Hitesh");
		e3.setEmpAdd("NewYork");
		e3.setEmpDept("Android");
		e3.setEmpSalary(90000.00);
		e3.setEmpAge(34);
		
		int i = edao.create(e3);
		System.out.println(" \n RECORD INSERTED SUCCESSFULLY : " +i);
//		
//		System.out.println(" \n CREATING OPERATION ");
		
//		System.out.println(" \n ---------------------------------------------------------- ");
		
//		System.out.println(" \n UPDATE OPERATION ");
//		
//		System.out.println(" \n ---------------------------------------------------------- ");
//		
//		Employee e3 = new Employee();
//		e3.setEmpID(5);
//		e3.setEmpName("Hitesh Chaudhari");
//		e3.setEmpAdd("NewYork");
//		e3.setEmpDept("Android");
//		e3.setEmpSalary(90000.00);
//		e3.setEmpAge(34);
//		
//		int i = edao.update(e3);
//		System.out.println(" \n RECORD UPDATED SUCCESSFULLY : " +i);
		
//		System.out.println(" \n ---------------------------------------------------------- ");
//		
//		System.out.println(" \n DELETE OPERATION ");
//		
//		int d = edao.delete(5);
//		System.out.println(" \n RECORD DELETED SUCCESSFULLY : " +d);

//		System.out.println(" \n ---------------------------------------------------------- ");
//		
//		System.out.println(" \n GET SINGLE RECORD ");
//		
//		System.out.println(" \n ---------------------------------------------------------- ");
//		
//		Employee r = edao.read(3);
//		System.out.println(" \n Employee Record : " +r);
		
//		System.out.println(" \n ---------------------------------------------------------- ");
		
		System.out.println(" \n GET ALL RECORDS ");
		
		System.out.println(" \n ---------------------------------------------------------- ");
		
		List<Employee> allRecords = edao.getAllRecords();
		System.out.println(" \n Employee Records : \n " +allRecords);
		
	}

}
