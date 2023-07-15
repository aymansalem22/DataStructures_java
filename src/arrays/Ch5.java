package arrays;

//Find Minimum Value in Array
public class Ch5 {

	public static void main(String[] args) {
		int[] arr = { 9, 7, 3, 4 };
		System.out.println("Array : ");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		int min = findMinimum(arr);
		System.out.println("Minimum in the Array: " + min);
	}

	public static int findMinimum(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

}
