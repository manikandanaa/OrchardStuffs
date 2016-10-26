package str;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Files {
	public static void main(String[] args) throws IOException
	{
		FileOutputStream o=new FileOutputStream("D:/stream/stre.txt");
		Scanner s= new Scanner(System.in);
		String j="dfgh";
		o.write(j.getBytes());
		o.close();
		FileInputStream i=new FileInputStream("D:/stream/stre.txt");
		byte[] c=new byte[i.available()];
		i.read(c);
//		j.new String(c);
		System.out.println(j);
		i.close();
	}
}
