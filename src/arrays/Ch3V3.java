package arrays;

public class Ch3V3 {

	// sort given array(Quick Sort)
	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = (low - 1);
		for (int j = low; j < high; j++) {
			if (arr[j] <= pivot) {
				i++;

				// swap arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// swap arr[i+1] and arr[hight]
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;

	}

	public static void sort(int[] arr, int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);
			sort(arr, low, pi - 1);
			sort(arr, pi + 1, high);
		}
	}

	public static int[] findSum(int[] arr, int n) {
		sort(arr, 0, arr.length - 1);

		int Pointer1 = 0; // at Start
		int Pointer2 = arr.length - 1; // at End

		int[] result = new int[2];
		int sum = 0;

		while (Pointer1 != Pointer2) {
			sum = arr[Pointer1] + arr[Pointer2];

			if (sum < n)
				Pointer1++;
			else if (sum > n)
				Pointer2--;
			else {
				result[0] = arr[Pointer1];
				result[1] = arr[Pointer2];
				return result;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int n = 9;
		int[] arr1 = { 5, 4, 3, 2, 1 };
		if (arr1.length > 0) {
			int[] arr2 = findSum(arr1, n);
			int num1 = arr2[0];
			int num2 = arr2[1];

			if ((num1 + num2) != n)
				System.out.println("Not Found");
			else {
				System.out.println("Number 1 = " + num1);
				System.out.println("Number 2 = " + num2);
				System.out.println("Sum = " + n);
			}
		} else {
			System.out.println("Input Array is Empty!");
		}

	}

}
