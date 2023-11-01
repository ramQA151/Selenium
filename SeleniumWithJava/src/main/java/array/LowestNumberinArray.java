package array;

public class LowestNumberinArray {

	public static void main(String[] args) {
		int arr[] = { 234, 345, 123, 456 };

		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}
}
