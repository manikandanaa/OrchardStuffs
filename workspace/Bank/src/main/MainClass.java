package main;

import java.util.InputMismatchException;
import java.util.Scanner;

import account.Account;
import account.Insufficentfund;
import account.invalidAmount;


public class MainClass 
{
	public static void main(String[] args)
	{
		Account ac=new Account();
		Scanner sc=new Scanner(System.in);
		String str1="y",str2;
		int choice;
		int a;
		do
		{
			System.out.println("enter the operation to perform \n 1-Deposit 2-Withdraw 3-Balance enquiry");
			choice=sc.nextInt();
			int f;
			switch(choice)
			{
			case 1:
				do
				{
					try
					{
						f=0;
						System.out.println("Enter the amount to be Deposited");
						a=sc.nextInt();
						ac.deposit(a);
					}
					catch(invalidAmount e)
					{
						System.out.println(e);
						f=1;
					}
					catch(InputMismatchException e)
					{
						System.out.println("Enter the valid Input");
						f=1;
					}
				}while(f==1);
				break;
				
			case 2:
				do
				{
				
					try
					{
						f=0;
						System.out.println("Enter the amount to be Withdrawn");
						a=sc.nextInt();
						ac.withdraw(a);
					}
					catch(InputMismatchException e)
					{
						f=1;
						System.out.println("Enter the valid Input");
					}
					catch(Insufficentfund e)
					{
						f=1;
						System.out.println(e);
					}
				}while(f==1);
				break;
				
			case 3:
				try
				{
					ac.balanceEnquiry();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				break;
				
			default:
			System.out.println("Enter the valid choice");
			}
			System.out.println("Do you want to  continue y/n");
			str2=sc.next();
		}while(str1.equals(str2));
	}
}

