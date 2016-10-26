package com.mindtree;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Set;


public class Prepared
{
	public static void main(String[] args)


{
	Connection connection=null;
	PreparedStatement preparedStatement=null;
	
	
	try
	{
		
		Class.forName("com.mysql.jdbc.Driver");
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mindtree", "root", "Welcome123");
		//statement.execute("create table mani(id int not null primary key auto_increment,name varchar(100),author varchar(100), publisher varchar(100))");
		//statement.execute("insert into mani(name,author,publisher) values('spiderman','manikandan','asdf')");
		//System.out.println("book inserted");
	addmani(connection,	preparedStatement,"the matrix","tim","apple");
	addmani(connection,	preparedStatement,"the","tho","banana");
	System.out.println("statement entered correctly ");
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

		if(preparedStatement !=null)
		{
			try
			{
				preparedStatement.close();
			}
			catch(SQLException ignore)
			{
				
			}
		}
		
			
	}

}

	public static void addmani(Connection connection,PreparedStatement preparedStatement,String name, String author,String publisher) throws SQLException
	{
		preparedStatement.setString(1, name);
		preparedStatement.setString(2, author);
		preparedStatement.setString(3, publisher);
		preparedStatement.executeUpdate();
	}
}