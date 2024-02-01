package leetcode.programs;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 11, 12, 13, 14 };

		System.out.println(Arrays.toString(arr));
		reverseArray(arr);
	}

	// two pointer approach
	public static void reverseArray(int[] arr) {
		int i=0, j=arr.length-1;
		
		while(i<=j) {
			arr[i] += arr[j];
			arr[j] = arr[i] - arr[j];
			arr[i] = arr[i] - arr[j];
			i++;
			j--;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
