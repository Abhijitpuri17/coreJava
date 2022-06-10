package strings;

public class StrinfBufferClass 
{

	/*
	   1) Mutable
	   2) Has capacity >= length. Capacity grows or reduces automatically
	   3) Thread safe	   
	*/
	
	
	public static void main(String[] args)
	{
		
		StringBuffer s1 = new StringBuffer("Abhijit") ;
		System.out.println(s1);
		
		s1.append(" Puri") ;
		System.out.println(s1);
		
		s1.reverse();
		System.out.println(s1); 
		
		s1.delete(0, 2) ;
		System.out.println(s1);
		
		
	}
	
	
}
