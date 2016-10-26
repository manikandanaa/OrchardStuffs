package bankingApplicationException;

public class InsufficientBalance extends Exception 
{
	public InsufficientBalance()
	{
		super();
	}
	public InsufficientBalance(String s)
	{
		super(s);
	}
}
