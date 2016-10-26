package compatabilitiy;

import java.util.Scanner;

public class mainpass 
{
String mem;
public static void main(String args[])
{
	System.out.println("enter the password:");
	Scanner d=new Scanner(System.in);
	String mem=d.next();
	Password z=new Password(mem);
	z.check();
}
}
