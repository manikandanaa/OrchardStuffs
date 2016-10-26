package com.mindtree;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.lang.ClassNotFoundException;



// we are doing the connection to the database 
public class Implementation 
{
public static void main(String[] args)
{
	Connection connection=null;
	Statement statement=null;
	
	try
	{
		System.out.println("Connection to database..");
		Class.forName("com.mysql.jdbc.Driver");
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mindtree", "root", "Welcome123");
		System.out.println("conncetion is successfull");
	}
	catch(ClassNotFoundException error)
	{
		System.out.println("ERROR: " + error.getMessage());
	}
	catch(SQLException error)
	{
		System.out.println("ERROR: " + error.getMessage());
	}
	finally
	{
		if(connection !=null)
		{
			try
			{
				connection.close();
			}
			catch(SQLException ignore)
			{
				
			}
		}
		if(statement !=null)
		{
			try
			{
				statement.close();
			}
			catch(SQLException ignore)
			{
				
			}
		}
			
	}
}
}
