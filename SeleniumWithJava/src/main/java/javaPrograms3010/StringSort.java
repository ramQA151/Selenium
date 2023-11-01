package javaPrograms3010;

import java.util.Arrays;
import java.util.Collections;


public class StringSort {

	public static void main(String[] args) {
		String strArr []= {"Dog","Ball","Elephant","Cat","Apple"};
		
		Arrays.sort(strArr);
			for(String str: strArr) {
				System.out.println(str);
			}
			
			//Printing array list in reverse direction
	        Arrays.sort(strArr, Collections.reverseOrder());
	        for(String str1: strArr) {
	        	System.out.println(str1);
	        }
		}
	
}
