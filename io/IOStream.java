package io;

import java.io.*;

public class IOStream 
{

	public static void main(String[] args) 
	{
		try {
			FileOutputStream fos = new FileOutputStream("C:/java/oOPS.Test.txt") ;
			String s = "Demo for File Input/Output Stream" ;
			
			fos.write(s.getBytes()) ;
			
			fos.close() ;
			
			FileInputStream fis = new FileInputStream("C:/java/oOPS.Test.txt") ;
			byte[] bytes = new byte[fis.available()] ;
			
			fis.read(bytes) ;
			
			String s1 = new String(bytes) ;
		
			System.out.println(s1) ;
			
			fis.close() ;
			
		} catch (Exception e) {
			System.out.println("Failed");
			e.printStackTrace();
		}

	}

}
 