package loops;
import java.util.Scanner ;
public class WhileLoop {

	public static void main(String[] args) {
		
		                                      /// initalisation ;
		                                      /// while (condition) {output} ;
		                                      /// reinitalisation
		
		      //// Find sum of all digits of a number
		
		Scanner sc = new Scanner(System.in) ;
		
//		System.out.println("Enter the number");
//		int n = sc.nextInt();
//		int temp = n ;
//		int sum = 0 ;
//		
//		while (temp > 0) {
//		  int lastDigit = temp % 10 ;
//		  temp /= 10 ;
//		  sum += lastDigit ;
//		}
//		System.out.println("Sum of all digits of " + n + " is " + sum);
//		

	
	
	                  //// Is the number palindrome or not ?
		
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		int temp = n ;
		int reversedNumber = 0 ;
		
		while (temp > 0) {
			int lastDigit = temp % 10 ;
			temp /= 10 ;
			
			reversedNumber = reversedNumber * 10 + lastDigit ;
		}
		System.out.println("Reversed number is " + reversedNumber);
	if (reversedNumber == n) {System.out.println(n + " is a palindrome");
	} else { System.out.println(n + " is not a palindrome");
	}
	

	
	}

}
