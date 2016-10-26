package compatabilitiy;

import java.util.Scanner;

public class comp 
{
public static void main(String args[])
{
	int i=0,k,count,length = 0;
	Scanner sc=new Scanner(System.in);
	String a;
	System.out.println("enter the input");
	a=sc.nextLine();
	System.out.println("the entered input is:::"+ a);
	for(i=0;i<a.length()-1;i=i+count)
	{
		count=1;
		for(k=i+1;k<a.length();k++)
		{
			if(a.charAt(i) == a.charAt(k))
			{
				count++;
			}
			else
			{
				break;
			}
		}
	if(count>1)
	{
		System.out.print(a.charAt(i)+ ""+count);
	}
	else
	{
		System.out.println(a.charAt(i));
	}
}
		
	

}
}
