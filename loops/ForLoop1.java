package loops;
import java.util.Scanner ;
public class ForLoop1 {

	public static void main(String[] args) {
		 
		                                    // for (S1 ; S2 ; S3 ) {
		                                    // output when entered in the loop ;
		                                    // }
	Scanner sc = new Scanner(System.in) ;
	
	      // Writing the table of any number
	
//	System.out.println("Enter the number whose table you want");
//	
//	int a = sc.nextInt() ;
//	
//	for (int i = 1 ; i <= 10 ; i+= 1) {
//		System.out.println(a * i);
//	}
	
	
	         // finding factorial of some number
	
	int factorial = 1 ;
	
	System.out.println("Enter the number whose factorial you want");
	
	int n = sc.nextInt();
	
	for (int i = 1 ; i <= n ; i++) {
		factorial = factorial * i ;
	}
		
	System.out.println("factorial of " + n + " is " + factorial);
	}
	
	
	}


