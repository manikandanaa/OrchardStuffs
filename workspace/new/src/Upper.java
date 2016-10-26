import java.util.Scanner;


public class Upper 
{
public static void main(String args[])
{
	int a[][]=new int[5][5];
	System.out.println("enter the order of matrix:");
	System.out.println("enter the rows:");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	System.out.println("enter the columns:");
	Scanner c=new Scanner(System.in);
	int m=c.nextInt();
	
	if(n==m)
	{
		System.out.println("enter the elements:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				Scanner z=new Scanner(System.in);
				a[i][j]=z.nextInt();
				System.out.println(" ");
			}
		}
		System.out.println("what have you entered are visibled here:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;i<n;j++)
			{
				System.out.println(a[i][j]+ " ");
			}
			System.out.println("");
		}
		System.out.println("the upper triangle matrix::");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i<=j)
				{
					System.out.println(a[i][j]+" ");
				}
				else
				{
					System.out.println("0"+ " ");
				}
			}
		}
	}
	else
	{
		System.out.println("enter the right order please ::::");
	}
}
}
