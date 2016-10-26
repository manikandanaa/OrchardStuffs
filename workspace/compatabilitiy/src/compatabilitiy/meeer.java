package compatabilitiy;

import java.util.Scanner;

public class meeer 
{
	public static void main(String[] args) 
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
		
		int[] result=merge(arr1, arr2);
		for (int j=0; j<result.length;j++)
		System.out.print(result[j]+ " ");
		result[0]=0;
		System.out.println("");
	
		for (int j=0; j<result.length-1;j++)
		System.out.print(result[j]+ " ");
	}
	 
	static int[] merge(int[] arr1, int[] arr2)
	{
		int arr1_Length=arr1.length;
		int arr2_Length=arr2.length;
		int[] result = new int[arr1_Length + arr2_Length];
		int i=0,j=0;
	 
		for(int k = 0 ; k< (arr1_Length + arr2_Length);k++)
		{
			if ( i >= arr1_Length ) 
			{
				result[k] = arr2[j];
				j++;
			}
			else if ( j >= arr2_Length)
			{
				result[k] = arr1[i];
				i++;
			}
			else
			{
	 
				if ( arr1[i] < arr2[j]) 
				{
					result[k] = arr1[i];
					i++;
				}
				else
				{
					result[k] = arr2[j];
					j++;
				}
			}
		}
		
		return result;		
	}
		

}
