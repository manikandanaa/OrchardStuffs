
public class Student extends Person
{
public double percentage;
private String name;
public Student()
{
	
}
public  Student(double percentage, String name) 
{
	this.percentage = percentage;
	this.name = name;
}

public void display()
{
	System.out.print("\n percentage "+ percentage + "   name   "+ name );
}
public boolean isOutstanding()
{

	if(percentage>85)
	{		
		return true;
	}
	else
	{
		return false;
	}
}
}
