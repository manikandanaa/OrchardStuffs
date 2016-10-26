package mainClass;

import java.util.Scanner;

import bankingApplicationException.AccountCreationException;
import bankingApplicationException.AccountTransactionException;
import bankingApplicationException.InsufficientBalance;
import bankingApplicationException.InvalidAmountException;

import com.Mindtree.Entity.Account;
import com.Mindtree.Service.AccountService;

public class MainClass 
{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int choice=0;
	int f;
	String op;
	String valid="y";
	AccountService as=new AccountService();
	Account ac=new Account();
	
	do
	{
		System.out.println("BANKING SERVICE");;
		do
		{
			try
			{
				f=0;
				System.out.println("Enter the Choice to Perform:: \n 1-CREATE ACCOUNT \n 2-TRANSFER FUNDS \n 3-DEPOSIT \n 4-WITHDRAW \n 5-BALANCE ENQUIRY");
				choice= s.nextInt();
			}
			catch(Exception e1)
			{
				System.out.println("Enter the valid choice");
				f=1;
				s.nextLine();
			}
		}while(f==1);
		if(choice==1)
		{
			if(AccountService.pos<=5)
			{
				choice=1;
			}
			else
			{
				System.out.println("Maximum no of account reached,cant create more");
				choice=10;
			}
		}
		if(choice==2)
		{
			if(AccountService.pos<2)
			{
				System.out.println("Add accounts to transfer");
				choice=2;
			}
		}
		if(choice==3||choice==4||choice==5)
		{
			if(AccountService.pos==0)
			{
				System.out.println("Add a account to perform operation");
				choice=10;
			}
		}
		switch(choice)
		{
		case 1:
			do
			{
				try
				{
					f=0;
					as.createAccount();
				}
				catch(AccountCreationException e)
				{
					f=1;
					System.out.println(e);
				}
			}while(f==1);
			break;
		case 2:
			do
			{
				try
				{
					f=0;
					as.transferFunds();
				}
				catch(AccountTransactionException e)
				{
					System.out.println(e);
					f=1;
				}
			}while(f==1);
			break;
		case 3:
			do
			{
				try
				{
					f=0;
					ac.deposit();
				}
				catch(InvalidAmountException e)
				{
					f=1;
					System.out.println(e);
				}
			}while(f==1);
			break;
		case 4:
			do
			{
				try
				{
					f=0;
					ac.withdraw();
				}
				catch(InsufficientBalance e)
				{
					f=1;
					System.out.println(e);
				}
			}while(f==1);
			break;
		case 5:
			as.getAccount();
			break;
			default:
				System.out.println("enter the valid choice to perform the operation");
		}
		System.out.println("do you want to continue y/n");
		op=s.next();
	}while(op.equals(valid));
}
}
