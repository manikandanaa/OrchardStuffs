package com.Mindtree.Service;

import java.util.InputMismatchException;
import java.util.Scanner;

import bankingApplicationException.AccountCreationException;
import bankingApplicationException.AccountTransactionException;

import com.Mindtree.Entity.Account;

public class AccountService {
	int accountNumber;
	String customerName;
	double balance;
	int b,c,sendid,recieveid,f;
	double amount,balance2;
	Scanner s=new Scanner(System.in);
	public static Account[] a=new Account[5];
	public static int pos=0;
	public void createAccount() throws AccountCreationException
	{
		do
		{
			try
			{
				f=0;
				System.out.println("enter the account number");
				accountNumber=s.nextInt();
				if(accountNumber<=0)
				{
					f=1;
				}
			}
			catch(InputMismatchException e)
			{
				System.out.println("Enter the valid account number");
				s.nextLine();
				f=1;
			}
		}while(f==1);
		for(int i=0;i<pos;i++)
		{
			f=0;
			if(a[i].getAccountNumber()==accountNumber)
			{
				f=1;
			}
		}
		if(f==1)
		{
			throw new AccountCreationException("The account number already exist");
		}
		do
		{
			try
			{
				f=0;
				do
				{
					f=1;
					System.out.println("enter the name");
					customerName=s.next();
					if(customerName.matches("[A-Z a-z]+"))
					{
						f=0;
					}
				}while(f==1);
			}catch(InputMismatchException e)
			{
				System.out.println("Enter the valid name");
				f=1;
			}
		}while(f==1);
		do
		{
			try
			{
					f=0;
					System.out.println("enter initial deposit amount");
					balance=s.nextDouble();
					if(balance<=0)
					{
						System.out.println("enter the valid amount");
						f=1;
					}
			}catch(InputMismatchException e)
			{
				f=1;
				System.out.println("Enter the valid amount");
				s.nextLine();
			}
		}while(f==1);
		a[pos]=new Account(accountNumber,customerName,balance);
		pos++;
	}
	
	public void transferFunds()throws AccountTransactionException
	{
		do
		{
			try
			{
				f=0;
				System.out.println("Enter the senders Account Number");
				b=s.nextInt();
			}catch(InputMismatchException e)
			{
				System.out.println("Enter the valid account number");
				s.nextLine();
				f=1;
			}
		}while(f==1);
		f=0;
		for(int i=0;i<pos;i++)
		{
			if(a[i].getAccountNumber()==b)
			{
				sendid=i;
				f=1;
			}
		}
		if(f==0)
		{
			throw new AccountTransactionException("Invalid Transaction");
		}
		do
		{
			try
			{
				f=0;
				System.out.println("enter the recipient account number");
				c=s.nextInt();
			}catch(InputMismatchException e)
			{
				System.out.println("enter the valid account number");
				f=1;
				s.nextLine();
			}
		}while(f==1);
		f=0;
		for(int i=0;i<pos;i++)
		{
			if(a[i].getAccountNumber()==c)
			{
				f=1;
				recieveid=i;
			}
		}
		if((f==0)||(b==c))
		{
			throw new AccountTransactionException("Invalid Transaction");
		}
		do
		{
			do
			{
				try
				{
					f=0;
					System.out.println("enter the amount to be transferred");
					amount=s.nextDouble();
				}catch(InputMismatchException e)
				{
					System.out.println("enter the valid amount");
					f=1;
				}
			}while(f==1);
			f=0;
			if((amount<0)||(a[sendid].getBalance()<amount))
			{
				System.out.println("enter the amount within the balance");
				f=1;
			}
		}while(f==1);
		balance2=a[sendid].getBalance()-amount;
		a[sendid].setBalance(balance2);
		
		balance2=a[recieveid].getBalance()+amount;
		a[recieveid].setBalance(balance2);
		
		System.out.println("the transaction completed succesfully");
		s.nextLine();
	}
	
	public void getAccount()
	{
		do
		{
			do
			{
				try
				{
					f=0;
					System.out.println("enter the account number to be displayed the account");
					b=s.nextInt();
					if(b<0)
					{
						f=1;
					}
				}catch(InputMismatchException e)
				{
					System.out.println("enter the valid account number");
					s.nextLine();
					f=1;
				}
			}while(f==1);
			f=0;
			for(int i=0;i<pos;i++)
			{
				if(a[i].getAccountNumber()==b)
				{
					recieveid=i;
					f=1;
				}
			}
			if(f==0)
			{
				System.out.println("the account is not present");
			}
		}while(f==0);
System.out.println("ACCOUNT HOLDER NAME:    "+ a[recieveid].getCustomeName());
System.out.println("ACCOUNT NUMBER:         "+ a[recieveid].getAccountNumber());
System.out.println("CURRENT BALANCE:        "+ a[recieveid].getBalance());
	}
}
