package com.mindtree;


import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.lang.ClassNotFoundException;

public class TableCreation 
{
	public static void main(String[] args)
	{
		Connection connection=null;
		Statement statement=null;
		
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mindtree", "root", "Welcome123");
			statement=connection.createStatement();
			statement.execute("create table mani(id int not null primary key auto_increment,name varchar(100),author varchar(100), publisher varchar(100))");
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
