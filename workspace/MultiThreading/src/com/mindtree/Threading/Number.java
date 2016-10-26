package com.mindtree.Threading;

public class Number extends Thread 
{
public static int count=0;
private int value=0;
public Number()
{
}

@Override
public void run()
{
	value=count;
	for(int i=0;i<10000;i++)
	{
		value++;
	}
	count=value;
	System.out.println("count after the thread" + Thread.currentThread());
	System.out.println("count" + count);
}
}
