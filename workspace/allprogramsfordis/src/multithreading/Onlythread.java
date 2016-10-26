package multithreading;

public class Onlythread extends Thread
{
	public void run()
	{  
		System.out.println("thread running only by extending the thread class..");  
	}
	
	public static void main(String args[])
	{  
		Onlythread t1=new Onlythread();  
		t1.start();  
	}  
}  


