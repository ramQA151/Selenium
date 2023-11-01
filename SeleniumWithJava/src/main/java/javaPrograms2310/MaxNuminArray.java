package javaPrograms2310;

public class MaxNuminArray {

	public static void main(String[] args) {
		int arr[]= {9,5,8,1,6,3,4,7,8,65};
		
		int max=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i] >max)
				max=arr[i];
		}
		System.out.println(max);
	}
}
