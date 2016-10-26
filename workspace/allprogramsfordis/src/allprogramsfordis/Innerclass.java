package allprogramsfordis;

public class Innerclass 
{
	private int data=30;  
	class Inner
	{  
	  void msg()
	  {
		  System.out.println("data is "+data);
	  }  
	}  
		 
	
	public static void main(String args[])
	{  
		Innerclass obj=new Innerclass();  
		Innerclass.Inner in=obj.new Inner();  
		  in.msg();  
	}  
		
}  
