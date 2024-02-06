package leetcode.programs;

public class SearchInsertPositionOfKInSortedAray {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 5, 6 };
		int k = 2;
		int k2 = 7;
		int k3 = 6;

		int res = findInsertion(arr, k);
		int res2 = findInsertion(arr, k2);
		int res3 = findInsertion(arr, k3);
		System.out.println(res);
		System.out.println(res2);
		System.out.println(res3);
		
		int res4 = findInsertion2(arr, k);
		int res5 = findInsertion(arr, k2);
		System.out.println(res4);
		System.out.println(res5);
	}

	// O(n)
	public static int findInsertion(int[] arr, int k) {
		if (arr[arr.length - 1] < k) {
			return arr.length;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == k) {
				return i;
			} else if (arr[i] > k) {
				return i;
			}
		}
		return -1;
	}

	// optimized - O(log n)
	public static int findInsertion2(int[] arr, int k) {

		// binary search

		int lo = 0;
		int hi = arr.length - 1;
		int mid = 0;

		while (lo <= hi) {
			mid = (lo + hi) / 2;
			if (arr[mid] == k) {
				return mid;
			} else if (arr[mid] < k) {
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}
		}
		return lo;
	}
}
