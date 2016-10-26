package threading;

public class Synchronised extends Thread
{
	static int value;
	public void run()
	{
		inc();
	}
	
	static  synchronized void inc()
	{
		for(int j=0;j<10000;j++)
		{
			value++;
		}
	}
	
}
