package oOPS.inheritance;

public class Singer extends Person
{



	       
	      public void walk()
          {
  	         System.out.println("Singer " + name + " is walking");           /// Method overriding
          }
	            
          public void sing() 
          {
        	  System.out.println(name+ " is singing") ;
          }
}
