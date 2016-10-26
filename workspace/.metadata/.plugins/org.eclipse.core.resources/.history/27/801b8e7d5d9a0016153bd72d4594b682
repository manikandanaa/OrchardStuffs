package threading;


import java.io.IOException;
import java.util.Scanner;

public class MainThread 
{
public static void main(String[] args) throws IOException
{
	int c=1;
	long e=0;
	int th;
	System.out.println("enter the no of threads ");
	Scanner sc=new Scanner(System.in);
	th=sc.nextInt();
	Synchronised[] a=new Synchronised[th];
	
	for(int i=0;i<th;i++)
	{
		a[i]=new Synchronised();
	}
	long s=System.currentTimeMillis();
	System.out.println("start time" + s);
	for(int i=0;i<th;i++)
	{
		a[i].start();
	}
	
	try
	{
		for(int b=0;b<th;b++)
		{
			a[b].join();
		}
		
		e=System.currentTimeMillis();
		System.out.println("end time"+ e);
		System.out.println("total time in ms="+(e-s));
		System.out.println("value of the count="+Synchronised.value);
		
		
	}
	catch(InterruptedException error)
	{
		error.printStackTrace();
	}
}
}
