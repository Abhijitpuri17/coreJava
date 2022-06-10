package lambda;

interface MyInterface{
	void meth(String s) ;
} 


public class Mylambda 
{

	public static void main(String[] args) 
	{
		MyInterface m =(s) -> 
				System.out.println("Hello " + s + " , This is lambda") ;
				
	    m.meth("Abhijit");	
	    
	    /** 
	     * For ml , meth is referred to println
	     */
	    MyInterface ml = System.out::println;
		ml.meth("Abhijit");

	}

}
