package leetcode.programs;

public class FloorCeil {

	public static void main(String[] args) {

		// sorted
		int[] arr = { 1, 2, 8, 10, 11, 12, 19 };

		int x = 13;

		// floor
		findFloorBrute(arr, x);

		findFloorBinarySearch(arr, x);

		ceilBrute(arr, x);

		ceilBinary(arr, x);

	}

	private static void ceilBinary(int[] arr, int x) {

		int lo = 0, hi = arr.length - 1;
		int mid = 0;
		int res = -1;
		while (lo <= hi) {
			mid = (lo + hi) / 2;

			if (arr[mid] < x) {
				lo = mid + 1;
			} else if (arr[mid] > x) {
				res = arr[mid];
				hi = mid - 1;
			}
		}
		System.out.println(res);
	}

	private static void ceilBrute(int[] arr, int x) {

		int ceil = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > x && arr[i] < ceil) {
				ceil = arr[i];
			}
		}
		System.out.println(ceil);
	}

	private static void findFloorBinarySearch(int[] arr, int x) {

		int lo = 0, hi = arr.length;
		int mid = 0;
		int res = -1;
		while (lo <= hi) {
			mid = (lo + hi) / 2;

			if (arr[mid] < x) {
				res = arr[mid];
				lo = mid + 1;
			} else if (arr[mid] > x) {
				hi = mid - 1;
			}
		}
		System.out.println(res);
	}

	private static void findFloorBrute(int[] arr, int x) {

		int floor = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < x && floor < arr[i]) {
				floor = arr[i];
			}
		}
		System.out.println(floor);
	}

}
