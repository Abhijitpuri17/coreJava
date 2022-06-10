package exceptionHandling;

public class Throw_throws 
{
	
	// throw : is used to give a exception as a return value
	// throws : is used to define that some method gives a exception
	
	
	static int area(int l ,  int b) throws Exception 
	{
		
		if (l < 0 || b < 0) throw new Exception("Length and breadth can not be negative") ;
		
		return l*b ;
	}
	

	public static void main(String[] args) 
	{
		int l = -2 , b = 5 ;
		
		try {
			int area = area(l, b) ;
			System.out.println("Area = " + area);
			  
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
