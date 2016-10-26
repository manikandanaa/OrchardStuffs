package compatabilitiy;

import java.util.Scanner;

public class middlename {
	public static void main(String args[])
	{
		try
		{
			int c=0;
		String fullname;
		Scanner sc=new Scanner(System.in);
		do
		{
		fullname=sc.nextLine();
		}while(fullname.equals(" "));
		
		fullname=fullname.trim();
		
		for(int i=0;i<fullname.length();i++)
		{
			if(fullname.charAt(i)==' ')
				c++;
		}
		int firstpart=fullname.indexOf(" ");
		int lastpart=fullname.lastIndexOf(" ");
		if(c>=2)
		{
		String middlename=fullname.substring(firstpart, lastpart);
		System.out.println("middlename:"+ middlename);
		}
		else
			System.out.println("middlename needed so enter again");
		}
		catch(Exception e)
		{
			System.out.println("no name");
		}
	}

}
