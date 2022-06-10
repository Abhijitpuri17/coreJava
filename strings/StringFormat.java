package strings;
import java.util.Scanner ;
public class StringFormat 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner (System.in) ;
		
		int hour , min , sec ;
		
		System.out.println("Enter time in 24 hr in format : (hour  min  sec)");
		
		hour = sc.nextInt() ;
		
		String ab ;
		
		if (hour < 12) ab = "AM" ;
		 else ab = "PM" ;
		
		
		min = sc.nextInt() ;
		sec = sc.nextInt() ;
		
		if (hour < 24) 
		{
			if (hour == 0 || hour == 12)
			{
				hour = 12 ;
			} else 
			{
				hour = hour % 12 ;
			}
		}
		else 
		{
			System.out.println("Invalid time");
			hour = 0 ;
			min = 0 ;
			sec = 0 ;
		} 
		
		System.out.printf(String.format("The time is %d : %02d : %02d %s", hour , min , sec , ab));
	}
     
	
	
}
