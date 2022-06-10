package arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		                                          //// Arranging in increasing order
		                                          //// compare 1st & 2nd element of array and
		                                          //// if 1st > 2nd , they are swapped. then 2nd
		                                          //// & 3rd are checked and continues further
		                                          //// for n-1 times in first iteration, n-2
		                                          //// for 2nd iteration i.e. n-1-i times.
		                                          //// This process is done n-1 times
		
		int a [] = {2 , 1 , 8 , -3 , 6 , 4 , 12} ;
		int n = a.length ;
		
		for (int i = 0 ; i < n - 1 ; i++)
		{
			
			boolean sorted = true ;
			
			for (int j = 0 ; j < n-1-i ; j++) 
			{
			
				if (a[j+1] < a[j]) 
				{                             /// IF ARRAY IS OF STRING , USE a[j].compareTo(a.[j+1]) > 0 
					int temp = a[j+1];           /// it is true if a[j] is after a[j+1] lexographicallly
				
					a[j+1] = a[j] ;
					
					a[j] = temp ;
					
					sorted = false ;
				}
			}
			if (sorted) break ;
		}
		
//		for (int i = 0 ; i < n ; i++) 
//		{
//			System.out.print(a[i] + " ");
//		}                                       
		
		                                          ///// for each loop is used below for array ////
		
		for (int item : a) 
			System.out.print(item + " ");
		
		
		
	}

}
