import java.util.Comparator;


public class PriceComparator implements Comparator<Product> 
{

	public int compare(Product p1,Product p2)
	{
		if(p1.price > p2.price)
		{
			return 1;
		}
		else if(p1.price < p2.price)
		{
			return -1;
		}
		if(p1.price==p2.price)
		{
			if(p1.productId==p2.productId)
			{
				return 0;
			}
			else if(p1.productId>p2.productId)
			{
				return 1;
			}
			else if(p1.productId<p2.productId)
			{
				return -1;
			}
		}
		return 0;
	}
}
