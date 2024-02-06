package leetcode.programs;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {

		// returns numbers of unique value sin the array
		
		int arr[] = { 1, 2, 2, 4 };

		int res = removeDup(arr);
//		int res[] = removeDup(arr);

		System.out.println(res);
//		System.out.println(Arrays.toString(res));
	}

	public static int removeDup(int[] arr) {
		int i = 0, j = 0;

		while (j < arr.length) {
			if (arr[j] == arr[i]) {
				j++;
			} else if (arr[j] != arr[i]) {
				i++;
				arr[i] = arr[j];
				j++;
			}
		}
		return i+1;
//		return arr;
	}
}
