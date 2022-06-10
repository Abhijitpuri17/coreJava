package arrays;

import java.util.Scanner;

public class OneDimensionalArray {

	public static void main(String[] args) {
		
                        //// Take marks from user and find average of marks
		
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("Enter the number of students");
		int n = sc.nextInt();
		
		double [] marks = new double [n] ;
		double averageMarks = 0 ;
		System.out.println("Enter the marks of students one by one");
		
		for (int i = 0 ; i < marks.length ; i++) {
			marks [i] = sc.nextDouble();
		}
	for (int i = 0 ; i < n ; i++) {
		averageMarks += marks [i] ; 
	}
	averageMarks /= n ;
	
	System.out.println("Average marks of the class is " + averageMarks ) ;
	}

}
