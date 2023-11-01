package javaPrograms2310;

public class MinnuminArray {

	public static void main(String[] args) {
		int arr[]= {1,5,6,8,7,9,4,3,-99};
		
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min) {
				min=arr[i];
			}
			
		}System.out.println(min);
	}
}
