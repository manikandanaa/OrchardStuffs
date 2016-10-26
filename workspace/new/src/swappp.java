import java.util.Scanner;


public class swappp {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first number:");
		int x=s.nextInt();
		System.out.println("enter the second number:");
		int y=s.nextInt();
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("the two swapped nos are:" + x+" "+y);
	}
}
