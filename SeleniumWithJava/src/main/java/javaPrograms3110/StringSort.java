package javaPrograms3110;

import java.util.Arrays;
import java.util.Collections;

public class StringSort {

	public static void main(String[] args) {
		String arr[]= {"Apple","Zebra","Dog","Xerox","Onion","Parrot","Space","Fish"};
		
		Arrays.sort(arr);
		for(String ar:arr) {
			System.out.println(ar);
		}
		
		System.out.println("\nPrinting Arrays on reverse order");
		Arrays.sort(arr,Collections.reverseOrder());
		for(String ar:arr) {
			System.out.println(ar);
			
		}
	}

}
