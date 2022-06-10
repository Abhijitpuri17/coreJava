package oOPS;


                      //// If some code repeats several times , we store this code in a method.

                      //// SYNTAX : public static datatype methodName (parameters) { body }
                      //// body me return value hona hi chahiye where value is of above data
                      /// type. Agar kuch return nahi karna toh datatype ki jagah void likhna.
                      
                      //// If number of parameters is variable , (datatype...numbers)
                      
                      /// TO CALL A METHOD : datatype variable = methodname(parameters);

public class Methods1 
{
////Example of method: 
    //// maximum of two numbers

	static int maxOf(int a , int b)
	{
	    if (a > b)
	    {
	    	return a ;
	    } else
	    {
	    	return b ;
	    }
	}
	
	static void sayHi()
	{
		System.out.println("Hello.");
        System.out.println("Good morning.");
	}
	
	public static void main(String[] args)
	{
//		int firstNumber = 34 ;
//		int secondNumber = 23 ;
//		int result = maxOf(firstNumber , secondNumber) ;
//		System.out.println(result);
		
		System.out.println(maxOf(100 , 500));
		
		sayHi() ;
		
     System.out.println(average(12 , 15, 45 , 105 , 50 , 105));
	}

	static double average(double...num) {
		double total = 0 ;
		for (double i : num)
		{
			total += i ;
		}
		
		return total/num.length ;
	}
}
