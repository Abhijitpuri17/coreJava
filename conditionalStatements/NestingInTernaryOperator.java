package conditionalStatements;
import java.util.Scanner ;
public class NestingInTernaryOperator {

	public static void main(String[] args) {
		
		  // To find greatest of the three numbers
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
	    int b = sc.nextInt();
	    System.out.println("Enter the third number");
	    int c = sc.nextInt();
	    int x = a > b ? a > c ? a : c : b > c ? b : c ;
	    System.out.println("The greatest of the three numbers is " + x);
	}

}
