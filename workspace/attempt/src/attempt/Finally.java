package attempt;

public class Finally {
	public static void main(String args[]) {
		try {
			int data = 25 / 0;
			System.out.println(data);
		} 
		finally {
			System.out.println("finally block is always executed");
		}
	}
}
