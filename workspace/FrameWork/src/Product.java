
public class Product implements Comparable<Product> 
{
	 int productId;
	 String brandName;
	 String description;
	 double price;
	 
	 
	 public Product(int productId,String brandName,String description,double price)
	{
		this.productId=productId;
		this.brandName=brandName;
		this.description=description;
		this.price=price;
	}
	
	public int compareTo(Product compare) 
	{
		if(productId==compare.productId)
			return 1;
		else if(productId>compare.productId)
			return 0;
		else
			return -1;
	}
}
