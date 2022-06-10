package oOPS.inheritance;

public class InheritanceIntro
{                                       /// We use inheritance when there is an is-a-relationship
	                                    //// between two classes. Eg. (A car is a vehicle)
	                             
	                                    /// The constructors and private members are not inherited
                                        /// When constructor is called for child class, constructor for parent 
	                                    /// class with no param is also called
	 									/// If you want to call param constructor of parent with child class
										/// costructor , use 'super' word in child class constructor
	                                    
	                                    //// SYNTAX : child class extends parent class
	                                    // while writing child class name
	
	                                    /// One child class can have only 1 parent class
	                                    /// a parent class can have multiple children class
	
	                                    /// methdod overriding :  If same method is defined in superclass as well as
	                                               /// subclass , method in subclass is called , (overriding one in
	                                               /// superclass)
	
	                                   //// Upcasting & Downcasting : suppose animal is superclass and cat is subclass
	                                   /// Upcasting : cat c = new cat() ;
	                                                  // Animal a = c ;
	                                   /// Downcasting : Animal a = new Animal();
	                                                  // cat c = (cat) a ;

	
	  public static void main(String[] args) 
	  {
	         Teacher t = new Teacher() ;
	         t.name = "Anuj" ;
	         t.eat();
	         t.teach();
	         
	         Singer s = new Singer();
	         s.name = "Arijit" ;
	         s.walk();
	         s.sing();
		  
		  Teacher t1 = new Teacher() ;            /// Upcasting
		  Person p1 = t1 ;
	         
//		  Person p2 = new Person() ;
//		  Teacher t2 = (Teacher) p2 ;               //// run time error aa jayegi as p2 isn't teacher
		  
		  Teacher t3 = (Teacher)p1 ;              /// downcasting
	      
		  p1.walk();
		  
		  System.out.println(t1 instanceof Teacher);
		  System.out.println(t1 instanceof Person);        /// return a boolean whether object is instance of some class
		  System.out.println(p1 instanceof Singer);
	  }
	  
}
