package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class List 
{
public static void main(String args[])
{
	int choice=0;
	Comp c=new Comp();
	
	ArrayList<Comp> a=new ArrayList<Comp>();
	a.add(new Comp(200, " DELL		" , " 15_inch monitor	" ,	3400.00));
	a.add(new Comp(120, " DELL		" , " 15 Laptop			" ,45000.00));
	a.add(new Comp(150, " MICROSOFT	" , " windows 7			" ,7000.00));
	a.add(new Comp(100, " LOGINTECH	" , " optical mouse		" , 540.00));
	System.out.println("Enter the Sorting Order   1.Id \n 2.Brand Name");
	Scanner d=new Scanner(System.in);
	int b=0;
	do
	{
		try
		{
			choice=d.nextInt();
			b=1;
		}
		catch(Exception e)
		{
			System.out.println("The Exception has Occured Please Enter an Integer Value");
			b=0;
		}
	}while(b==0);
	switch(choice)
	{
	case 1:
		Collections.sort(a,new Comp());
		System.out.println("Sorting Based On ID");
		for(int i=0;i<a.size();i++)
		{
			c=a.get(i);
			c.display();
		}
		break;
		
	case 2:
		Collections.sort(a,c.pr);
		System.out.println("Sorting Based on Brand Name");
		for(Comp i:a)
		{
			System.out.println(i);
		}
		break;
	default:
		System.out.println("Invalid Choice");
}
}
}
