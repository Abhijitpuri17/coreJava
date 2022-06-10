package loops;
import java.util.Scanner ;
public class ForLoop3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		
		    // sum of series 1 + 1/2 + 1/3 + .... + 1/n
		
//		System.out.println("Enter the number of terms you want to add (n) ");
//		int n = sc.nextInt() ;
//		
//		float result = 0 ;
//		
//		for (float i = 1 ; i <= n ; i++) {
//			result += (1/i) ;
//		}
//		System.out.println("The sum of " + n + " terms in the series is " + result);

		
		     // sum of series 1 - 1/2 + 1/3 - 1/4 ....
		
		
		System.out.println("Enter the number of terms you want to add (n) ");
		int n = sc.nextInt() ;
		
		float result = 0 ;
		
		for (float i = 1 ; i <= n ; i++) {
			if (i % 2 == 0) {
				result -= 1/i ;
			} else {
				result += 1/i ;
			}
		} System.out.println("Answer is " + result );
		
		
		
		
		
		
		
		
		
}
}