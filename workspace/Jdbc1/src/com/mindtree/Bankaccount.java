package com.mindtree;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.lang.ClassNotFoundException;
import java.math.BigDecimal;

public class Bankaccount 
{
public static void main(String args[]) throws SQLException
{
	Connection connection=null;
	Statement statement=null;
	
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mindtree", "root", "Welcome123");
		
		connection.setAutoCommit(false);
		statement=connection.createStatement();
		
		BigDecimal withdrawAmount=new BigDecimal(100);
		
		withdrawchecking(connection,statement,withdrawAmount,1);
		depositIntoSaving(connection,statement,withdrawAmount,1);
		
		statement.executeBatch();
		connection.commit();
		System.out.println("account is been modified");
	}
	catch(Exception error)
	{
		System.out.println("ERROR: " + error.getMessage());
		connection.rollback();
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

public static void withdrawchecking(Connection connection,Statement statement,BigDecimal amount,int id) throws SQLException
{
	statement.addBatch("UPDATE bankAccount SET checkingBalance=checkingBalance- " +amount +" WHERE id=" +id);
}
public static void depositIntoSaving(Connection connection,Statement statement,BigDecimal amount,int id) throws SQLException
{
	statement.addBatch("UPDATE bankAccount SET savingBalance=savingBalance+ " +amount +" WHERE id=" +id);
}
}
