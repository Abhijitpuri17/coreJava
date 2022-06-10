package io;

import java.io.* ;


public class PrintStreamDemo 
{

	public static void main(String[] args) throws Exception 
	{
//		FileOutputStream fos = new FileOutputStream("C:/myJava/Student1.txt") ;
//		PrintStream ps = new PrintStream(fos) ;
//		
//		Student s1 = new Student();
//		s1.dept = "CSE" ;
//		s1.name = "Abhijit" ;
//		s1.roll_no = 82 ;
//		
//		ps.println(s1.name);
//		ps.println(s1.roll_no);
//		ps.println(s1.dept);
//		
//		ps.close();
//		fos.close();
		
		FileInputStream fis = new FileInputStream("C:/myJava/Student1.txt") ;
		BufferedReader br = new BufferedReader(new InputStreamReader(fis)) ;
		
		Student s2 = new Student();
		s2.name = br.readLine();
		s2.roll_no = Integer.parseInt(br.readLine()) ;
		s2.dept = br.readLine();
		
		System.out.println("name : " + s2.name);
		System.out.println("roll no : " + s2.roll_no);
		System.out.println("dept : " + s2.dept);
		br.close();
		fis.close();
 
	}
	
	private static class Student{
		int roll_no ;
		String name ;
		String dept ;
	}
}
