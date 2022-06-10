package io;
import java.io.*;
import java.util.Arrays;

public class FileClass
{

	public static void main(String[] args) throws IOException 
	{
		// Directory or file can be given to File
	    File file = new File("C:/myJava");
		System.out.println(file.isDirectory());
		
		// All files in file directory
		String[] files = file.list();
		for (String string : files) System.out.println(string);
	
		File f1 = new File("C:/myJava/test2.txt") ;

		//f1.setWritable(true) ;
		FileOutputStream fos = new FileOutputStream(f1) ;
		fos.write("Abhijit".getBytes());

		System.out.println(f1.lastModified());
	}

} 
