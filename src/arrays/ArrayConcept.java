package arrays;

public class ArrayConcept {

	public static void main(String[] args) {
		// basic concept
		// array declaration

		int myArray[];
		int[] testArray2;

		// array intialization

		myArray = new int[4];

		// accessing elements in an array
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}

		// initialization in one step
		String[] test = new String[5];

		// update or add value
		test[2] = "ali";

		// example

		int[] myArr = new int[4];

		myArr[0] = 10;
		myArr[1] = 20;
		myArr[2] = 30;
		myArr[3] = 40;

		for (int i = 0; i < myArr.length; i++) {
			System.out.println(myArr[i]);
		}

		myArr[3] = 1000;

		System.out.println("Updated Arr: ");
		for (int i : myArr) {
			System.out.println(i);
		}

		// Adding Elements using Array Literal

		int[] mySec = { 100, 200, 300, 400 };

		for (int i = 0; i < mySec.length; i++) {
			System.out.println(mySec[i]);
		}

		// Initialization in Two Dimensional Arrays
		System.out.println("Initialization in Two Dimensional Arrays");
		int rows = 3;
		int columns = 4;

		int[][] my2DArray;
		my2DArray = new int[rows][columns];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				my2DArray[i][j] = i + j;
				System.out.print(my2DArray[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("student grades.......");

		int[][] studentArray;
		studentArray = new int[30][6];

		for (int i = 0; i < 30; i++) {
			for (int j = 0; j < 6; j++) {
				studentArray[i][j] = i + j;
				System.out.print(studentArray[i][j] + " ");
			}
			System.out.println();
		}

	}

}
