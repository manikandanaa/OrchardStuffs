package compatabilitiy;

import java.util.Scanner;

class WrongInput extends Exception
{
	WrongInput(String s)
	{
		super(s);
		System.out.println("bye buddy");
	}
}
class Input
{
	void method() throws WrongInput
	{
		throw new WrongInput("invalid input");
	}
}
class TestInput
{
	public static void main(String args[])
	{
		try
		{
			new Input().method();
		}
		catch(WrongInput why)
		{
			System.out.println(why.getMessage());
		}
	}
}

