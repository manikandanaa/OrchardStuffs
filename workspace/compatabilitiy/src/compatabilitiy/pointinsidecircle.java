package compatabilitiy;

import java.util.Scanner;

public class pointinsidecircle {

	public static void main(String args[])
	{
		
	int i,a,b;
	int center_x=5;
	int center_y=4;
	int radius=5;
	Scanner s= new Scanner(System.in);
	for(i=0;i<3;i++)
	{
		int point_x=s.nextInt();
		int point_y=s.nextInt();
		a=(point_x-center_x)*(point_x-center_x);
		b=(point_y-center_y)*(point_y-center_y);
		radius=radius*radius;
		if((a+b)<radius)
			System.out.println("the given point is inside the circle");
		else
			System.out.println("the given point is outside the circle");
	}
	}
}
