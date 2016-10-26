import java.util.Comparator;


public class BrandComparator implements Comparator<Product>
{

	public int compare(Product p1, Product p2)
	{
		if(p1.brandName.compareTo(p2.brandName)==0)
		{
			return p1.description.compareTo(p2.description);
		}
		else
		{
			return p1.brandName.compareTo(p2.brandName);
		}
	}
	
}
