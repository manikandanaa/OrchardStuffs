package com.mindtree;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class SqlInsert 
{
	public static void main(String[] args)
	{
		Connection connection=null;
		Statement statement=null;
		ResultSet resultSet=null;
		
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mindtree", "root", "Welcome123");
			statement=connection.createStatement();
			//statement.execute("create table mani(id int not null primary key auto_increment,name varchar(100),author varchar(100), publisher varchar(100))");
			//statement.execute("insert into mani(name,author,publisher) values('spiderman','manikandan','asdf')");
			//System.out.println("book inserted");
			resultSet=statement.executeQuery("select * from mani");
			
			while(resultSet.next())
			{
				long id=resultSet.getLong("id");
				String name=resultSet.getString("name");
				String author=resultSet.getString("author");
				String publisher=resultSet.getString("publisher");
				
				System.out.printf("ID: %o \t NAME: %s \tAUTHOR: %s\tPUBLISHER: %s \n", id,name,author,publisher);
			}
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
			if(resultSet !=null)
			{
				try
				{
					resultSet.close();
				}
				catch(SQLException ignore)
				{
					
				}
			}
				
		}
	}
}
