package com.mindtree;

public class Depri 
{
	void m(){System.out.println("hello m");}  
	  
//	@Deprecated
	 
	static void n(){System.out.println("hello n");}  
	}  
	  
	class TestAnnotation3
	{  
	public static void main(String[] args)
	{    
		Depri a=new Depri();  
		Depri.n();  
	}
}  
