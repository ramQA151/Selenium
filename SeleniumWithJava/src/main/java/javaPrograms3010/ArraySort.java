 package javaPrograms3010;

import java.util.Arrays;

public class ArraySort {
public static void main(String[] args) {
	

	int arr[]= {1,2,3,9,8,7,5,6,4};
	Arrays.sort(arr);
	for(int num:arr) {
		System.out.print(num);
	}
}	
}
