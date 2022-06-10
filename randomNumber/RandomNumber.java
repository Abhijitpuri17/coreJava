package randomNumber;
import java.util.Random ;
public class RandomNumber 
{
	public static void main(String[] args) 
	{
		Random dice = new Random() ;
		int result = 1 + dice.nextInt(6);
        System.out.println("The result is " + result) ;
        
        float b = dice.nextFloat();
        System.out.println(b);
	}
}
