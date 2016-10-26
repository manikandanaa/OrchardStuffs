package compatabilitiy;

import java.lang.reflect.Array;


public class Mer 
{
	 
	public static void main(String[] args) 
	{
		int arr1[]={4,6, 9, 20, 56};
		int arr2[]={1, 7, 25, 45, 70};
		int[] result=merge(arr1, arr2);
		for (int j=0; j<result.length;j++)
		System.out.print(result[j]+ " ");
		result[0]=0;
		System.out.println("");
	
		for (int j=0; j<result.length-1;j++)
		System.out.print(result[j]+ " ");
		
		
		System.out.println("\n"+result[0]+"\t"+result[1]+"\t"+result[2]);
		System.out.println(""+result[3]+"\t"+result[4]+"\t"+result[5]);
		System.out.println(""+result[6]+"\t"+result[7]+"\t"+result[8]);
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