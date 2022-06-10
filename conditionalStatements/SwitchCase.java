package conditionalStatements;
import java.util.Scanner ;

public class SwitchCase {

	public static void main(String[] args) {
		
		                                               // switch (variable)
		                                               // case 1 :
		                                               //{code when value of variable is 1}
		                                               // break ;
		                                               // case 2 :
		                                               // 
		                                               // default :
		                                               // { code when none of the above case}
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("Enter the first number");
		float a = sc.nextFloat();
		
		System.out.println("Enter the operator");
		 sc.nextLine() ;
		char operator = sc.nextLine().charAt(0) ;
		
		System.out.println("Enter the second number");
		float b = sc.nextFloat();
		
		switch (operator)
		{ case '+' :
			System.out.println("The result is " + (a + b));
			break ;
		case '-' :
		System.out.println("The result is " + (a - b));
		break ;
		case '*' :
			System.out.println("The result is " + (a * b));
		break ;
		case '/' :
			System.out.println("The result is " + (a / b));
		break ;
		default :
			System.out.println("Invalid operation");
		break ;
		}
		
		sc.close();
	}
}
//		
//		
//		float result = 0 ;
//		switch (operator)
//		{ case '+' :
//			result = a + b ;
//			break ;
//		case '-' :
//			result = a - b ;
//			break ;
//		case '*' :
//			result = a * b ;
//			break ;
//		case '/' :
//			result = a / b ;
//			break ;
//			default :
//				System.out.println("Invalid operation");
//				break ;
//		}
//				System.out.println("The result is " + result);
//				
//
               		
//		System.out.println("Submit the rating (1, 2, 3, 4 or 5)");
//		int rating = sc.nextInt();
//		
//		switch (rating) {
//		case 1 :
//		case 2 :
//		{System.out.println("Rating is bad");
//		} break ;
//		case 3 :
//		{System.out.println("Rating is average") ;
//		} break ;
//		case 4 :
//		case 5 :
//		{System.out.println("Rating is good");
//		} break ;
//		}
		
		
		
		
		
		
		
		
		
		
	
		
	


