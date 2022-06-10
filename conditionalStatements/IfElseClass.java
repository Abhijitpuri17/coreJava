package conditionalStatements;
import java.util.Scanner ;
public class IfElseClass 
{

	public static void main(String[] args) 
	{
		                                        
		                                       // if (condition) { code when condition
		                                       // is true} else { code when condition 
		                                       // is false }
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter your age");
			
	   int age = sc.nextInt() ;
	   if (age >= 18)
	   { 
		   System.out.println(" You can vote");
	   }
	   
	   else
	   {
		   System.out.println("You can not vote");
	   }
   

	}

}
