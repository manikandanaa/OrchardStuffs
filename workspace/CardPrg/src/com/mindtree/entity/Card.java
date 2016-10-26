package com.mindtree.entity;

public class Card {
	public String suit;
	public String rank;
	public Card() 
	{
		this.suit=null;
		this.rank=null;
	}
	public Card(String suit, String rank) 
	{
		this.suit = suit;
		this.rank = rank;
	}
	public String getRank() 
	{
		return rank;
	}
	public void setRank(String rank) 
	{
		this.rank = rank;
	}
	public String getSuit() 
	{
		return suit;
	}
	public void setSuit(String suit) 
	{
		this.suit = suit;
	}
	public boolean equals(Object obj)
	{
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(getClass()!=obj.getClass())
			return false;
		Card o=(Card)obj;
		if(rank==null)
		{
			if(o.rank!=null)
				return false;
		}
		else if(!rank.equals(o.rank))
			return false;
		
		if(suit==null)
		{
			if(o.suit!=null)
				return false;
		}
		else if(!suit.equals(o.suit))
			return false;
		return true;
	}
}
