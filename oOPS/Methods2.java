package oOPS;


                       //// 1 class me 2 same name ke method with same parameters nahi ho sakta.
                         
                      //// METHOD OVERLOADING :          when a class has two or more methods by same
                      // (Compile time polymorphism)    name but different parameters, it's method over-
                                                           //// -loading
                             


public class Methods2
{
	static int maxOf(int a , int b)
	{
		return a > b ? a : b ;
	}
	static int maxOf(int a , int b , int c)
	{
		return a > b ? a > c ? a : c : b > c ? b : c ;
	}
	static float maxOf(float a , float b)
	{
		return a > b ? a : b ;
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println(maxOf(2 , 5 , 10));
	}

}
