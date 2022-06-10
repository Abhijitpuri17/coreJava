package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CopyingFile
{

	public static void main(String[] args) 
	{
		try {
			// InputStream to read Existing file
			FileInputStream fis = new FileInputStream("C:/myJava/source_file.txt") ;
			
			byte [] bytes = new byte[fis.available()] ;
			
			// Reading data from file and storing in byte array
			fis.read(bytes) ;
			String res = new String(bytes) ;
			
			// Changing data to lower case
			res = res.toLowerCase();
			bytes = res.getBytes();
			fis.close();
			
			// OutputStream to write in a new file
			FileOutputStream fos = new FileOutputStream("C:/myJava/copied_file.txt") ;
			
			// writing to the new file
			fos.write(bytes);
			fos.close();	
			
			
			System.out.println("Success");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed");
		}

	}

}
