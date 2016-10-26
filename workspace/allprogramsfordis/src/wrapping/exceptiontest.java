package wrapping;

import java.util.Scanner;

public class exceptiontest
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("enter number in numerator");
		Scanner sc=new Scanner(System.in);
		int	a=sc.nextInt();
		System.out.println("enter number denominator");
		int b=sc.nextInt();
		
		try
		{
			div(a,b);
		}
		catch(ProblemExcep e)
		{
			System.out.println(e);
	
		}
	}
	
public static void div(int a,int b)throws ProblemExcep
{
	try
	{
		if(b!=0)
		{
			int c=a/b;
			System.out.println(" output is"+c);
		}
		else
		{
			throw new  ArithematicExcep();
		}
	}
	catch(ArithematicExcep e)//wrapping
	{ 
		throw new ProblemExcep("make sure that value of 2nd number should not be zero");//propogation to main
	}
	}
}


class ArithematicExcep extends ProblemExcep{

	public ArithematicExcep() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArithematicExcep(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public ArithematicExcep(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ArithematicExcep(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ArithematicExcep(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}


class ProblemExcep extends Exception{

	public ProblemExcep() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProblemExcep(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public ProblemExcep(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ProblemExcep(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ProblemExcep(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}