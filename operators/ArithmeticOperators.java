package operators;

public class ArithmeticOperators 
{

	public static void main(String[] args) 
	{
		// + -> Addition
		// - -> Subtraction
		// * -> Multiplication
		// / -> Division
		// %(modulo) -> Remainder
		// a++ -> increament by 1 in next line  
		//++a -> increament by 1 in same line
		
	int a = 5 ;
	int b = 15 ;
	int c = a + b ;
	int d = a - b ;
	int e = a * b ;
	int f = a / b ;
    double g = a / (double)b ;
    // for getting division of two int datatypes in decimal value
    //mention (double) before each value of these two int datatype values
    
    int  h = b % a ;
    int i = a % b ; 
    
   int j = a++ ; // yaha par a ki value 1 se badh kar 6 ho gayi 
                //par j ko a ki puraani value matlab 5 hi mili
   
   
              
    int k = ++a ; // yaha par a ki value aur 1 se badhi aur 7 ho gayi aur
                  //k ko bhi nayi value 7 hi mili
    
System.out.println(a + " " + b + " " + c + " " + d + " " + " " + e + " " + f + " " + g 
	+	" " + h + " " + i + " " + j + " " + k ) ;



     }
	
	
	
	
    
	
	
}