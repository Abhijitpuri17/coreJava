package oOPS.polymorphism;

public class Intro 
{
                                   // Polymorphism = more than one form
	
	                               /// It allows us to perform a single action in different ways.
	                               /// In other words it allows us to define one interface and have multiple 
	                               // implementations
	
// -------------------------------------------------------------------------------------------------------|	 
// Run-Time Polymorphism                              |        Compile-Time Polymorphism                  |
// -------------------------------------------------------------------------------------------------------|                                                    |
// 1) also known as dynamic binding, late             |  1) also known as static binding , early binding  |
//    binding and overriding as well.                 |   and overloading as well.                        |
// ------------------------------------------------------------------------------------------------------ |                                                  |
// 2) Overriding is runtime polymorphism having       |  2) Overloading is a compile time polymorphism    |
//    same method with same parameters but associated |    where more than one methods share the same name| 
//    in a class and its subclass .                   |    with different parameters or different return  |
//    		                                          |    types.                                         |
// -------------------------------------------------------------------------------------------------------|  		                                          |
// 3) slower execution                                |       3) faster execution   		              |                                     
//--------------------------------------------------------------------------------------------------------|	                                                  |      
	
	
	
	                  /// Method overloading can't be achieved by changing only return type of method
	
	                 /// Main method can be overloaded
	
	                 /// For overriding it is possible to have different return type but child's rteurn
	                 /// type should be sub-type of parent's rteurn type.
	
	                /// Access modifier for an overriding method can allow more but not less access than
	                /// overridden method. e.g. : protected method in super class and public method in sub
	                                          //  class is possible but not protected in super and private
	                                          // in subclass
	
	                /// Final , static and private methods can not be overridden
	
}
