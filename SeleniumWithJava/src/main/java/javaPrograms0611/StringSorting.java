package javaPrograms0611;

import java.util.Arrays;
import java.util.Collections;

public class StringSorting {

	public static void main(String[] args) {
		String[] arr= {"Cat","Apple","Dog","Ball","Zebra"};
		
	Arrays.sort(arr);
	
	for(String ar:arr) {
		System.out.println(ar);
	}
	
	System.out.println("*********************************************");
	Arrays.sort(arr, Collections.reverseOrder());
	for(String a:arr) {
		System.out.println(a);
	}
	
	}
}
