package oOPS;


               ///// CLASS : Blueprint in oops which creates objects
               ///// OBJECT : Instance of class which has some state and behaviour. It occupies
                              /// some space in memory
           
               //// Example : Animal is the class. Actual Cat, Dog are objects in this class.
                            //// walk(), eat() are behaviors for object (METHODS)
                                                                       // colour , breed
                                                                      // are states of object

                    //// java file can have only 1 public class & its name is equal to name of
                    //// file.

                     //// creating object in class : classname objectname = new classname()
                                     

                    /// object.method() to execute code for this method
                    /// defined in some class
					/// object.state to access some state of object

class Animal 
{
	String colour ;
	int noOfLegs , noOfEyes ;
	public void walk()
	{
		System.out.println("can walk");	
	}
	public void eat()
	{
		System.out.println("can eat");
	}
	public void description() 
	{
		System.out.println("They have " + noOfLegs + " legs , " + noOfEyes + " eyes and color is "
				+ colour);
	}
}


public class ClassAndObject {

	public static void main(String[] args) {
		
		Animal cat = new Animal() ;
		Animal dog = new Animal() ;

//		System.out.print("cat ");
//		cat.walk();

//		System.out.print("dog ");
//	    dog.eat();

		   cat.noOfEyes = 2 ;
		   cat.noOfLegs = 4 ;
		   cat.colour = "Black" ;
		   dog.noOfEyes = 2 ;
		   dog.noOfLegs = 4 ;
		   dog.colour = "White" ;
	   
//	   dog.description();
	   cat.description();

	}

}
