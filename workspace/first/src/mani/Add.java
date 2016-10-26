package mani;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Add
 */
@WebServlet("/Add")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Add() {
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	String a=request.getParameter("user");
	String b=request.getParameter("pass");
	String c=request.getParameter("email");
	String d=request.getParameter("no");
	
	if(a.length()>5 && b.length()>5 && c.length()>10 &&d.length()>=10)
	{
		System.out.println(a+"\t" + b + "\t" +c +"\t" +d);
		RequestDispatcher rd=request.getRequestDispatcher("Enroll.html");
		rd.forward(request, response);
	}
	else
	{
		System.out.println("not created");
	}
	}
}
