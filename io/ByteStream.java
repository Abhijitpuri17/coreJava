package io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream 
{

	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
	   byte[] bytes = {'a' , 'b' , 'c' , 'd' , 'e'} ;
	   ByteArrayInputStream bis = new ByteArrayInputStream(bytes) ;
	   
	   int x ;
	   while ((x = bis.read()) != -1) {
		   System.out.print((char)x);
	   }
	   
	   
	   ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
	   bos.write('A');
	   bos.write('B');
	   bos.write('C');	   
	   
	   byte[] bytes2 = bos.toByteArray();
	   for (int c : bytes2) System.out.print((char)c);
	   
	   bos.writeTo(new FileOutputStream("C:/myJava/test.txt"));
	   

	}

}
