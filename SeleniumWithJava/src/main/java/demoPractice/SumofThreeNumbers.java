package demoPractice;

import java.util.Scanner;

public class SumofThreeNumbers {

	public static void main(String[] args) {
	
//		int a=2 ,b=5, c=8;
//		int sum=a+b+c;
//		System.out.println(sum);
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a= sc.nextInt();
		System.out.println("Enter 2nd number");

		int b= sc.nextInt();
		System.out.println("Enter 3rd number");

		int c= sc.nextInt();
		int sum=a+b+c;
		System.out.println("Total is "+sum);
}
}
