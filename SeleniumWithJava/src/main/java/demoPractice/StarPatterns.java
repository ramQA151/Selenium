package demoPractice;

import java.util.Scanner;

public class StarPatterns {

	public static void main(String[] args) {
		
//  6*6 star pattern
		
//		for(int i=0; i<=5;i++) {
//			for(int j=0;j<=5;j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
//-------------------------------------------------------------
//  Right Angle Triangle		
//		for(int i=0;i<=4;i++) {
//			for(int j=0;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
//--------------------------------------------------------------------
//  Right Angle Triangle
		
//		for(int i=0;i<=5;i++) {
//			for(int j=i;j>=0;j--) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
//-----------------------------------------------------------------
// reverse half pyramid with star:
		
//		for(int i=0;i<=5;i++) {
//			for(int j=0;j<=5-i;j++) {
//				System.out.print("* ");
//				
//			}
//			System.out.println("");
//		}
		
//*******//OR BY ANOTHER WAY*************
//		
//		for(int i=0;i<=5;i++) {
//			for(int j=5;j>=i;j--) {
//				System.out.print("* ");
//			}
//			System.out.println("");
//		}
//		
//******Using While Loop***********
//		int i=1, j;
//        while ( i <= 5) {
//            j = 1;
//            while (j <= 5 - i + 1) {
//                System.out.print("* ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
		
//--------------------------------------
//		PRINTING LEFT HALF PYRAMID OF STARS
//		Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the number of rows: ");
//        int numRows = scanner.nextInt();
//        System.out.println();

//		 for (int row = 1; row <= 5; row++) {
//	            for (int col = 1; col <= 5 - row; col++) {
//	                System.out.print("  ");
//	            }
//	            for (int star = 1; star <= row; star++) {
//	                System.out.print("* ");
//	            }
//	            System.out.println();
//		}
		
//---------------------------------------------------------------------
// Triangle Pattern in JAVA
		
		// loop to iterate for the given number of rows
//		for (int i = 1; i <= 5; i++) {
//
//			// loop to print the number of spaces before the star
//			for (int j = 5; j >= i; j--) {
//				System.out.print("_ ");
//			}
//
//			// loop to print the number of stars in each row
//			for (int j = 1; j <= i; j++) {
//				System.out.print("* ");
//			}
//
//			// for new line after printing each row
//			System.out.println();
//		}
//-----------------------------------------------------------
		//Palindromic pyramid pattern using java

		
		// declare for loop for every new row
		for (int i = 1; i <= 5; i++) {
			// this loop is for the space
			for (int j = i; j <= 5; j++)
				System.out.print(" ");
			// this loop is for print number 1 to i
			for (int j = 1; j <= i; j++)
				System.out.print(j + "");
			// this loop is for the number in reverse order
			for (int j = i - 1; j >= 1; j--)
				System.out.print(j + "");
			System.out.println();
		}
	}
	}
























