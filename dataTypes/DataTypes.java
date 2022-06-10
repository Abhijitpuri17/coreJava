package dataTypes;

public class DataTypes 
{

	public static void main(String[] args) 
	{
		byte a = 2 ;
		short b = 256 ;
		int c = 2451255 ;
		long d = 152484;
		float x = 1.21f ;
		double y = 2561.124515841 ;
		char myCharacter = '@' ;
		boolean isThisStatementTrue = true ;
		String hello = "Hi, My name is Abhijit" ;
		
		System.out.println("number stored in byte datatype is " + a) ;
		System.out.println("number stored in short datatype is " + b) ;
		System.out.println("number stored in int datatype is " + c) ;
		System.out.println("number stored in long datatype is " + d) ;
		System.out.println("number stored in float datatype is " + x) ;
		System.out.println("number stored in double datatype is " + y) ;
		System.out.println("Character stored in char datatype is " + myCharacter) ;
		System.out.println(isThisStatementTrue) ;
		System.out.println(hello) ;
		
		long l = 999999999999l ;       // int chya range baher jaat asel tr long la by literal initalise
		                               // kartana shevti 'l' or 'L' lihayla pahije
		System.out.println(l);
		
		
	}
}
