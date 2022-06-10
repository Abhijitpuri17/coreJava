package numberSystems;
import java.util.Scanner;
public class DecimalToOctal
{

	static int decimalToOctal(int n)
	{
		int ans  = 0 ;
		int x = 1;
		while (n > 0)
		{
			int lastDigit = n % 8 ;
			ans += lastDigit*x ;
			x *= 10 ;
			n /= 8 ;
		}
		return ans ;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in) ;
		System.out.println("Enter the decimal number :");
		int n  = sc.nextInt() ;
		System.out.println("Value of " + n + " in octal system is " + decimalToOctal(n));
	}

}
