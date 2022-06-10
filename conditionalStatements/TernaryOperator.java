package conditionalStatements;
import java.util.Scanner ;
public class TernaryOperator {

	public static void main(String[] args) {
	                                              // shortcut for if else
		                                        // datatype a = condition ? value of
		                                        // output a when condition is true : value
		                                       // of output a when condition is false
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		double x = sc.nextDouble() ;
		
		String s = (x % 2) == 0 ? "Number is even" : "Number is odd"  ;
		
		System.out.println(s);
		
		sc.close();
		
		
		
		
		
	}

}
