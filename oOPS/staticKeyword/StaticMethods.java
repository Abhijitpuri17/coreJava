package oOPS.staticKeyword;

public class StaticMethods
{
                                                /// static method can be called through the class
	                                            /// no need to create object.
	
	                                            /// static method can access only static variables & not
	                                            /// instance local variable.
	
	public static void main(String[] args) 
	{
		System.out.println(Students.showCollege());
	}

}

class Students
{ 
	static String showCollege()
	{
		return "WCE" ;
	}
}