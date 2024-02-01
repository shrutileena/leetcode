package leetcode.programs;

import java.util.Arrays;

public class Segregate0and1 {

	// brute force
	public static void main(String[] args) {

		int arr[] = { 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1 };
		int n = arr.length;

		segregateBruteForce(arr, n);
		segregateOptimized(arr, n);

	}

	// two pointer
	private static void segregateOptimized(int[] arr, int n) {
		int i = 0, j = n - 1;
		while (i <= j) {
			if (arr[i] == 1) {
				if (arr[j] == 0) {
					arr[i] += arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];
				}
				j--;
			} else {
				i++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void segregateBruteForce(int arr[], int n) {
		int[] a = new int[n];
		int countZero = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				countZero++;
			}
		}

		for (int i = 0; i < countZero; i++) {
			a[i] = 0;
		}
		for (int i = countZero; i < n; i++) {
			a[i] = 1;
		}
		arr = a;

		System.out.println(Arrays.toString(arr));
	}
}
