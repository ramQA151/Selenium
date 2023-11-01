package javaPrograms2310;

public class DuplicateEmelentsinarray {

	public static void main(String[] args) {
		int arr[]= {5,6,8,9,7,8,4,5,6,3,1,2,5,6,9,8};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
	}
}
