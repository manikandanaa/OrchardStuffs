package compatabilitiy;

import java.util.Scanner;

public class primenumber {
	

	public static void main(String args[])
	{
		int n,flag=0,count=2,answer=0,temp=0;
		long  sum=5;
		try
		{
		Scanner	s = new Scanner(System.in);
			do
			{
			System.out.println("enter a valid input no to find the sum of prime: ");
			n=s.nextInt();
			}while(n<5);
			for(int i=4;i<n;i++)
			{
				for(int j=2;j<=i/2;j++)
				{
					if(i%j==0)
					{
						flag=1;
						break;
					}
				}
				if(flag!=1)
				{
					sum=sum+i;
					count++;
				}
				flag=0;
				if(count==10001 && temp==0)
				{
					answer=i;
					temp=1;
				}
			}
			System.out.println("the sum of prime nos are:"+ sum);
			System.out.println("the 10001 prime number is: "+ answer);
		}
		catch(Exception e)
		{
			System.out.println("come again later");
		}
	}

}
