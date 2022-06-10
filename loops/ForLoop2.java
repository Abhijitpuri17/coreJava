package loops;
import java.util.Scanner ;
public class ForLoop2 {

	public static void main(String[] args) {
		
		    // Fibbonacci series 0 , 1 , 1 , 2 , 3 , 5 , 8 , ......
		    // each term is obtained by adding previous two terms
	
	Scanner sc = new Scanner(System.in) ;
	
	int a = 0 ;
	int b = 1 ;
	
	System.out.println("Enter the number of terms you want to print in fibbonacci series");
	int n = sc.nextInt();
	
	System.out.print(a + " " + b + " ");
	for (int i = 1 ; i <= n-2 ; i++) {
		int c = a + b ;
		System.out.print(c + " ");
		a = b ;
		b = c ;
	}
//	
//	
//	          // x raised to y 
//	
//	System.out.println("Enter the number (base)");
//	int x = sc.nextInt();
//	
//	System.out.println("Enter the power (to which you want raise the number)");
//	int y = sc.nextInt();
//	
//	long answer = 1 ;
//	
//	for (int i = 1 ; i <= y ; i++) {
//		answer *= x ;
//	}
//	System.out.println("The answer is " + answer);
//	
	
	
	         // prime number or not
	
//	System.out.println("Enter the number");
//	int p = sc.nextInt();
//	
//	boolean isNumberPrime = true;
//	
//	for (int i = 2 ; i * i <= p ; i++) {               // if number is not prime then it will have
//		                                          // at least one factor in (1 , root p ). So we
//		                                          // can run the loop for i <= root p 
//		if (p % i == 0) {
//			isNumberPrime = false ;
//			break ;
//		}
//		}
//	
//	if (p == 1) {System.out.println(p + " is neither prime nor composite");
//	} else {
//		if (isNumberPrime == true) { System.out.println(p + " is prime");
//	} else {System.out.println(p + " is composite");
//	}
//	}
	
	
	}
	
	}
	
	
	
	
	


