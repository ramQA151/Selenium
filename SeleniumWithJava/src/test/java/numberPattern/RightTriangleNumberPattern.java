package numberPattern;

public class RightTriangleNumberPattern {
		  public static void main(String[] args) {

		    int size = 5;
		    // loop to print the pattern
		    for (int i = 0; i < size; i++) {
		      // print spaces
		      for (int j = 1; j < size - i; j++) {
		        System.out.print(" ");
		      }
		      // print number
		      for (int k = 0; k <= i; k++) {
		        System.out.print(k+1);
		      }
		      System.out.println();
		    }
		  }
		}