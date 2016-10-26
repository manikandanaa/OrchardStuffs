import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayListFrame {
	public static void main(String args[]) {
		List<Product> a = new ArrayList<Product>();
		a.add(new Product(200, "DELL \t", "15 Inch Monitor ", 3400.44));
		a.add(new Product(120, "DELL	", "Laptop \t", 45000.00));
		a.add(new Product(150, "Microsoft \t", "Windows 7 \t", 7000.50));
		a.add(new Product(100, "Logitech \t", "Optical Mouse ", 540.00));
		
		Collections.sort(a);
		System.out.println("selected by ID");
		Iterator itr = a.iterator();
		while (itr.hasNext()) 
		{
			Product p = (Product) itr.next();
			System.out.println(p.productId + " " + p.brandName + " "
					+ p.description + " " + p.price);
			}
		System.out.println("Enter to sort\n 1.BrandName \n 2.Price");
		Scanner s = new Scanner(System.in);
		int choice = s.nextInt();
		if (choice == 1) {
			Collections.sort(a, new BrandComparator());
		} else if (choice == 2) {
			Collections.sort(a, new PriceComparator());
		}
		Iterator i = a.iterator();
		while (i.hasNext()) {
			Product p = (Product) i.next();
			System.out.println(p.productId + " " + p.brandName + " "
					+ p.description + " " + p.price);
		}
	}
}
