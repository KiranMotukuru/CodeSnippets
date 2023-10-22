import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr = { 5, 4, 2, 3, 1 };
     System.out.println(arr.length-1);
		
		
		// Create a new array to store the reversed elements
		int[] reversedArr = new int[arr.length];

		// Reverse the array elements

		for (int i = 0; i < arr.length; i++) {
			reversedArr[i] = arr[arr.length -1- i];
		}

		// Print the reversed array
		System.out.println("Reversed Array: " + Arrays.toString(reversedArr));
	}
}
