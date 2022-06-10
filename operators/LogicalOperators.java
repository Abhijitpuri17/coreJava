package operators;
import java.util.Scanner ;
public class LogicalOperators 
{

	public static void main(String[] args) 
	{
		                                       // &&  ,  ||  , !(not) 
		                                       // used to join to two conditions by and & or
		Scanner sc = new Scanner(System.in) ;
		
		// 1)DIVISIBILITY TEST OF 6
		
		System.out.println("Enter the number");
		
		int number = sc.nextInt();
		
		if (number % 2 == 0 && number % 3 == 0) System.out.println("Number is divisible by 6");
		 else System.out.println("Number is not divisible by 6");
//		
		
		  // 2) ODD OR EVEN
		
//	System.out.println("Enter the number");
//	
//	int a = sc.nextInt();
//	
//	if (!(a % 2 == 0)) System.out.println("Number is odd");
//	 else {System.out.println("Number is even");
//	
	
	}
}


