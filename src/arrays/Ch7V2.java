package arrays;

// Find Second Maximum Value in an Array: Traversing the Array Only Once
public class Ch7V2 {

	public static int findSecondMaximum(int[] arr) {

		int max = Integer.MIN_VALUE;
		int secondmax = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secondmax = max;
				max = arr[i];
			} else if (arr[i] > secondmax && arr[i] != max) {
				secondmax = arr[i];
			}
		}
		return secondmax;
	}

	public static String arrayToString(int arr[]) {
		if (arr.length > 0) {
			String result = "";
			for (int i = 0; i < arr.length; i++) {
				result += arr[i] + " ";
			}
			return result;
		} else {
			return "Empty Array!";
		}
	}

	public static void main(String[] args) {

		int[] arr = { -2, -33, -10, -456 };

		System.out.println("Array: " + arrayToString(arr));

		int secMax = findSecondMaximum(arr);

		System.out.println("Second maximum: " + secMax);
	}
}
