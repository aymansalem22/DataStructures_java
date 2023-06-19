package arrays;

public class Ch3 {

	public static int[] findSum(int[] arr, int n) {
		boolean check = false;
		int[] result = new int[2];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == n) {
					result[0] = arr[i];
					result[1] = arr[j];
					check = true;
				}
			}
		}

		if (!check) {
			System.out.print("Input Array is Empty so");
			System.out.print("==>Input Array orignal is :\n");
			for (int i : arr) {
				System.out.print(i + " ");
			}
		}

		else
			for (int i : result) {
				System.out.print(i + " ");
			}

		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 21, 3, 14, 5, 60, 7, 6 };
		int n = 27;
		findSum(arr, n);
		// arr = {1, 21, 3, 14, 5, 60, 7, 6} vale 27 ==> arr = {21, 6} or {6, 21}
		System.out.println("  ");
		int[] arr2 = { 9, 4, 7, 2, 6 };
		int n2 = 17;
		findSum(arr2, n2);
	}

}
