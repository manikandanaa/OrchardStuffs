package com.mindtree.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connecting
{
		
	public Connection connect()
	{
	Connection connection=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "Welcome123");
		}
		catch(Exception error)
		{
			System.out.println("ERROR: " + error.getMessage());
		}
		
//		finally
//		{
//			if(connection !=null)	
//			{
//				try
//				{
//					connection.close();
//				}
//				catch(SQLException ignore)
//				{
//					
//				}
//			}
//				
//		}
		return connection;
	}

}
