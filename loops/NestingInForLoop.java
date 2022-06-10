package loops;
import java.util.Scanner ;
public class NestingInForLoop {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in) ;
		
//		System.out.println("All prime numbers from [a , b] will be printed. Enter value of a");
//		int a = sc.nextInt();
//		System.out.println("Enter value of b.");
//		int b = sc.nextInt() ;
//		
//		if (a == 1 || a == 2) {
//			System.out.print("2 ");
//			a = 3 ;	
//		}
//		for (int i = a ; i <= b ; i++) {
//			for (int j = 2 ; j < i ; j++) {
//				if (i % j == 0) {
//					break ;
//				}
//				else if (j != i - 1) {
//					continue ;
//				} else {
//					System.out.print(i + " ");
//				}
//		
//			}
//		}
		      
		
		
		           //// Tables from [a , b ]

		System.out.println("Enter a");
		int a = sc.nextInt();
		
		System.out.println("Enter b");
		int b = sc.nextInt();
		
		for (int i = a ; i <= b ; i++) {
			for (int j = 1 ; j <= 10 ; j++) {
				System.out.print(i * j + " ");
			} System.out.println();
		}
		
		
	}

}
