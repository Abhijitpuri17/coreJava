package strings;
import java.util.Scanner ;
public class ReverseStringWordByWord 
{
	static String reverseWordByWord(String s)
  {
	    String ans = "" ;
	    int i = s.length()-1 ;
	    while (i >= 0)
     {
	    while (i >= 0 && s.charAt(i) == ' ') i-- ;
	    int j = i ;
	    while (i >= 0 && s.charAt(i) != ' ') i-- ;
	    if (s.isEmpty())
	    {
	    	ans = ans.concat(s.substring(i+1 , j+1)) ;
	    } 
	    else
	    {
	        ans = ans.concat(" " + s.substring(i+1 , j+1)) ;
	    }
      }
	    return ans ;
   }
	
	
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in) ;
		String s = sc.nextLine();
		System.out.println(reverseWordByWord(s));
	}

}
