package leetcode.programs;

public class MissingNumber {
	
	// optimized
	public static void main(String[] args) {

		int[] nums = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };

		int len = nums.length;
		int sum = (len * (len + 1)) / 2;
		int actSum = 0;

		for (int i = 0; i < len; i++) {
			actSum += nums[i];
		}

		System.out.println("Missing Number - " + (sum - actSum));
	}

}
