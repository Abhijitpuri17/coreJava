package oOPS.staticKeyword;

public class StaticBlock 
{
                                              //// code in static block is executed at the time class 
	                                          /// is loaded to memory.
	
	                                          /// at JDK version greater than 1.6 , the static block 
	                                          /// will not not executed unless main method is created.
	
	static
	{
		System.out.println("The class is loaded.");
	}
	
	public static void main(String[] args)
	{
		System.out.println("I am in main method.");
	}

}
