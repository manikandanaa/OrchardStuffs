package compatabilitiy;

import java.util.Scanner;

public class perc
{
public static void main(String args[])
{
	int  i=0, j, count=0;
	double temp;
	double a[]={86, 75, 96.5, 99.2, 65.5, 78.56, 89.1, 89, 88.9, 100, 99.45, 77.6, 79.5};
	for(i=0;i<13;i++)
	{
	for( j=0;j<12;j++)
	{
		if(a[j]>a[j+1])
		{
			temp=a[j+1];
			a[j+1]=a[j];
			a[j]=temp;
		}
			
	}
			
	}
	for(i=0;i<13;i++)
	{
		if(a[i]>80)
			count++;
	System.out.println(a[i]);
	}
	System.out.println("the attedance above 80:"+ count);
	for(i=0;i<5;i++)
		System.out.println("the least five:"+ a[i]);
	for(i=8;i<13;i++)
		System.out.println("the high five:"+ a[i]);
}
}
