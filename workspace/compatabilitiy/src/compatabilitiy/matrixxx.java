package compatabilitiy;

import java.util.Scanner;

public class matrixxx 
{
public static void main(String args[])
{
	try
	{
		int o,i,j,mata[][],matb[][],add[][],sub[][],mul[][];
		Scanner sc=new Scanner(System.in);
		do
		{
		System.out.println("enter the correct order:");
		o=sc.nextInt();
		}while(o<2);
		
		mata=new int[o][o];
		matb=new int[o][o];
		add=new int[o][o];
		sub=new int[o][o];
		mul=new int[o][o];
		System.out.println("first matrix:");
		for(i=0;i<o;i++)
		{
			for(j=0;j<o;j++)
			{
				mata[i][j]=sc.nextInt();
			}
		}
		System.out.println("second matrix:");
		for(i=0;i<o;i++)
		{
			for(j=0;j<o;j++)
			{
				matb[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<o;i++)
		{
			for(j=0;j<o;j++)
			{
				
				System.out.println(mata[i][j]);
			}
			System.out.println("\n");
		}
		for(i=0;i<o;i++)
		{
			for(j=0;j<o;j++)
			{
				System.out.println(matb[i][j]);
			}
			System.out.println("\n");
		}
		
		for(i=0;i<o;i++)
		{
			for(j=0;j<o;j++)
			{
				add[i][j]=mata[i][j]+matb[i][j];
				System.out.println("the addtion of matrix:"+ add[i][j]);
			}
		}
		
		for(i=0;i<o;i++)
		{
			for(j=0;j<o;j++)
			{
				sub[i][j]=mata[i][j]-matb[i][j];
				System.out.println("the subtration of matrix:"+ sub[i][j]);
			}
		}
		
		
		for(i=0;i<o;i++)
		{
			for(j=0;j<o;j++)
			{
		mul[i][j]=mata[i][j]*matb[i][j];
		System.out.println( mul[i][j]+"\t");
			}
			System.out.println("\n"); 
		}
	}
	catch(Exception e)
	{
		System.out.println("bubey");
	}
}
}
