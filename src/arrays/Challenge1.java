package arrays;

public class Challenge1 {

	public static int[] removeEven(int[] arr) {
		int oddElements = 0;

		// Find number of odd elements in arr
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0)
				oddElements++;
		}

		// create result array with the size equal to the number of odd elements in arr
		int[] result = new int[oddElements];
		int result_index = 0;

		// Put odd values from arr to the resulted array
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				result[result_index++] = arr[i];
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int size = 10;
		int[] arr = new int[size];

		System.out.println("Before removing Even Numbers: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		int[] newArr = removeEven(arr);
		System.out.println("After removing Even Numbers: ");
		for (int i : newArr) {
			System.out.print(i + " ");
		}

	}

}
