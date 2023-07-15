package arrays;

//First Non-Repeating Integer in an Array
public class Ch6 {

	public static void main(String[] args) {
		// int[] arr= {9,2,3,2,6,6};
		// int[] arr = { 4, 5, 1, 2, 0, 4 };
		int[] arr = { 2, 54, 7, 2, 6, 54 };
		System.out.println(findFirstUnique(arr));
		System.out.println("Array: " + arrayToString(arr));

		int unique = findFirstUnique(arr);
		System.out.print("First Unique in an Array: " + unique);

	}

	public static int findFirstUnique(int[] arr) {
		boolean isRepeated = false;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j] && i != j) {
					isRepeated = true;
					break;
				}
			}

			if (isRepeated == false) {
				return arr[i];
			} else {
				isRepeated = false;
			}
		}
		return -1;
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

}
