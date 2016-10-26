package compatabilitiy;

import java.util.Scanner;

public class comppresion 
{
public static void main(String args[])
{
	comppresion c=new comppresion();
	String a;
	a=c.getString();
	c.process(a);
}
public String getString()
{
	System.out.println("enter the input:");
	Scanner s=new Scanner(System.in);
	String b=s.next();
	return (b);
}
public void process(String a)
{
	int count;
	for(int i=0;i<a.length()-1;i=i+count)
	{
		count=1;
		for(int k=i+1;k<a.length();k++)
		{
			if(a.charAt(i) == a.charAt(k))
			{
				int array=a.charAt(i)+count;
					count++;
			}
			else
			{
				break;
			}
		}
	if(count>1)
	{
		System.out.print(a.charAt(i)+""+count);
	}
	else
	{
		System.out.print(a.charAt(i));
	}
}
}
}
