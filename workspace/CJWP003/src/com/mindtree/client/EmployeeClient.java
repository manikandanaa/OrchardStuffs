package com.mindtree.client;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.mindtree.dao.jdbc.EmployeeDaoJdbcImpl;
import com.mindtree.entity.Employee;
public class EmployeeClient 
{
	
public static void main(String args[]) throws SQLException
{
	EmployeeDaoJdbcImpl empl=new EmployeeDaoJdbcImpl();
	List<Employee> l =empl.getEmployee();
	
	for(Employee i:l)
	{
		System.out.print(i.getEmpid());
		System.out.print("\t");
		System.out.print(i.getName());
		System.out.print("\t");
		System.out.print(i.getHireDate());
		System.out.print("\t");
		System.out.print(i.getSalary());
		System.out.println();
}	
}
}
