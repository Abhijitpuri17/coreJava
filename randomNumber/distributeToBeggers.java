package randomNumber;
import java.util.Random ;
public class distributeToBeggers 
{

	public static void main(String[] args)
	{
		
		
		             //// Distribute RS 10000 to 10 beggers randomly ///
      Random ab = new Random() ;
		int begger [] = new int [10] ;
		int TotalMoney = 10000 ;
		
		for (int i = 0 ; i < 9 ; i++)
		{
			begger[i] = 1 + ab.nextInt(TotalMoney - 9 + i) ;
			TotalMoney -= begger[i] ;
		}
		begger[9] = TotalMoney ;
		TotalMoney -= begger[9] ;
		
		System.out.println("Begger number\tMoney");
		for (int i = 0 ; i < 10 ; i++)
		{
			System.out.println("\t" + (1+i) + "\t" + begger[i]);
		}
	}

}
