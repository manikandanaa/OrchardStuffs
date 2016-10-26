package com.mindtree.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connecting 
{
	public Connection connectt()
	{
	Connection connection=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/moviee", "root", "Welcome123");
		}
		catch(Exception error)
		{
			System.out.println("ERROR: " + error.getMessage());
		}
		return connection;
}

}