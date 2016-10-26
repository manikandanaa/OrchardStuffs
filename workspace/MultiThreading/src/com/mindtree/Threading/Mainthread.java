package com.mindtree.Threading;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Mainthread
{
public static void main(String[] args)
{
	BufferedWriter bw=null;
	try
	{
		File file =new File("Untitled 1.txt");
		if(!file.exists())
		{
			file.createNewFile();
		}
		FileWriter fw=new FileWriter(file.getAbsoluteFile());
		bw=new BufferedWriter(fw);
		bw.write("enter the number only");
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	finally
	{
		try
		{
			bw.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}

}
