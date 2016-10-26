package com.mindtree.dao.jdbc;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mindtree.connection.Connecting;
import com.mindtree.dao.Employeedao;
import com.mindtree.entity.Employee;
public class EmployeeDaoJdbcImpl implements Employeedao 
{
	public static List<Employee> a =new ArrayList<Employee>();
 public  List<Employee> getEmployee() throws SQLException
 {
	 Connecting con=new Connecting();
	 Connection connection=con.connect();
	 Statement statement=null;
	 ResultSet resultSet=null;
	statement=connection.createStatement();
	 resultSet=statement.executeQuery("select * from employee");
		
		while(resultSet.next())
		{
			Employee b=new Employee();
			b.setEmpid(resultSet.getInt(1));
			b.setName(resultSet.getString(2));
			b.setHireDate(resultSet.getDate(3));
			b.setSalary(resultSet.getDouble(4));
		a.add(b);	
		}
		return a;
 }
}
