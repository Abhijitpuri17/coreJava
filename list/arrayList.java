package list;
import java.util.* ;

public class arrayList
{

	public static void main(String[] args) 
	{
	 List myNumbers = new ArrayList() ;
		myNumbers.add(5) ;                    // adds 5 at index 0
		myNumbers.add(0 , 10) ;                   // adds 10 at index 0 , rest all elements will be right 
		                                          //shifted
		
	//myNumbers.add(3 , 50) ;                     // runtime error aayegi as index 2 pe kuch define nahi
		                                          // kiya aur 3 pe kiya
		
		myNumbers.add(2 , 500) ;
		myNumbers.add(3 , "Abhi") ;
		
		
		myNumbers.remove(2) ;                     // removes element at index 2 and all right elements are
		                                          // shifted to left by one place
		
		
	System.out.println(myNumbers);          // prints all elements in form of array
	
	System.out.println(myNumbers.get(1));   // prints element at index 1

	
       List<String> countries = new ArrayList<>() ;
	 countries.add("India") ;
	 countries.add(0 , "America") ;
	 System.out.println(countries);
	 
	 List<Integer> primeNum = new ArrayList<>() ;
	 primeNum.add(2) ;
	 primeNum.add(5) ;
	 System.out.println(primeNum);
	 
	 Map country = new HashMap() ;
	 country.put(0, "India") ;
	 country.put(1, "America") ;
	 country.put(2 , 1) ;
	 System.out.println(country);
	 System.out.println(country.get(0));
	 
	}

}
