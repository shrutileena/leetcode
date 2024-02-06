package leetcode.programs;

import java.util.Arrays;

public class MoveAllZeroes {

	public static void main(String[] args) {
		int[] arr = { 3, 0, 3, 4, 0, 5, 2 };
		int[] arr1 = { 3, 0, 3, 4, 0, 0, 0, 7, 8, 9, 2 };
		moveAllZeroes(arr);
		System.out.println(Arrays.toString(arr));
		moveAllZeroesOptimized(arr1);
		System.out.println(Arrays.toString(arr1));
	}

	private static void moveAllZeroesOptimized(int[] arr) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0 && arr[j] == 0) {
				swap(arr, i, j);
			}
			if(arr[j] !=0) {
				j++;
			}
		}

	}

	private static void swap(int[] arr, int i, int j) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

	public static void moveAllZeroes(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == 0 && arr[j] != 0) {
					arr[i] += arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];
				}
			}
		}
	}
}
