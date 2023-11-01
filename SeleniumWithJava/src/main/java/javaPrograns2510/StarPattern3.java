package javaPrograns2510;


//java program for left triangle
public class StarPattern3 {
	// Function to demonstrate printing pattern
public static void main(String[] args) {
	
	{
		for(int i=0;i<=4;i++) {
			for(int j=3;j>=i;j--) {
				System.out.print(" ");
			}
			for(int b=0;b<=i;b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
}


