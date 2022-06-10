package oOPS.encapsulation;

public class Student 
{
	   private String name ;
       private int age ;
       
       public int getAge() 
       {
    	   return age ;
       }
       
       public void setAge(int age) 
       {
    	   if (age > 25) {
    		   System.out.println("Your age is greater than 25. Yo can't be student at our college");
    	   } 
    	   else
    	   {
    	   this.age = age ;
    	   }
       }

	public String getName() 
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}

