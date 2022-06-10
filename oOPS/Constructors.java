package oOPS;

                           //// A constructor is similar to a method (but not actually a method
                           //// but it has same name as 
                           //// that of classname and it has no return type

                           /// If  we do not create a constructor , a default constructor 
                           /// is automatically created and states of object are given default
                           /// values (eg. for int , default value = 0)
                             
                          /// If constructor is created, default constructor can not be called.
                          /// If you want to call , you have to create a default constructor in
                          /// class with empty body

                           //// Whenever a new object is created , constructor will be called.
                        
                          //// when a constructor does not accept any parameter , it is
                          /// no-argument constructor
                       
                          //// when arg/parameter are passed, Constructor are called
                          //// parametrised constructor
                           
                          //// constructors overloading can be done if 2 constructors with same
                          /// name has different parameters

//// Example 1:

class Test
{
	Test()
	 {
		 System.out.println("Object is created.");
	 }
}


//// Example 2 :

class Vehicle
{
	
	int wheels ;
	String colour ;
	
	Vehicle() 
	{
		wheels = 4 ;
	}                                              //// no-arg construtor
	
	Vehicle(int noOfWheels, String Colour)
	{
		wheels = noOfWheels ;                       //// overloading
		colour = Colour ;
	}
   
}                                           

class Animals 
{
	int legs ;
	int eyes ;

	Animals(int noOfLegs , int eyes)
	{                                                  //// parameterised constructor
		legs = noOfLegs ;
		this.eyes = eyes ;                            //// the keyword 'this' helps to point
	}	                                              /// to curr state if state & some arg
		                                              /// has same name
	
}

                           
public class Constructors 
{

	public static void main(String[] args) 
	{
		
		  Test test1 = new Test() ;

		Vehicle Car = new Vehicle() ;                                        
		Vehicle Bike = new Vehicle() ;          /// when any obj is created , by constructor
		Bike.wheels = 2 ;                       /// it gets wheels = 4 . We can further change
		                                        /// it if required.
		Vehicle Bicycle = new Vehicle(2 , "Yellow") ;
		  
		  
	System.out.println("Car has " + Car.wheels + " wheels.");
    System.out.println("Bike has " + Bike.wheels + " wheels.");
	System.out.println("Bicycle has " + Bicycle.wheels + " wheels & its colour is " + Bicycle.colour);
	
	Animals Cat = new Animals(4 , 2) ;
	Animals Monkey = new Animals(2 , 2) ;
	System.out.println("Cat has "+ Cat.legs + " legs & " + Cat.eyes + " eyes.");
	System.out.println("Monkey has "+ Monkey.legs + " legs & " + Monkey.eyes + " eyes.");
	
	}

}
