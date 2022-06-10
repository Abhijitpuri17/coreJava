package oOPS.staticKeyword;

public class StaticVariables 
{
                    
	                    /// we want to store some data of students - their name , branch and college
	                    /// but college of each student is same. So we define collegename as static
	                    /// so whenever we want data of student his college name will we displayed
	                    /// that we stored in static varible.
	
	                   //// we dont have to store collegename for each student and hence less memory 
	                   /// is used.
	
	public static void main(String[] args)
	{
		Student a1 = new Student("Abhijit" , "CSE") ;
		Student a2 = new Student("Surya" , "IT") ;
		Student a3 = new Student("Anand" , "Mechanical") ;
           
		    a1.showDetails();
            a2.showDetails();
            a3.showDetails();
            System.out.println(a1.college)  ;
	}

}

class Student
{
   String name ;
   String branch ;
   static String college = "Walchand college of engineering, Sangli" ;
   
   Student(String name , String branch)
   {
	   this.name = name ;
	   this.branch = branch ;
   }
   
   void showDetails()
   {
	   System.out.println("name: " + name + ", branch : " + branch + ", college : " + college);
   }
}