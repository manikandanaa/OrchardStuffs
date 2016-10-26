
public class Professor extends Person
{
int booksPublished;
private String name;
public Professor()
{
	
}
public  Professor(int booksPublished, String name) 
{
	this.booksPublished = booksPublished;
	this.name = name;
}
public void print()
{
	System.out.println("\n published book  " + booksPublished + "   name   "+ name  );
}

public boolean isOutstanding()
{
	
if(booksPublished>4)
	{
	return true;
	}
else
	{
		return false;
	}
	}
}

