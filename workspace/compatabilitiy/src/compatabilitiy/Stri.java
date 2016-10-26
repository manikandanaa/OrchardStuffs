package compatabilitiy;

import java.util.Scanner;

public class Stri 
{
	public static void main(String args[])
	{
		try
		{
			int c=0,n=0;
			String lastname="";
			
		String fullname;
		Scanner sc=new Scanner(System.in);
		do
		{
		fullname=sc.nextLine();
		}while(fullname.equals(" ") );
		
		fullname=fullname.trim();
		
		for(int i=0;i<fullname.length();i++)
		{
			if(fullname.charAt(i)==' ')
				c++;
		}
		int firstpart=fullname.indexOf(" ");
		int lastpart=fullname.lastIndexOf(" ");
		if(c>=1)
		{
			lastname=fullname.substring(lastpart);
		System.out.println("lastname:"+ lastname);
		}
		char[] ch=new char[lastname.length()];
		while(n<lastname.length())
		{
			if(lastname.charAt(n)=='a' ||lastname.charAt(n)=='e'||lastname.charAt(n)=='i'||lastname.charAt(n)=='o'||lastname.charAt(n)=='u')
				//ch[n]=(char)((int) (lastname.charAt(n))+1);
			{
				switch(lastname.charAt(n))
				{
				case 'a':
					ch[n]='e';
					break;
				case 'e':
					ch[n]='i';
					break;
				case 'i':
					ch[n]='o';
					break;
				case 'o':
					ch[n]='u';
					break;
				case 'u':
					ch[n]='a';
					break;
				}
			}
			else
				ch[n]=(char)((int) (lastname.charAt(n))-1);
			n++;
		}
		String str1=String.valueOf(ch);
		System.out.println(str1);
		
		System.out.println(str1.toUpperCase());
			
		}
		catch(Exception e)
		{
			System.out.println("no name");
		}
	}
}
