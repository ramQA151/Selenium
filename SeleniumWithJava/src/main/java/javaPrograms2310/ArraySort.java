package javaPrograms2310;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int arr[]= {12,25,03,14,500,156,173};
		
		Arrays.sort(arr);
		for(int num:arr) {
			System.out.println(num);
		}
	}
}
