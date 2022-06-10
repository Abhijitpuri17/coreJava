package strings;

public class FunctionalitiesInString 
{

	public static void main(String[] args)
	{
		
		String name = "Abhijit" ;
//----------------------------------------------------------------------------------------------
		         //// 1)char variable = stringname.charAt(index)
		
		
//		char firstLetter = name.charAt(0) ;
//		System.out.println(firstLetter);
                      
		         //// (OR) ////
		
//		System.out.println(name.charAt(0));
		
// --------------------------------------------------------------------------------------------
		
		       //// 2) int variable = stringname.length()
		
//	int lengthOfName = name.length();
//		System.out.println(lengthOfName);
	
		          //// (OR) ///
//		System.out.println(name.length());
		
// --------------------------------------------------------------------------------------------
		
		                  //// 3) String variable = stringname.substring(begin index)
		              //// 4) String variable = stringname.substring(begin index , end index)
		
//		System.out.println(name.substring(4));
//		
//		String nickName = name.substring(0 , 4) ;                  ///// begin index letter
		                                                           ///// will be printed but
		                                                           ///// not end index letter
//		System.out.println(nickName);
		
// --------------------------------------------------------------------------------------------		
		
		                 //// 5) boolean variable = stringname.contains("character")
		
//		System.out.println(name.contains("B"));
	
// --------------------------------------------------------------------------------------------		
		
                        //// 6) boolean variable = stringname.equals(another object/variable)		
		
		////// checks the value of string whether equal or not.  Does not depend on whether 
		////// initalised by literals or new String
		
//		String name1 = new String("Abhijit") ;
//		String name2 = "Abhijit" ;
//        String name3 = "Abhi" ;
//        
//        boolean areEqual1 = name.equals(name1) ;
//        boolean areEqual2 = name.equals(name2) ;
//        boolean areEqual3= name.equals(name3) ;
//		
//		System.out.println(areEqual1 + " " +  areEqual2 + " " + areEqual3);
		
// --------------------------------------------------------------------------------------------		
				
		             //// 7) boolean variable = stringname.isEmpty()
		
//		String name4 = "" ;
//		System.out.println(name.isEmpty());
//		
//		System.out.println(name4.isEmpty());
		
// --------------------------------------------------------------------------------------------			

		              //// 8) String variable = stringname.concat(2nd String)
		      //// joins two string
		
//		String surName = " Puri" ;
//		String fullName = name.concat(surName) ;
//		System.out.println(fullName);
		
		                  //// (OR) ///
		
//		System.out.println(name.concat(" Puri"));
		
// --------------------------------------------------------------------------------------------			
		
                //// 9) String variable = stringname.replace(charOld , charNew)                  
		
//		System.out.println(name.replace("i" , "ee"));
		
//		String name2 = name.replace("i", "ee") ;
//		System.out.println(name2);
		
// --------------------------------------------------------------------------------------------		
		
                //// 10) String [] variable = stringname.split("char")	    /// splits around char
		
//		String subjects = " Mathematics , Physics , Chemistry" ;
//		
//		String allSubjects [] = subjects.split(",") ;
//		
//		for (String sub: allSubjects) {
//			System.out.print(sub);
//		}
		
// --------------------------------------------------------------------------------------------		
		
		                   //// 11) int variable = stringname.indexOf('char')    position of
		                               ///   char for first time. If not present gives -1
		                                                    
		
//		System.out.println(name.indexOf('s'));
		
// --------------------------------------------------------------------------------------------		

		          //// 12) String variable = stringname.toLowerCase()
		          //// 13) String variable = stringname.toUpperCase()
		
//		System.out.println(name.toLowerCase());
//		System.out.println(name.toUpperCase());
		
// --------------------------------------------------------------------------------------------		

		              //// 14) String variable = stringname.trim()
		/// removes spaces at start and at end
		
//		String hi = "            Hello , I am Abhijit.       " ;
//		System.out.println(hi);
//		System.out.println(hi.trim());
		
		
// --------------------------------------------------------------------------------------------		

		                    /// 15) a.compareTo(b)///
		// Gives difference between first different char of b and a
		/// (a.compareTo(b) > 0) is  true if alphabetically/lexicographically a is after b
		                                 // (small alphabets comes after Big alphabets)                              
		 
		String a = "Puri" ;
		String b = "Abhijit" ;
		System.out.println(a.compareTo(b) > 0) ;
		
	}	
		
		
	

}
