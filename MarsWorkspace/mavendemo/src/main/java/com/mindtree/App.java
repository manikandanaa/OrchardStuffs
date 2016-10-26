package com.mindtree;

public class App 
{
public static int findMax(int arr[])
{
	int max=arr[0];
	for(int i=1;i<arr.length;i++)
	{
		if(max<arr[i])
		{
			max=arr[i];
		}
	}
	return max;
}
public static boolean  Operation()throws ArithmeticException
{
	int a=0;
	int b=1/a;
	return true;
}
public static void main(String[] args) {
	App d=new App();
	int a[]={1,2,3,4,5};
	System.out.println(d.findMax(a));
	d.Operation();
}
}
