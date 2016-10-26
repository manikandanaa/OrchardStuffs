package com.mindtree.product;

public class Product implements Comparable<Product> 
{
	 int productId;
	 String brandName;
	 String description;
	 float price;
	 
	 
	 public Product(int productId,String brandName,String description,double price)
	{
		this.productId=productId;
		this.brandName=brandName;
		this.description=description;
		this.price=(float) price;
	}
	
	
	public int compareTo(Product p) 
	{
		if(productId==p.productId)
			return 0;
		else if(productId>p.productId)
			return 1;
		else
			return -1;
	}
	
}
