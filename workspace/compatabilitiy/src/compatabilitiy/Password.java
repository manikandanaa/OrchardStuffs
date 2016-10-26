package compatabilitiy;

public class Password 
{
String name;
Password(String mem)
{
	this.name=mem;
}
public void check()
{
	int uppercase=0,lowercase=0,symbol=0,digits=0;
	for(int i=0;i<name.length();i++)
	{
		if(i>8)
		{
			System.out.println("enter only 8 password!!!!!!!!!");
		}
		if((name.charAt(i)>=48)&&(name.charAt(i)<=57))
		{
			digits++;
		}
		else if((name.charAt(i)>=65)&&(name.charAt(i)<=90))
		{
			uppercase++;
		}
		else if((name.charAt(i)>=97)&&(name.charAt(i)<=122))
		{
			lowercase++;
		}
		else if((name.charAt(i)>=33)&&(name.charAt(i)<=126))
		{
			symbol++;
		}
	}
	if((uppercase>=1)&&(lowercase>=1)&&(symbol>=1)&&(digits>=1))
	{
		System.out.println("entered password is valid");
	
	}
	else
	{
		System.out.println("invalid");
		mainpass.main(null);
	}
}
}
