package numberSystems;
import java.util.Scanner ;
public class BinaryToDecimal 
{

	static int binaryToDecimal(int n)
	{
		int ans = 0 ;
		int x = 1 ;
		while (n > 0) 
		{
			int lastDigit = n % 10 ;
			ans += lastDigit*x ;
			n /= 10 ;
			x *= 2 ;
		}
		return ans ;
	 }
   public static void main(String[] args) 
   {
	   	Scanner sc = new Scanner (System.in) ;
	   	System.out.println("Enter the binary number : ");
	   	int n = sc.nextInt();
	   	System.out.print("The value of binary number " + n + " in decimal number system is " + binaryToDecimal(n));
	   	sc.close();
   }

}
