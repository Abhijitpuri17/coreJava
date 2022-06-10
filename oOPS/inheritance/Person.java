package oOPS.inheritance;

class Person
{

    Person(){
        System.out.println("Parent....");
    }

    protected String name ;
    protected void walk()
    {
        System.out.println("Person " + name + " is walking");             //// Example for method overriding
    }
          
    protected void eat()
          {
        	  System.out.println(name + " is eating") ;
          }
          
}
