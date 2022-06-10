package arrays;

public class ArraysIntro 
{
	public static void main(String[] args)
	{
		                                      
                                                      //// Used to store multiple values in
		                                              //// same variable of same datatype
		                                              //// datatype[] variable = new datatype [n]
		                                              /// OR datatype[] variable ;
		                                              /// variable = new datatype [n]
		int [] marks = new int [4] ;
		marks [0] = 10 ;
		marks [1] = 98 ;
		marks [2] = 92 ;
		marks [3] = 87 ;
		
		for (int i = 1 ; i <= marks.length ; i++) 
		{
			System.out.println("Marks of roll number " + i + " is " + marks [i-1]);
		}

	}

}
