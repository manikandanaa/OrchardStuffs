package compatabilitiy;

import java.util.Scanner;

public class Countoccur
{
	public static void main(String args[])
	{
		int length,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String input=sc.nextLine();
		for(int i=0;i<input.length();i++)
		{
			for(int j=0;j<input.length();j++)
			{
				if(input.charAt(i)==input.charAt(j))
					count++;
			}
			System.out.println(input.charAt(i)+" "+count);
			count=0;
		}
		
	}

}
