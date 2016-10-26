package attempt;

public class Propagation {

	void sub2() {
		int data = 50 / 0;
	}

	void sub1() {
		sub2();
	}

	void sub() {
		try {
			sub1();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String args[]) {
		Propagation obj = new Propagation();
		obj.sub();
		System.out.println("normal flow...");
	}
}
