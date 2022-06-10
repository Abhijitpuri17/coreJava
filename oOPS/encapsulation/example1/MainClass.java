package oOPS.encapsulation.example1;

public class MainClass 
{
	public static void main(String[] args)
	{
		Time ab = new Time() ;
		ab.setTime(23, 0 , 45);
		System.out.println(ab.getTime());
	}
}
