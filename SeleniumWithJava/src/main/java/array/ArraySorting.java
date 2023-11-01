package array;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		int arr[]= {5,6,4,8,1,9,3,-2,-9,77,-53};
		
		  Arrays.sort(arr);
	        System.out.println("\nThe sorted array is: ");
	        for (int num : arr) {
	            System.out.print(num + ", ");
	        }
		
	}
}
