import java.util.Scanner;


public class Test 
{
public static void main(String args[])
{
	int a = 0;
	int b = 0;
	int c = 0;
	try
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numerator number:");
		a=sc.nextInt();
		System.out.println("enter the denominator number:");
		b=sc.nextInt();
		c=a/b;
		System.out.println("the output is :" + c);
	}
	catch(Exception e)
	{
			System.out.println("denominator number should not be zero");
	}
	    
}
}
