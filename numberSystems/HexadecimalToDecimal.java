package numberSystems;
import java.util.Scanner;
public class HexadecimalToDecimal 
{

	static int hexadecimalToDecimal(String s)
	{
		int ans = 0 ;
		int x = 1 ;
		int n  = s.length();
		for (int i = n-1 ; i >= 0 ; i--)
		{
			char lastDigit = s.charAt(i) ;
			if (lastDigit >= '0' && lastDigit <= '9')
			{
				ans += (lastDigit - '0')*x ;
			}
			else 
			{
				ans += x*(lastDigit - 'A' + 10) ;
			}
			x *= 16 ;
			n /= 10 ;
		}
		return ans ;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the hexadecimal number :");
		String s = sc.nextLine();
		System.out.println("Value of hexadecimal number " + s + " in decimal is "+ hexadecimalToDecimal(s));
	}

}
