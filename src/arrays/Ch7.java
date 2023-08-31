package arrays;

// Find Second Maximum Value in an Array: Traversing the Array Twice
public class Ch7 {

	public static int findSecondMaximum(int[] arr) {
		int max = Integer.MIN_VALUE;
		int secondmax = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > secondmax && arr[i] < max)
				secondmax = arr[i];
		}

		return secondmax;
	}

	public static void main(String[] args) {
		int[] arr = { 9, 2, 3, 6 };

		System.out.println(findSecondMaximum(arr));
	}

}
