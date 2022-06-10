package conditionalStatements;
import java.util.Scanner ;
public class IfElseIfclass {

	public static void main(String[] args) {
		                                     
		                                      // if (condition1) { output when condition1
		                                      // is true } else if (condition2) { output 
		                                      // when condition2 is true } else { output
		                                      //when all condition are false }
	Scanner sc = new Scanner(System.in) ;
	  
	System.out.println(" Enter your marks in MHT-CET");
	
	int marks = sc.nextInt();
	
	if (marks >= 170 && marks <= 200) { System.out.println("most probably "
			+ "your percentile will be grater than 99.5");
	} else if (marks >= 155 && marks < 170) { System.out.println("most probably"
			+ "your percentile will be between 99 to 99.5");
	} else if (marks >= 145 && marks < 155) { System.out.println("most probably"
			+ "your percentile will be between 98 to 99") ;
	}else if (marks >= 135 && marks < 145) { System.out.println("most probably"
			+ "your percentile will be between 96.5 to 98" );
	} else if (marks >= 120 && marks < 135) { System.out.println("most probably"
			+ " your percentile will be between 94 to 96.5") ;
	} else if (marks < 120 && marks >= 0) { System.out.println("most probably your"
			+ " percentile will be less then 94" ) ;
	} else { System.out.println("Invalid marks entered");
	}
	
		
	}
	
	}
	  
	
	
	


