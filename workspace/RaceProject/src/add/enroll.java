package add;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class enroll
 */
@WebServlet("/enroll")
public class enroll extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public enroll() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @param classNotfoundException 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response, boolean classNotfoundException) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String a=request.getParameter("user");
		String b=request.getParameter("pass");
		String c=request.getParameter("email");
		String d=request.getParameter("type");
		
		Long j=Long.parseLong(c);
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:8081)");
			String q="insertintomember(name,pass,no,category)values(?,?,?,?)";
			PreparedStatement p=con.prepareStatement(q);
			p.setString(1, a);
			p.setString(2, b);
			p.setString(3, c);
			p.setString(4, d);
			
			int y=p.executeUpdate();
			if(y==0)
			{
				RequestDispatcher rd=request.getRequestDispatcher("add.jsp");
				System.out.println("nothing added");
				request.setAttribute("ok","record not inserted");
				rd.forward(request, response);
			}
			else
			{
				RequestDispatcher rd=request.getRequestDispatcher("add.jsp");
				System.out.println("record inserted");
				request.setAttribute("ok","record inserted");
				rd.forward(request, response);
			}
		}
		catch(ClassNotFoundException m){
			
		}
		catch(SQLException e)
		{
			
		}
}
}
