package reverse;

import java.io.*;


public class reverseString 
{
    public static void main(String[] args) 
    {
	   String input="";
	   System.out.println("Enter the input string");
	   try
	   {
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	       input = br.readLine();
	       char[] c= input.toCharArray();
	       for (int i=c.length-1;i>=0;i--)
	       {
	       System.out.print(c[i]);
	       }
	   }
	   catch (IOException e) 
	   {
	            e.printStackTrace();
	   }
	}
}
