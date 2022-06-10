package operators;

public class BitwiseOperators 
{

	public static void main(String[] args)
	{
		
		// & -> and
		// | -> or 
		// ^ -> xor (same as in logic gates)             
							                                                      /* 1) xor of two nums is less than max
							                                                         2) a ^ 0 = a
							                                                         3) a ^ a = 0 */
		
		// >> a -> right shift a times
		           // 1) number is divided by 2 and quotient is given as output
		           // when number is right shifted 1 time
		           // 2) write number in binary system, delete last digit, shift
		              // all the rest digits to right and write 0 at the first place
		
		// << a -> left shift a times
		
		
		
		int a = 5 ;    // 101      
		int b = 6 ;    // 110
		int c = a & b ;// 100                    4
		int d = a | b ;// 111                    7
		int e = a >> 2 ; // 101 -> 010 -> 001    1
		int f = b << 3 ;
		
		System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f);
		
		int x = 10 , y = 12 ;       // 1010  1100
		int z = x ^ y ;
		System.out.println(z);
		

	}

}
