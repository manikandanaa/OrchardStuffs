package com.mindtree.service;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.mindtree.entity.Card;

public class CardExample 
{
	public static void main(String args[])
	{
		CardService cs=new CardService();
		
		String[] suits={"Clubs","Diamonds","Hearts","Spades"};
		String[] ranks={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		Scanner in=new Scanner(System.in);
		boolean flag=false;
		boolean flag1=false;
		boolean flag2 = false;
		String suit;
		String rank;
		int count=2;
		int n=0;
		try
		{
		do
		{
		System.out.println("1.Add the cards to the deck \n 2.Display \n 3. Exit \n");
		do
		{
		try
		{
			n=Integer.parseInt(in.next());
			count=0;
		}
		catch(NumberFormatException m)
		{
			System.out.println("enter the num only");
		}
		}while(count>1);
		switch(n)
		{
		case 1:
			
			do
			{
				System.out.println("enter the suit :");
				suit=in.next();
				for(int i=0;i<4;i++)
				{
					if(suit.equalsIgnoreCase(suits[i]))
					{
						flag2=false;
					}
				}
				if(flag2==true)
					{
						System.out.println("enter the valid suit");
					}
				
			}while(flag2==true);
			flag2=true;
			do
			{
				System.out.println("enter the rank :");
				rank=in.next();
				for(int i=0;i<13;i++)
				{
					if(rank.equalsIgnoreCase(ranks[i]))
					{
						flag2=false;
					}
				}
				if(flag2==true)
				{
					System.out.println("enter the valid rank");
				}
			}while(flag2==true);
			Card d1=new Card(suit,rank);
			if(cs.addCardToDeck(d1))
			{
				System.out.println("card is added");	
			}
			else
			{
				System.out.println("duplicate");
			}
			flag=true;
			break;
		case 2:
			cs.getAllCards();
			flag=true;
			break;
		case 3:
			System.exit(0);
			break;
			default:
				System.out.println("enter the valid choice");
				flag=true;
				break;
	}
	}while(flag==true);
}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
}
}
