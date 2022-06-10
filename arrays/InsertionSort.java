package arrays;
import java.util.Scanner;
public class InsertionSort 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("Enter size of array :");
		int n = sc.nextInt() ;
        
		int [] arr = new int [n] ;
        for (int i = 0 ; i < n ; i++)
        {
        arr[i]  = sc.nextInt() ;
        }
        
        for (int i = 1 ; i < n ; i++)
        {
        	int j = i  ;
        	while (j > 0 && (arr[j-1] > arr[i]))
        		j-- ;
        		
        	int temp =  arr[i] ;
        	for (int k = i ; k > j ; k--)
        	{
        		arr[k] = arr[k-1] ;
        	}
        	arr[j] = temp ;
        }
        
        for (int e : arr) System.out.print(e + " ");
	}

}
