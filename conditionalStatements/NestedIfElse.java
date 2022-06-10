package conditionalStatements;
import java.util.Scanner ;
public class NestedIfElse {

	public static void main(String[] args) {
		
		                                      // if (condition1) {if (condition2) 
		                                     // {output when C2 is true } else {output when
		                                     // C2 is false but C1 is true} else { output when
		                                     // C1 is false }
	Scanner sc = new Scanner(System.in) ;
	System.out.println("Enter your boards percentage");
	float boardsPercentage = sc.nextFloat() ;
	System.out.println("Enter your JEE-main percentile");
	double jeeMainPercentile = sc.nextDouble();
	System.out.println("Enter your JEE-Advance score (if you have not given JEE-Advance"
			+ ", enter your score as 0) " ) ;
	int jeeAdvanceScore = sc.nextInt() ;
   
	if (boardsPercentage >= 75 && boardsPercentage <= 100) {
		
		if (jeeAdvanceScore >= 115 && jeeAdvanceScore <= 372)
		{System.out.println("You will get IIT") ;
		}
		else if (jeeMainPercentile >= 98 && jeeMainPercentile <= 100)
		{System.out.println("You will get NIT");
		}
		else {System.out.println("You will not get any IIT or NIT");
		}	
	}
	
	else { System.out.println("You will not get any IIT or NIT");
		}
		
		
		}
	
	}

