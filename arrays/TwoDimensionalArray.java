package arrays;
import java.util.Scanner ;
public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		
		      //// Adding two matrices ////
		
//		System.out.println("Enter number of rows in matrix");
//		int rows = sc.nextInt();
//		System.out.println("Enter number of columns in matrix");
//		int columns = sc.nextInt() ;
//		
//		int a [][] = new int[rows][columns] ;
//		int b [][] = new int [rows][columns] ;
//		
//		System.out.println("Enter values of elements in matrix a");
//		for (int i = 0 ; i < rows ; i++) 
//		{
//			for (int j = 0 ; j < columns ; j++) 
//			{
//				a[i][j] = sc.nextInt();
//			}
//		}
//		
//		
//		System.out.println("Enter values of elements in matrix b");
//		for (int i = 0 ; i < rows ; i++) 
//		{
//			for (int j = 0 ; j < columns ; j++) 
//			{
//				b[i][j] = sc.nextInt();
//			}
//		}
//		System.out.println("Matrix obtained by adding a & b is :");
//		int c [][] = new int [rows][columns] ;
//		
//		for (int i = 0 ; i < rows ; i++) 
//		{
//			for (int j = 0 ; j < columns ; j++)
//			{
//				c [i][j] = a [i][j] + b [i][j] ;
//				System.out.print(c[i][j] + " ");
//			} 
//				System.out.println();
//		}
		
		
		                 ///// Making table of 2D array ///

		    int arr [][] = {{1 , 2 , 45 , 105 , 10} ,  {10 , 25 } , {45 , 145 , 456}} ;
		
		    System.out.println("The array is : ");
		
		    for (int i = 0 ; i < arr.length ; i++) {
		    	for (int j = 0 ; j < arr[i].length ; j++) {
		    		System.out.print(arr[i][j] + "\t");
		    	}
		    	System.out.println();
		    }
	}

}
