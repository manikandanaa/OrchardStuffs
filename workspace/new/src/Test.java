class Bank {
	int getRateOfInterest() {
		return 0;
	}
}
class ICICI extends Bank {
	int getRateOfInterest() {
		return 7;
	}
}
class AXIS extends ICICI {
	int getRateOfInterest() {
		return 9;
	}
	public int add() {
		return 10;

}
}
public class Test {
	public static void main(String args[]) {
		Bank b2 = new ICICI();
		Bank b3 = new AXIS();
		System.out.println("ICICI Rate of Interest: " + b2.getRateOfInterest());
		System.out.println("AXIS Rate of Interest: " +  b3.getRateOfInterest());
	}
}
