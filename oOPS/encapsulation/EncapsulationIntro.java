package oOPS.encapsulation;

                                         /// Encapsulation in java is a process of wrapping
                                             /// code and data together in a single unit.
                                        /// The data in a class is hidden from other 
                                              /// classes so it is known as data-hiding

                             /// It helps to keep related fields and methods together
                                /// which makes code cleaner and easier to use.

                                 /// Control the modification of data fields.

                                         /// helps to decouple components of a system. These
                              /// decoupled components can be developed , tested and debugged
                                      /// independently and concurrently. And any changes in 
                                     /// particular component do not have any effect on other
                                    /// component.


               ///// How to achieve encapsulation :
                               /// Declare objects of class as private.
                               /// Provide public setter and getter methods that will be used
                                       /// to write and read these variables. 



public class EncapsulationIntro 
{
	public static void main(String[] args)
	{
               Student obj = new Student() ;
               obj.setAge(19);
               System.out.println(obj.getAge());
               obj.setName("Abhijit");
               System.out.println(obj.getName());
	}
}
