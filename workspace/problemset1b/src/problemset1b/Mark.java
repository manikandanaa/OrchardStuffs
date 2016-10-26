package problemset1b;
import java.util.Scanner;

public class Mark 
{
	String name[];
	int roll_no[]; 
	int total;
	float perc;
	float avg;
	int n;
	int mark[][]; 
	
	public int getdata()
	{
		Scanner m=new Scanner(System.in);
		System.out.println("enter how many students are there::");
		n=m.nextInt();
		name=new String[n];
		roll_no=new int[n];
		mark=new int[n][3];
		
		for(int i=0;i<n;i++)
		{
		System.out.println("enter the student name:");
		name[i]=m.next();
		System.out.println("enter the roll no of the student:");
		roll_no[i]=m.nextInt();
		/*System.out.println("enter the no of subjects::");
		sub=m.nextInt();
		for(int k=1;k<=sub;k++)
		{
		System.out.println("the subjects are:");
		}*/
		for(int j=0;j<3;j++)
			{
				System.out.println("enter the marks:");
				mark[i][j]=m.nextInt();		
			}
		
		
		//mark[n]=m.nextInt();
		
		//mark=mark1+mark2+mark3;
		}
		return n;
	}
	public void showdata(int n)
	{
		for(int i=0;i<n;i++)
		{
		for(int j=0;j<3;j++)
		{		
		total=((mark[i][j])/300)*100;
		}
		}
		perc=(total*100)/200;
		System.out.println("NAME= "+ name);
		System.out.println("ROLL NO= "+ roll_no);
		System.out.println("TOTAL MARKS= "+ total);
		System.out.println("PERCENTAGE= "+ perc + "%");
		System.out.println("AVERAGE= "+ avg);
		}
}
class student
{

public static void main(String args[]) 
{
	Mark s=new Mark();
	s.showdata(s.getdata());
}
}


