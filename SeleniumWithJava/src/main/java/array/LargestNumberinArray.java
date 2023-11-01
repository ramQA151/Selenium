package array;

public class LargestNumberinArray {

public static void main(String[] args) {

	int arr[] = { 123, 234, 345,1, 456 };
	int max = arr[0];

	for (int i = 1; i < arr.length; i++) {
	    if (arr[i] > max) {
		max = arr[i];

		}
	}
	System.out.println(max);

}
}
