package product;
public class ProductImpl 
{
	static Product[] pd=new Product[10];
	static int j;
	static boolean addProduct(Product c)
	{
		boolean flag=false;
		for(int i=0;i<10;i++)
		{
			if(c.equals(pd[i]))
			{
				flag=true;
			}
		}
		if(flag==false)
		{
			pd[j]=c;
			j++;
			return true;
		}
		else
		{
			return false;
		}
		
}
}
