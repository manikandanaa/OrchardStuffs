package compatabilitiy;

import java.util.Scanner;

public class worker 
{
	
	public static void main(String args[])
	{
		
		try
		{
			double givenhour;
			Scanner s=new Scanner(System.in);
			
		do
		{
			System.out.println("enter the valid input:");
			givenhour=s.nextDouble();
		}while(givenhour<=1);
	
		if(givenhour>=2 && givenhour<=3)
			System.out.println("the worker is highly efficient");
		else if(givenhour>3 && givenhour<=4)
			System.out.println("the worker should increase their speed");
		else if(givenhour>4 && givenhour<=5)
			System.out.println( "training to improve his speed");
		else if(givenhour>5)
			System.out.println(" the worker must leave the company");
	}
		
		catch(Exception e)
		{
			System.out.println("none other than numerics r permitted");
		}
		
	}
}
