package attempt;

public class Mul implements Runnable
{
	int count=0;
	public synchronized void run()
	{
		for(int i=0;i<10000;i++)
		{
	
	count++;
		}
		System.out.println(count);
	}
	
	public  static  void main(String[] args)
	{
		Mul q=new Mul();
		Thread t1=new Thread(q);  
		Thread t2=new Thread(q);  
		t1.start();
		t2.start();
		}

}
