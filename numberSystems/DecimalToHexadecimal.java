package numberSystems;
import java.util.Scanner;
public class DecimalToHexadecimal 
{

	static String decimalToHexadecimal(int n)
	{
		String ans = "" ;
		int x = 1 ;
		while (n > 0)
		{
			int lastDigit = n % 16 ;
			if (lastDigit >= 0 && lastDigit <= 9)
			{
				ans = lastDigit + ans ;
			} 
			else 
			{
				char c = (char)(lastDigit - 10 + 'A') ;
				ans = c + ans ;
			}
			n /= 16 ;
		 }
		return ans ;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in) ;
		System.out.println("Enter the decimal number");
		int n = sc.nextInt();
		System.out.println("The value of " + n + " in hexadecimal system is " + decimalToHexadecimal(n));
	}
}