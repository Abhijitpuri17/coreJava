package numberSystems;
import java.util.Scanner;
public class OctalToDecimal
{

	static int octalToDecimal(int n)
	{
		int ans = 0 ;
		int x = 1 ;
		while (n > 0)
		{
			int lastDigit = n % 10 ;
			ans += lastDigit*x ;
			x *= 8 ;
			n /= 10 ;
		}
		return ans ;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in) ;
		System.out.println("Enter the octal number :") ;
		int n = sc.nextInt();
		System.out.println("The value of octal number " + n + " in decimal number system is " + octalToDecimal(n));
	}

}
