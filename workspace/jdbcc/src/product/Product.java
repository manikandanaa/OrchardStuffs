package product;

public class Product 
{
	int productid;
	String productname;
	double price;
	public Product(int productid, String productname, double price) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.price = price;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
