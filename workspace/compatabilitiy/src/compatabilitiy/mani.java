package compatabilitiy;

import java.util.Scanner;

public class mani 
{
public static void main(String args[])
{
	try
	{
		int c,count=0;
		String s;
		Scanner sc=new Scanner(System.in);
		s= sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			int ss=s.charAt(i);
			System.out.println("ascii value of "+ s.charAt(i)+" "+ss);
		}
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
					count++;
			}
			System.out.println(s.charAt(i)+ " "+ count);
			count=0;
		}
	}
	catch(Exception e)
	{
		System.out.println();
	}
}
}
