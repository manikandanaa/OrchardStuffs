package account;

import java.util.Scanner;

public class Account
{
	final int accountNumber=100;
	String holderName="mani";
	static int balance=1000;
	int a;
	Scanner sc=new Scanner(System.in);
	public void deposit(int a) throws invalidAmount
	{
		if(a<0)
		{
			throw new invalidAmount("enter the valid amount");
		}
		else
		{
			balance=balance+3;
		}
	}
	public void withdraw(int a) throws Insufficentfund
	{
		if(a>balance)
		{
			throw new Insufficentfund("enter the valid amount");
		}
		else
		{
			balance=balance-a;
			System.out.println("The amount is withdrawn successfully");
		}
	}
	public void balanceEnquiry()
	{
		System.out.println("The account holder name is" + holderName);
		System.out.println("The account number" + accountNumber);
		System.out.println("The balance is" +balance);
	}
}
