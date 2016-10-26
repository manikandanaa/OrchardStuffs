package bankingApplicationException;

public class InvalidAmountException extends Exception
{
	public InvalidAmountException ()
	{
		super();
	}
	public InvalidAmountException(String a)
	{
		super(a);
	}
}
