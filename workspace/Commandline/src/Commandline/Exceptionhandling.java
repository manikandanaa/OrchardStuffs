package Commandline;

public class Exceptionhandling
{

	public static void main(String[] args)
	{
		Exceptionhandling eh=new Exceptionhandling();
		int divisor,index;
		int N;
		N=args.length;
		int data[]=new int[N-2];
			 divisor=Integer.parseInt(args[N-1]);
			 index=Integer.parseInt(args[N-2]);
			int i;
			for(i=0;i<N-2;i++)
			{
				data[i]=Integer.parseInt(args[i]);
			}
			eh.method(data,index,divisor);
	}
		@SuppressWarnings("finally")
		public int method(int[] data,int index,int divisor)
		{
			try
			{
				int result=data[index]/divisor;
				System.out.println(result);
				return result;
			}
			catch(IndexOutOfBoundsException ex)
			{
				System.out.println("out of bounds" + ex);
			}
			catch(ArithmeticException ex)
			{
				System.out.println("arthimetic exception" + ex);
			}
			finally
			{
				return divisor;
			}
	}
}
