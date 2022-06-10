package numberSystems;

import java.util.Scanner;

public class DecimalToBinary
{

	static int decimalToBinary(int n)
	{
		int ans = 0 ;
		int x = 1 ;
		while (n > 0)
		{
			int lastDigit = n % 2 ;
			ans += lastDigit*x ;
			x *= 10 ;
			n /= 2 ;
		}
		return ans ;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in) ;
		System.out.println("Enter decimal number :");
		int n = sc.nextInt();
		System.out.println("The value of " + n + " in binary system is " + decimalToBinary(n));
	}

}
