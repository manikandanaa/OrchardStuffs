package com.mindtree.product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Entity {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		Product p1=new Product(200,"DELL        " , "15_inch monitor" ,	3400.00);
		Product p2=new Product(120, " DELL		" , " 15 Laptop			" ,45000.00);
		Product p3=new Product(150, " MICROSOFT	" , " windows 7			" ,7000.00);
		Product p4=new Product(100, " LOGINTECH	" , " optical mouse		" , 540.00);
		System.out.println("Enter the Sorting Order   1.Brand Name \n 2.price");
		
		
		ArrayList<Product> a1=new ArrayList<Product>();
		
		a1.add(p1);
		a1.add(p2);
		a1.add(p3);
		a1.add(p4);
		
		
		Iterator i=a1.iterator();
		
		while(i.hasNext())
		{
			Product p=(Product)i.next();
			
			
			System.out.println("PRODUCT" + p.productId+"\t\t"+"BRAND NAME"+ p.brandName+"\t\t"+"DESCRIPTION"+p.description+"\t\t"+"PRICE"+p.price);
		}
		System.out.println("sorting according to Id");
		Collections.sort(a1);
		Iterator i1=a1.iterator();
		while(i1.hasNext())
		{
			Product p=(Product)i1.next();
			System.out.println("PRODUCT" + p.productId+"\t\t"+"BRAND NAME"+ p.brandName+"\t\t"+"DESCRIPTION"+p.description+"\t\t"+"PRICE"+p.price);
		}
		System.out.println("Enter the Sorting Order   1.Brand Name \n 2.Price");
			
		int choice=s.nextInt();
		
		switch(choice)
		{
		case 1:
			Collections.sort(a1,new brandName());
			Iterator k=a1.iterator();
			while(k.hasNext())
			{
				Product p=(Product)k.next();
				System.out.println("PRODUCT" + p.productId+"\t\t"+"BRAND NAME"+ p.brandName+"\t\t"+"DESCRIPTION"+p.description+"\t\t"+"PRICE"+p.price);	
			}
			break;
		case 2:
			Collections.sort(a1,new price());
			Iterator l=a1.iterator();
			while(l.hasNext())
			{
				Product p=(Product)l.next();
				System.out.println("PRODUCT" + p.productId+"\t\t"+"BRAND NAME"+ p.brandName+"\t\t"+"DESCRIPTION"+p.description+"\t\t"+"PRICE"+p.price);	
			}
			break;
		}
	}
}
class brandName implements Comparator<Product>
{
	public int compare(Product p1,Product p2)
	{
		if(p1.brandName.equals(p2.brandName))
		{
			return p1.description.compareTo(p2.description);
		}
		return p1.brandName.compareTo(p2.brandName);
	}
}


class price implements Comparator<Product>
{
	public int compare(Product p1,Product p2)
	{
		if(p1.price==p2.price)
		{
			return p1.productId-p2.productId;
		}
		return (int) (p1.price-p2.price);
	}
}
