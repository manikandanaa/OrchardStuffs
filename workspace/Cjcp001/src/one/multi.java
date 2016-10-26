package one;

import java.util.Scanner;
class check
{
	public void print()
	{
		System.out.println("How r u");
	}
}

 public class multi extends check
{
		String j;
		Scanner sc=new Scanner(System.in);
		public void get()
		{
			System.out.println("enter a name");
			j=sc.nextLine();
		}
		public void did()
		{
			System.out.println("Welcome to inheritance  "+ j);
		}
}

class am extends multi
{
	public static void main(String args[])
	{
			am a=new am();
			a.get();
			a.did();
			a.print();
	}
}
