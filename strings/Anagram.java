package strings;

public class Anagram {

	public static void main(String[] args) {
		
		                                       
	   
	   
	   String a = "silent" ;
		String b = "listen" ;
		
		boolean isAnagram = true ;
		
		int al [] = new int [57] ;
		
		for (char c : a.toCharArray())                   
		{                                                 
			int index = (int) (c-'A') ;

			al[index]++ ;
		}
		
       for (char c : b.toCharArray()) 
       {
			
			int index = (int) (c -'A') ;

			al[index]-- ;

	   }
		
		for (int i = 0 ; i < 57 ; i++) 
		{
			if (al[i] != 0) 
			{
				isAnagram = false ;
				break ;
			}
		}
		
	   if (isAnagram) {
		   System.out.println(a + " & " + b + " are anagrams");
	   } else {
		   System.out.println(a + " & " + b + " are not anagrams");
	   } 
		
		
	}
	
	
}
