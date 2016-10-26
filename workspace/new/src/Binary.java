import java.util.Arrays;
import java.util.Scanner;


public class Binary 
{
public static void main(String args[])
{
	int i,last,first=0,mid,search,n,array[];
	Scanner man=new Scanner(System.in);
	System.out.println("enter number of elements:");
	n=man.nextInt();
	array=new int[n];
	
	System.out.println("enter"+ n +"Integers");
	for(i=0;i<n;i++)
		array[i]=man.nextInt();
	Arrays.sort(array);
	System.out.println("enter the value to find:");
	search=man.nextInt();
	last=n-1;
	mid=(first+last)/2;
	while(first<=last)
	{
		if(array[mid]< search)
		{
			first=mid+1;
		}
		else if(array[mid]==search)
		{
			System.out.println(search +"found at loaction" + (mid+1) + ".");
			break;
		}
		else
			last=mid-1;
		mid=(first+last)/2;
	}
	if(first>last)
	{
		System.out.println(search +"is not present in \n");
	}
}
}
