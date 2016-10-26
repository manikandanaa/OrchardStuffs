import java.util.Scanner;




public class add 
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value of first");
	int a=sc.nextInt();
	System.out.println("enter the value of second");
	int b=sc.nextInt();
	int c;
	int d;
	System.out.println("the add value will be:");
	c=a+b;
	System.out.println(c);
	System.out.println("the sub value wil be:");
	d=a-b;
	System.out.println(d);
	if(c>d)
	{
		System.out.println("the c value is greater:");
	}
	else
	{
		System.out.println("the value d is greater:");
	}
	if(!(c==d))
	{
		System.out.println("logical operator operation is done:");
	}
	else
	{
		System.out.println("logical operation");
	}
}
}
