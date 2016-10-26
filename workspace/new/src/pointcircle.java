import java.util.Scanner;


public class pointcircle 
{
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Center");
		int centre_x=s.nextInt();
		int centre_y=s.nextInt();
		System.out.println("radius");
		int radius=s.nextInt();
		int a=0, b=0;
		for(int i=0;i<3;i++)
		{
			System.out.println("points");
			int point_x=s.nextInt();
			int point_y=s.nextInt();
			circle(point_x, point_y, radius, centre_x, centre_y);
		}


	}	

	static void circle(int point_x, int point_y, int radius, int centre_x, int centre_y)
	{
		int a=(point_x-centre_x)*(point_x-centre_x);
		System.out.println("a"+a);
		int b=(point_y-centre_y)*(point_y-centre_y);
		System.out.println("b"+b);

		radius=radius*radius;
		System.out.println("radius"+radius);
		if((a+b)<radius)
			System.out.println("the given point is inside the circle");
		else
			System.out.println("the given point is outside the circle");
	}
}

