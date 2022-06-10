package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedStream 
{

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("C:/myJava/test.txt") ;
		BufferedInputStream bis = new BufferedInputStream(fis) ;
		
//		int x ;
//		while ((x = bis.read()) != -1) System.out.print((char)x);
		
		// Mark is supported for bufferedIS

		System.out.println((char)bis.read());
		System.out.println((char)bis.read());
		System.out.println((char)bis.read());
		
		bis.mark(10);
		
		System.out.println((char)bis.read());
		System.out.println((char)bis.read());
		
		// bis again starts from where we marked
		bis.reset();
		
		System.out.println((char)bis.read());
		System.out.println((char)bis.read());
		
		
		
		// BufferedReader acts same. We can use readLine using BufferedReader
		
		
	}

}
