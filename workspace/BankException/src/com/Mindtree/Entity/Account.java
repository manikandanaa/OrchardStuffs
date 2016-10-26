package com.Mindtree.Entity;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.Mindtree.Service.AccountService;

import bankingApplicationException.InsufficientBalance;
import bankingApplicationException.InvalidAmountException;
public class Account 
{
private int accountNumber;
private String customerName;
private double balance;
int b,c,sendid,recieveid,f;
double amount,balance2;
Scanner s=new Scanner(System.in);
AccountService as=new AccountService();
public Account()
{
	accountNumber=0;
	customerName="";
	balance=0;
}
public Account(int accountNumber,String customerName,double balance)
{
	this.accountNumber=accountNumber;
	this.customerName=customerName;
	this.balance=balance;
}
public int getAccountNumber()
{
	return accountNumber;
}
public void setAccountNumber(int accountNumber)
{
	this.accountNumber=accountNumber;
}
public String getCustomeName()
{
	return customerName;
}
public void setCustomerName(String customeName)
{
	this.customerName=customeName;
}
public double getBalance()
{
	return balance;
}
public void setBalance(double balance)
{
	this.balance=balance;
}
public void deposit() throws InvalidAmountException
{
	do
	{
		do
		{
			try
			{
				f=0;
				System.out.println("enter the account number to be deposited");
				b=s.nextInt();
			}catch(Exception e)
			{
				System.out.println("Enter the valid account number");
				s.nextLine();
				f=1;
			}
		}while(f==1);
		for(int i=0;i<AccountService.pos;i++)
		{
			c=AccountService.a[i].getAccountNumber();
			if(c==b)
			{
				f=1;
				sendid=i;
			}
		}
		if(f==0)
		{
			System.out.println("The account number is not valid");
		}
	}while(f==0);
	do
	{
		try
		{
			f=0;
			System.out.println("enter the amount to be deposited");
			amount=s.nextDouble();
			if(amount<0)
			{
				f=1;
				throw new InvalidAmountException("enter the valid amount");
			}
		}catch(InputMismatchException e)
		{
			System.out.println("enter the valid amount");
			s.nextLine();
			f=1;
		}
	}while(f==1);
	
	balance2=AccountService.a[sendid].getBalance()+amount;
	AccountService.a[sendid].setBalance(balance2);
	System.out.println("the amount deposited successfully");
}
public void withdraw() throws InsufficientBalance
{
	do
	{
		do
		{
			try
			{
				System.out.println("Enter the account number to be withdrawn");
				b=s.nextInt();
			}catch(InputMismatchException e)
			{
				System.out.println("Enter the valid account number");
				s.nextLine();
				f=1;
			}
		}while(f==1);
		f=0;
		for(int i=0;i<AccountService.pos;i++)
		{
			c=AccountService.a[i].getAccountNumber();
			if(c==b)
			{
				sendid=i;
				f=1;
			}
		}
		if(f==0)
		{
			System.out.println("The entered account is invalid");
		}
	}while(f==0);
	do
	{
		try
		{
			f=0;
			System.out.println("Enter the amount to be withdrawn");
			amount=s.nextDouble();
			if(amount<0)
			{
				f=1;
			}
		}catch(InputMismatchException e)
		{
			System.out.println("Enter the valid amount");
			s.nextLine();
			f=1;
		}
	}while(f==1);
	if(amount>AccountService.a[sendid].getBalance())
	{
		throw new InsufficientBalance("Insufficient balance");
	}
	balance2=AccountService.a[sendid].getBalance()-amount;
	AccountService.a[sendid].setBalance(balance2);
	System.out.println("The amount withdrawn successfully");
	s.nextLine();
}
}
