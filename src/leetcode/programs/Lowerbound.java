package leetcode.programs;

public class Lowerbound {

	public static void main(String[] args) {

		// problem statement - return index for lower bound
		// lower bound - if repeating values in array ; so for given data it will give
		// first index for that value in array

		int arr[] = { 1, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 5 };

		int data = 4;
		int lo = 0;
		int hi = arr.length - 1;
		int res = -1;

		// found - return index
		// not found - return -1
		while (lo <= hi) {
			int mid = (lo + hi) / 2;

			if (arr[mid] == data) {
				res = mid;
				hi = mid - 1;
			} else if (arr[mid] > data) {
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}

		System.out.println(res);

	}

}
