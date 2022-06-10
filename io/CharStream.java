package io;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class CharStream 
{

	public static void main(String[] args) throws IOException 
	{
		char arr[] = {'a', 'b', 'c', 'd', 'e'};
		CharArrayReader cr = new CharArrayReader(arr);
		int x ;
		while ((x = cr.read()) != -1) System.out.print((char)x);
		
		CharArrayWriter cw = new CharArrayWriter();
		cw.write('A');
		cw.write('B');
		System.out.println(cw.toString());

	}

}
