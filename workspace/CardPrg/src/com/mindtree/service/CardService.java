package com.mindtree.service;
import com.mindtree.entity.*;

public class CardService 
{
	static Card[] card=new Card[52];
	static int j;
	static boolean addCardToDeck(Card c)
	{
		boolean flag=false;
		for(int i=0;i<52;i++)
		{
			if(c.equals(card[i]))
			{
				flag=true;
			}
		}
		if(flag==false)
		{
			card[j]=c;
			j++;
			return true;
		}
		else
		{
			return false;
		}
		
	}
	static void getAllCards()
	{
		for(int m=0;m<j;m++)
		{
			System.out.println("suit ="+ card[m].suit+""+" rank= "+card[m].rank);
		}
	}
}
