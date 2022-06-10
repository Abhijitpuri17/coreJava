package oOPS.polymorphism;

public class MainClass 
{

	public static void main(String[] args) 
	
	{
               Dog d = new Dog() ;
               Pet p = d ;
               Animal a = p ;
               MainClass obj = new MainClass() ;
               
               d.walk() ;
               p.walk() ;                         // run time polymorphism hoga yaha par (methods par hota
                                                 // hai but not on variables)
               
               obj.greetings("Abhijit") ;
               obj.greetings();      
	}
	
	
	public void greetings()
	{
		System.out.println("Hi , there");
	}
	
                                                    // method overloading or compile time polymorphism
	public void greetings(String name)
	{
		System.out.println("Hi " + name);
	}
	
	
}
