package one;

import java.util.Scanner;

public class inher
{
	String j;
	Scanner sc=new Scanner(System.in);
	public void get(){
		System.out.println("enter a name");
		j=sc.nextLine();
	}
	public void did()
	{
		System.out.println("Welcome to inheritance  "+ j);
	}
}
class act extends inher
{
	public static void main(String args[])
	{
		act a=new act();
		a.get();
		a.did();
	}
}

