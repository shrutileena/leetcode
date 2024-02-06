package leetcode.programs;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4 };
		int n = 2;

		reverse(arr, n);

		System.out.println(Arrays.toString(arr));
	}

	public static void reverse(int[] arr, int n) {

		for (int i = 0; i < n; i++) {
			swap(arr, 0);
		}

	}

	public static void swap(int[] arr, int index) {
		int temp = arr[index];
		for (int i = 1; i < arr.length; i++) {
			arr[i - 1] = arr[i];
		}
		arr[arr.length-1]=temp;
	}

}
