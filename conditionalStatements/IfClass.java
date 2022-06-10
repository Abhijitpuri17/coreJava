package conditionalStatements;
import java.util.Scanner ;
public class IfClass 
{

	public static void main(String[] args) 
	{
		                                     // if (condition) { code to execute}
		
		Scanner sc = new Scanner(System.in) ;
		 System.out.println(" Enter your age");
		int age = sc.nextInt();
		if (age >= 18) 
		{
			System.out.println("You can vote");
		}
	}

}


