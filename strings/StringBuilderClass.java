package strings;

public class StringBuilderClass 
{
	/*
	   1) Mutable
	   2) Has capacity >= length and capacity grows or reduces automatically
	   3) Not thread safe
	   
	 */

	public static void main(String[] args) 
	{
		StringBuilder s1 = new StringBuilder("Abhijit") ;
		System.out.println(s1);
		
		s1.append(" Puri") ;
		System.out.println(s1);
		
		s1.reverse();
		System.out.println(s1); 
		
		s1.delete(0, 2) ; 
		System.out.println(s1);

		
	}

}
