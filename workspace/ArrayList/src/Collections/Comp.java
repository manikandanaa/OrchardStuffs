package Collections;

import java.util.Comparator;

public class Comp implements Comparator<Comp> {
	int ID;
	String brandname, des;
	double cost;

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
}
