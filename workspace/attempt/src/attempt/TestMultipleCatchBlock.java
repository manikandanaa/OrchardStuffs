package attempt;


	public class TestMultipleCatchBlock{  
		  public static void main(String args[]){  
		   try{  
		    int a[]=new int[5];  
		    a[5]=30/0;
		   }  
		   catch(ArithmeticException e)
		   {
			   System.out.println("executing this ar exception");
		   }  
		   catch(ArrayIndexOutOfBoundsException e)
		   {
			   System.out.println("task 2 completed");
		   }  
		   catch(Exception e)
		   {
			   System.out.println("common task completed");
		   }  
		  
		   System.out.println("excuting");  
		 }  
		}  

