package leetcode.programs;

public class SecondLargest {

	public static void main(String[] args) {

		int arr[] = { 12, 35, 1, 10, 34, 1 };

//		int max = arr[0];
//
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] > max) {
//				max = arr[i];
//			}
//		}
//
//		int secMax = arr[0];
//
//		for (int i = 0; i < arr.length; i++) {
//			if ((arr[i] > secMax)&&(arr[i] < max)) {
//				secMax = arr[i];
//			}
//		}
//
//		System.out.println("Max - " + max);
//		System.out.println("Second Largest Number - " + secMax);

		int res = secondMax(arr);
		System.out.println(res);
	}

	public static int secondMax(int arr[]) {
		int max = Integer.MIN_VALUE;	// arr[0]
		int secondMax = Integer.MIN_VALUE;	// -1
		
//		int max = -1;
//		int secondMax = -1;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			} else if(arr[i]>secondMax && arr[i]<max) {
				secondMax = arr[i];
			}
		}
		
		return secondMax;
	}

}
