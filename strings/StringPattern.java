package strings;


public class StringPattern 
{
	
	                                                   /*     Matching symbols
	                                                     

	                                                         .          - any character
	                                                        [abc]       - exactly one of the given characters
	                                                        [abc][xyz]  - first char from 1st set and second from 2nd set
	                                                        [^abc]      - except from given set
	                                                        [a-z1-7]    - a to z or 1 to 7
	                                                        A|B         - A or B
	                                                        AB          - Exactly AB
	                                                        
	                                                        Metacharacters
	                                                        
	                                                        \d          - Digits
	                                                        \D          - Not Digits
	                                                        \s          - space
	                                                        \S          - Not Space
	                                                        \w          - alphabets or digit
	                                                        \W          - Neither alphabet nor digit
	                                                        
	                                                        Quantifiers :
	                                                                    used after matching symbols and meta-characters
	                                                                    to specify number of times a matching symbol 
	                                                                    occurs
	                                                        *    - 0 or more times
	                                                        +    - 1 or more times
	                                                        ?    - 0 or 1 time
	                                                       {X}   - X times
	                                                       {X,Y} - between X and Y times
	                                                        
	                                                        
	                                                   */ 
	
	
	public static void main(String[] args)
	{
		
         String numString = "1F" ;
         String date = "17/09/2001" ;
         
         // Binary or not
         if (numString.matches("(1|0)+")) System.out.println("Binary");
         else System.out.println("Not binary");
         
         // Hexadecimal or not
         if (numString.matches("[0-9A-F]+")) System.out.println("Hexadecimal");
         else System.out.println("Not hexadecimal");
         
         // Valid date or not
         if (date.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}")) System.out.println("Valid Date");
         else System.out.println("not valid date");
		
		/* Removing special Characters from string */
		String string  = "ab@c$d#&h123*" ;
		System.out.println(string.replaceAll("\\W", ""));
		
	}

}
