package strings;

import java.math.BigInteger;

public class StringsInto
{

	public static void main(String[] args) 
	
	{
		
		                                      ////// Used to store words or sentences
		
		 String name = "Abhijit" ;               //// Initalisation by literals
		 String name1 = "Abhijit" ;             //// if another variable value as Abhijit
		                                        //// it will be given from same Abhijit stored
		                                        //// in String pool area of memory
		
		
		String name2 = new String("Abhijit") ;   //// if another variable value as Abhijit it
		                                        //// will be given another Abhijit & is stored
		                                        //// in heap area , does not take same from
		                                        //// String pool area
		
		System.out.println(name == name2);

// -------------------------------------------------------------------------------------------	
		
		                                           ////// Strings are immutable i.e. if changed
		                                           ////// new string will be created and old
		                                           ////// will be retained in memory
		
// --------------------------------------------------------------------------------------------
		
		
	
		
		
		
		
	}

}
