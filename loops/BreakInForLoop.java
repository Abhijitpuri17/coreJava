package loops;
import java.util.Scanner ;
public class BreakInForLoop {
                                      
	                                             // for (S1 ; S2 ; S3) {
	                                             // if () {..........
	                                             //break ; }
	                                             // loop is ended after break and code after
	                                             // for loop executes
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		
		  // Keep taking input from user unti ll he enters negative number
		
		System.out.println("Keep entering the numbers");
		
		for ( ; ; ) {
		int a = sc.nextInt();
		if ( a < 0) {
			break ;
		}
		}
		System.out.println("Program is ended");
		
	}

}
