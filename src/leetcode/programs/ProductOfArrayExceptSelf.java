package leetcode.programs;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		int res[] = productExceptSelf(arr);
		
//		for(int e: res) {
//			System.out.print(e + " ");
//		}
		
		System.out.println(Arrays.toString(res));
	}

	public static int[] productExceptSelf(int[] nums) {
		int res[] = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			int prod = 1;
			for (int j = 0; j < nums.length; j++) {
				if (j != i) {
					prod *= nums[j];
				}
//				if (j == i) {
//					continue;
//				}
//				prod *= nums[j];
			}
			res[i] = prod;
		}
		return res;
	}

}
