package compatabilitiy;

import java.util.Scanner;

public class Me 
{
public static void main(String args[])
{
	int[] arr1=new int[100];
	int[] arr2=new int[100];
	Scanner y=new Scanner(System.in);
	System.out.println("number of elements in array 1:");
	int n1=y.nextInt();
	System.out.println("enter the array 1 element:");
	for(int i=0;i<n1;i++)
	{
		arr1[i]=y.nextInt();
	}
	System.out.println("number of element in array 2:");
	int n2=y.nextInt();
	System.out.println("enter the array 2 element:");
	for(int i=0;i<n2;i++)
	{
		arr2[i]=y.nextInt();
	}
	int[] arr3=new int[arr1.length + arr2.length];
	mergeSort(arr1);
	mergeSort(arr2);
	merge(arr3,arr1,arr2);
	mergeSort(arr3);
	for(Integer c:arr3)
	{
		System.out.println(c);
	}
}
public static void mergeSort(int[] arr3)
{
	if(arr3.length>2)
	{
		int[] left=new int [arr3.length/2];
		int[] right=new int [arr3.length-arr3.length/2];
		for(int i=0;i<left.length;i++)
		{
			left[i]=arr3[i];
		}
		for(int i=0;i<right.length;i++)
		{
			right[i]=arr3[i+arr3.length/2];
		}
		mergeSort(left);
		mergeSort(right);
		merge(arr3,left,right);
	}
}
public static void merge(int[] arr3,int[] left,int[] right)
{
	int a=0,b=0;
	for(int i=0;i<arr3.length;i++)
	{
		if(b>=right.length ||( a<left.length))
		{
			arr3[i]=left[a];
			a++;
		}
		else
		{
			arr3[i]=right[b];
			b++;
		}
	}
}

}
