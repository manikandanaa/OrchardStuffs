import java.util.Scanner;


public class dsds
{
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	try
	{
		
	int a[]={3,1,2,5},temp;
	int i,j;
	for(i=0;i<4;i++)
	{
		for(j=0;j<3;j++)
		{
			if(a[j]<a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
		for(j=0;j<4;j++)
		{

			System.out.println("printing "+ a[j]);
		}
	}
	catch(Exception e)
	{
		System.out.println("goodbye ");
	}
	finally
	{
		s.close();
	}
}
}
