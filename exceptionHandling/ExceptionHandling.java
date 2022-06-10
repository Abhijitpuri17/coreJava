package exceptionHandling;

import java.util.ArrayDeque;

public class ExceptionHandling
{          
	        // TO HANDLE RUN-TIME ERRORS
	        /*
	          if a run time error occurs program crashes. To solve this
	          use try catch . if runtime error occurs, catch block gets executed
	          and rest program continues
	          
	          If you use two catch blocks for exceptions - one sub exception and other super
	          then use sub first otherwise shadowing will occur
	         */

	public static void main(String[] args) 
	{
		// example : Division by zero will give run-time error : ARITHMETIC EXCEPTION
		// if i >= arr.length , ARRAYINDEXOUTOFBOUND EXCEPTION
		
		int[] arr = {1,0,2,3,4 } ;

        ArrayDeque<Integer> dq = new ArrayDeque<>() ;

		int a = 5 ;
		int b = 0;
		
		try {
		int c = a/b ;
		int d = arr[5] ;
		System.out.println(c);
		System.out.println(d);
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e) ;
		} finally {
		  // CODE IN FINALLY BLOCK ALWAYS EXECUTES WHETHER EXCEPTION IS FOUND OR NOT
		   System.out.println("Completed ");
		}

	}

}

class MyException extends Exception
{

}



