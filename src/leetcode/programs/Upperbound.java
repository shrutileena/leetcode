package leetcode.programs;

public class Upperbound {

	public static void main(String[] args) {

		// problem statement - return index for upper bound
		// upper bound - if repeating values in array ; so for given data it will give
		// last index for that value in arrays

		int arr[] = { 1, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 5 };

		int data = 4;
		int lo = 0;
		int hi = arr.length - 1;
		int res = -1;

		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (arr[mid] == data) {
				res = mid;
				lo = mid + 1;
			} else if (arr[mid] > data) {
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		
		System.out.println(res);
	}

}
