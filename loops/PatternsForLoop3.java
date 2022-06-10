package loops;

import java.util.Scanner;

public class PatternsForLoop3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		
		                  //// Pattern 9
		
		System.out.println("Enter n");
		int n = sc.nextInt();
		
//		for (int i = 1 ; i <= 3 * n ; i++) {
//			if (i <= n) {
//				for (int j = 1 ; j <= n + 1 - i ; j++) {
//					System.out.print("* ");
//				}
//				for (int k = 1 ; k <= i ; k++) {
//					System.out.print("    ");
//				}
//				for (int j = 1 ; j <= n + 1 - i ; j++) {
//					System.out.print("* ");
//		} System.out.println();
//		
//	
//	} else if (i > 2 * n) {
//		for (int j = 1 ; j <= i - 2 * n ; j++) {
//				System.out.print("* ");
//			}
//			for (int k = 1 ; k <= 3 * n - i + 1 ; k++) {
//				System.out.print("    ");
//			} for (int j = 1 ; j <= i - 2 * n ; j++) {
//				System.out.print("* ");
//		}
//			System.out.println();
//		}	
//			
//		if (i > n && i <= n + 2) {
//			System.out.println();
//		}
//	
//		}
	
	
	
	                          //// Pattern 10  (A-type shape)
		
//		for (int i = 1 ; i <= n ; i++) {
//			if (i == 1) {
//				 for (int j = 1 ; j <= n - 1 ; j++) {
//					 System.out.print("  ");
//				 }
//				 System.out.println("*");
//			} else {
//				for (int j = 1 ; j <= n - i ; j++) {
//					System.out.print("  ");
//				}
//				System.out.print("* ");
//				if ((n % 2 == 0 && i == n/2 + 1) || (n % 2 != 0 && i == (n + 1)/2)) {
//					for (int k = 1 ; k <= 2 * i - 3 ; k++) {
//						System.out.print("* ");
//					}
//				} 
//				else {
//					for (int k = 1 ; k <= 2 * i - 3 ; k++) {
//						System.out.print("  ");
//				}
//				}
//				
//				System.out.println("*");
//					
//			}
//			
//		}
//	
	
	
	                

		                       //// Pattern 11
		
		for (int i = 0 ; i <= n ; i++) {
			for (int j = 1 ; j <= n-i ; j++) {
				System.out.print("  ");
			}
			for (int j = 1 ; j <= 2*i ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int i = n+1 ; i <= 2*n ; i++) {
			for (int j = 1 ; j <= i-n ; j++) {
				System.out.print("  ");
			}
			for (int k = 1 ; k <= 4*n - 2*i ; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		             
}	
	
	
	


