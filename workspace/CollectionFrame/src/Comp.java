import java.util.Comparator;

import Collections.Comp;


public class Comp implements Comparable<Comp> 
{
		 int CompId;
		 String brandName;
		 String description;
		 double price;
		 
		 ..........................................
		 
		 Comp() {

			}

			public Comp(int no, String s1, String s2, double f) {
				ID = no;
				brandname = s1;
				des = s2;
				cost = f;
			}

			public void display() {
				System.out.println(ID + "\t\t" + brandname + "\t\t" + des + "\t\t"
						+ cost);
			}

			public String toString() {
				return "ID=" + ID + " brandname=" + brandname + "des=" + des + "cost="
						+ cost;
			}

			public int compare(Comp e1, Comp e2) {
				if (e1.cost < e2.cost) {
					return -1;
				} else if (e1.cost > e2.cost) {
					return 1;
				} else {
					if (e1.ID < e2.ID) {
						return -1;
					} else {
						return 1;
					}
				}
			}

			Comparator<Comp> pr = new Comparator<Comp>() {
				public int compare(Comp c1, Comp c2) {
					if (c1.brandname.compareTo(c2.brandname) == -1)
						return -1;
					else if (c1.brandname.compareTo(c2.brandname) == 1)
						return 1;
					else {
						if (c1.des.compareTo(c2.des) == -1)
							return -1;
						else {
							return 1;
						}

					}
				}
			};		 
		 
		 ......................................................................................
		 public Comp(int CompId,String brandName,String description,double price)
		{
			this.CompId=CompId;
			this.brandName=brandName;
			this.description=description;
			this.price=price;
		}
		
		
		public int compareTo(Comp p) 
		{
			if(productId==p.productId)
				return 0;
			else if(CompId>p.CompId)
				return 1;
			else
				return -1;
		}
		
}
