package multithreading;

public class Onlyrunnable implements Runnable
{
	public void run()
	{  
		System.out.println("thread is running by implementing the runnable interface...");  
	}  
		  
	public static void main(String args[])
	{  
		Onlyrunnable m1=new Onlyrunnable();  
		Thread t1 =new Thread(m1);  
		t1.start();  
	}  
}  
//If not extending the Thread class,class object would not be treated as a thread object.
//So i need to explicitly create Thread class object.
//passing the object of the class that implements Runnable so that the class run() method may execute.