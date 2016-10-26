package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileData 
{
public static void main(String[] args)
{
	try
	{
		FileInputStream fin=null;
		FileOutputStream fout=null;
		
		File in=new File("D:\\fhan.txt");
		File out=new File("D:\\fhan2.txt");
		
		fin=new FileInputStream(in);
		fout=new FileOutputStream(out);
		
		byte buf[]=new byte[1024];
		
		int length;
		while((length=fin.read(buf))>0)
		{
			fout.write(buf, 0, length);
		}
		fin.close();
		fout.close();
		
		System.out.println("contents are copied successfully");
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
}
}
