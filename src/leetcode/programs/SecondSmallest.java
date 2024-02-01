package leetcode.programs;

public class SecondSmallest {

	public static void main(String[] args) {

//		int arr[] = { 12, 35, 1, 10, 34, 1 };
		int arr1[] = { 5, 7, 8, 7, 5, 2, 9, 7, 6, 11, 10, 3, 1 };

//		secondSmallest(arr);
		secondSmallest(arr1);

	}

	public static void secondSmallest(int[] arr) {

		int min = Integer.MAX_VALUE;
		int secMin = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			} else if (arr[i] > min && arr[i] < secMin) {
				secMin = arr[i];
			}
		}

		System.out.println(secMin);
	}

}
