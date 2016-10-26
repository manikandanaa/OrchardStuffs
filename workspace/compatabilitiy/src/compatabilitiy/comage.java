package compatabilitiy;

import java.util.Scanner;

public class comage 
{
public static void main(String args[])
{
	try
	{
		int age1,age2,age3;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("enter the valid age:");
			age1=sc.nextInt();
		}while(age1<=0);
		do
		{
			System.out.println("enter the valid age:");
			age2=sc.nextInt();
		}while(age2<=0);
		do
		{
			System.out.println("enter the valid age:");
			age3=sc.nextInt();
		}while(age3<=0);
		
		int a=Math.min(age1, age2);
		int minimum=Math.min(age3, a);
		int b=Math.max(age1, age2);
		int maxmium=Math.max(age3, b);
		
		System.out.println("the minimum number is:"+ minimum);
		System.out.println("the maxmum number is:"+ maxmium);
	}
	catch(Exception c)
	{
		System.out.println("catch u later bye");
	}
}
}
