import java.util.Scanner;


public class Linear {

public static void main(String args[])
{
	int i,search,n,array[];
	Scanner man=new Scanner(System.in);
	do
	{
	System.out.println("enter number of elements:");
	n=man.nextInt();
	}while(n<=0);
	array=new int[n];
	
	System.out.println("enter"+ n +"Integers");
	for(i=0;i<n;i++)
		array[i]=man.nextInt();
	
	
	System.out.println("enter the value to find:");
	search=man.nextInt();
	for(i=0;i<n;i++)
	{
		if(array[i]==search)
		{
			System.out.println(search +"found at loaction" + (i+1) + ".");
			break;
		}
	}
	if(i==n)
	{
		System.out.println(search +"is not present in \n");
	}
}


}
