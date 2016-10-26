import java.util.Scanner;


public class Up 
{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the order of matrix:");
	int n=s.nextInt();
	int[][] a=new int[n][n];
	int i,j,c=0;
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			a[i][j]=s.nextInt();
		}
	}
	for(i=0;i<n;i++)
	{
		for(j=0;j<i;j++)
		{
				a[i][j]=0;
				c++;
		}
	}
	System.out.println(c);
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			System.out.print(a[i][j]+"\t");
		}
		System.out.println();
	}
}
}
