package io;

public class RandomAccessFile {
	
	public static void main(String[] args) throws Exception
	{
		
		java.io.RandomAccessFile raf = new java.io.RandomAccessFile("path", "rw") ;
		// Now we can read as well as write using raf
		raf.write('A');
		raf.read();
		
	}

}
