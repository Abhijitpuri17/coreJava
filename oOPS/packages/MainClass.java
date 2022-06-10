package oOPS.packages;

import oOPS.packages.models.* ;


//// A java package is a group of similar type of classes , interfaces
                           /// and sub-packages.
                       
                          //// There are many built in packages in java such as java , lang ,
                          //// awt , javax , swing , util ,net , io , sql , etc.

                          /// java package provide accesss protection
                          /// It removes naming collision (1 package ke andar same naam ki 2
                                                      /// class ya subpackage nahi ho skta)


                          /// We can not create object of some class in another package directly
                          /// If we want to create , we have to import the class in required 
                          /// class . 
                          /// import package.subpackage.class ;
                          /// Agar ek package ya subpackage ki sabhi class import karani ho to
                          /// us package tak ki location.*



public class MainClass
{
	public static void main(String[] args)
	{
      Students obj = new Students("Abhijit") ;
 
      Teacher teacher = new Teacher() ;
 
     System.out.println(obj.getName()); 
	}
}
