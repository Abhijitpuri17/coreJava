package io;
import java.io.*;

public class ObjectIO 
{

	public static void main(String[] args) throws Exception 
	{
//		FileOutputStream fos = new FileOutputStream("C:/myJava/test_student.txt") ;
//		ObjectOutputStream oos = new ObjectOutputStream(fos) ;
//		Student s = new Student("Abhijit", 82, "CSE");
//		oos.writeObject(s);
//		oos.close();
//		fos.close();

		
		
		FileInputStream fis = new FileInputStream("C:/myJava/test_student.txt") ;
		ObjectInputStream ois = new ObjectInputStream(fis) ;
		Student s1 = (Student) ois.readObject();
		ois.close();
		fis.close();
		
		
		System.out.println(s1);

	}
	
	private static class Student implements Serializable
	{
		String name;
		int roll_no ;
		String dept ;
		
		
		public Student()
		{
			
		}
		
		public Student(String name, int roll_no, String dept)
		{
			this.name = name ;
			this.roll_no = roll_no;
			this.dept = dept ;
		}
		
		@Override
		public String toString() {
			String s = "Name : "+ name + "\nRoll no. : " + roll_no + "\nDept : " + dept ;
			return s ;
		}
	}

}
