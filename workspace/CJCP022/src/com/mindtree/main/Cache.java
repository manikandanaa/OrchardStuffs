package com.mindtree.main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.sql.rowset.CachedRowSet;

import com.mindtree.connection.Connecting;
import com.sun.rowset.CachedRowSetImpl;

public class Cache 
{
public static void main(String args[]) throws SQLException
{
	 Connecting con=new Connecting();
	 Connection connection=con.connectt();
	 
	 CachedRowSet crs = new CachedRowSetImpl();

	 
	 
	 crs.setUrl("jdbc:mysql://localhost:3306/moviee");
	 crs.setUsername("root");
	 crs.setPassword("Welcome123");
	 
	 crs.setCommand("select * from movies");
	 
	 int[] keys={1};
	 crs.setKeyColumns(keys);
	 
	 crs.execute(connection);
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the choice \n 1.inserting row \n 2.update row  \n 3.traversal ");
	 int choice =sc.nextInt();
	 switch(choice)
	 {
	 case 1:
		 
		 crs.moveToInsertRow();
		 connection.setAutoCommit(false);
		 crs.updateInt(1, 10);
		 crs.updateString(2, "manikandan");
		 crs.updateString(3, "msdhoniflim");
		 crs.insertRow();
		 crs.moveToCurrentRow();
		 crs.acceptChanges(connection);
		 System.out.println("row inserted");
		 break;
		 
	 case 2:
		 crs.absolute(2);
		 crs.updateInt(1,11);
		 crs.moveToCurrentRow();
		 crs.updateRow();
		 crs.acceptChanges(connection);
		 System.out.println("updated");
		 break;
	 case 3:
		 crs.setCommand("select * from movies");
		 while(crs.next())
		 {
			 System.out.println(crs.getInt(1)+"\t"+crs.getString(2)+"\t"+crs.getString(3));
			 
		 }
	 }
}
}
