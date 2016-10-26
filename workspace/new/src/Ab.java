
abstract class Ab 
{
		  abstract void run();
}
class Honda4 extends Ab
{  
		void run()
		{
			System.out.println("running safely..");
		}  
public static void main(String args[])
{  
		 Ab obj = new Honda4();  
		 obj.run();  
}  
} 
