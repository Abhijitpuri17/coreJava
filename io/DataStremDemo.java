package io;

import java.io.*;

public class DataStremDemo {

	public static void main(String[] args) throws Exception 
	{
//		FileOutputStream fos = new FileOutputStream("C:/myJava/Student3.txt") ;
//		DataOutputStream dos = new DataOutputStream(fos) ;
//		
//		Student s1 = new Student();
//		s1.dept = "CSE" ;
//		s1.name = "Abhijit" ;
//		s1.roll_no = 82 ;
//		
//		dos.writeUTF(s1.name);
//		dos.writeInt(s1.roll_no);
//		dos.writeUTF(s1.dept);
//		
//		fos.close();
		
		FileInputStream fis = new FileInputStream("C:/myJava/Student3.txt") ;
	DataInputStream dis = new DataInputStream(fis) ;
		
		Student s2 = new Student();
		s2.name = dis.readUTF();
		s2.roll_no = dis.readInt() ;
		s2.dept = dis.readUTF();
		
		System.out.println("name : " + s2.name);
		System.out.println("roll no : " + s2.roll_no);
		System.out.println("dept : " + s2.dept);
		dis.close();
		fis.close();
 
	}
	

}
class Student{
	int roll_no ;
	String name ;
	String dept ;
}