package arrays;

public class LargestSumSubarray {

	public static void main(String[] args) {
		
		                                          //// Subarray = subset of array having 
		                                          //// continous elements. If not continous 
		                                          //// it is subsequence not subarray
		
		
		      //// Method 1 ////     time complexity = O(n*n*n)
		 
	/*	
	       int [] a = {-1 , 4 , -2 ,-4 , -1 , 3 , 5 , -6} ;
		int n = a.length ;
		int max = Integer.MIN_VALUE ;
		
		for (int i = 0 ; i < n ; i++) 
		{
			for (int j = i ; j < n ; j++) 
			{
				int cursum = 0 ;
				for (int k = i ; k <= j ; k++)
				{
					cursum += a[k] ;
				}
					if (cursum > max) 
					{
			           max = cursum ;
		            }
			}
		}
		
	System.out.println("Largest sum of any subarray is " + max);
	
	*/
		
		
		                //// Method 2 ////    time complexity = O(n*n)
	/*
		int [] a = {-3 , 2 , 4 , -1 , 2 , 3 , -2} ;
		int n = a.length ;
		
		int [] sum = new int [n] ;
		sum [0] = a [0] ;
		for (int i = 1 ; i < n ; i++) 
		{
			sum [i] = sum [i-1] + a [i] ;
		}
		
		int max = Integer.MIN_VALUE ;
		
		for (int i = 0 ; i < n ; i++)
			{
			for (int j = i ; j < n ; j++)
				{
		int cursum = sum [j] - sum [i]  + a [i];
		if (cursum > max)
					{
			max = cursum ;
		}
			}
		}
		System.out.println("Largest sum of any subarray is " + max);
		
	*/
		
		          //// Method 3 ////   KADEN'S ALGORITHM        time complexity = O(n)
		
		
		int a [] = {2 , -3 , 2 , 4 , -1 , 2 , 3 , -2} ;
		int n = a.length ;
		
		int maxSum = Integer.MIN_VALUE ;
		int curSum = 0 ;
		
		for (int i = 0 ; i < n ; i++) 
		{
			curSum += a[i] ;
			
			if (curSum > maxSum) 
			{
				maxSum = curSum ;
			}
			
			if (curSum < 0)
			{
				curSum = 0 ;
			}
		}
		System.out.println("Largest sum of any subarray is " + maxSum) ;
	
	}
}
