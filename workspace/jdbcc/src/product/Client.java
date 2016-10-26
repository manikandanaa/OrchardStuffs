package product;

import java.util.Scanner;



public class Client 
{
public static void main(String args[])
{
	String name = null;
	int id = 0;
	double price = 0;
	try
	{
		
		ProductImpl impl=new ProductImpl();
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number of products to be added");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			
			System.out.println("enter the product id:");
			id = sc.nextInt();
			System.out.println("enter the product name:");
			name = sc.next();
			System.out.println("enter the price:");
			price = sc.nextDouble();
			System.out.println(id+"\n" + ""+ name +"\n"+ "" + price+ "\n");
		}
		Product  d1=new Product(id,name,price);
		if(impl.addProduct(d1))
		{
			System.out.println("the product is added");
		}
	}
	catch(Exception e)
	{
		
	}
}
}
