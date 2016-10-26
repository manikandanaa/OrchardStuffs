package rowset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;



public class JDBCRowset 
{
public static void main(String arg[]) throws SQLException
{
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rowsetjdbc", "root", "Welcome123");
		JdbcRowSet jrow=RowSetProvider.newFactory().createJdbcRowSet();
		jrow.setUrl("jdbc:mysql://localhost:3306/rowsetjdbc");
		jrow.setUsername("root");
		jrow.setPassword("Welcome123");
		
		jrow.setCommand("select * from emplo");
		jrow.execute();		
		while(jrow.next())
		{
			System.out.println(jrow.getInt(1));
			System.out.println(jrow.getString(2));
			System.out.println(jrow.getLong(3));
		}
	}
	catch(ClassNotFoundException e)	
	{
		
	}
	
}
}
