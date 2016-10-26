package attempt;

public class Multi implements Runnable
{
	public void run()
	{
		System.out.println("hi");
	}

 
		public  static  void main(String[] args)
	{
		Multi p=new Multi();
		Thread t1=new Thread(p);  
		t1.start();
		}
}
	

