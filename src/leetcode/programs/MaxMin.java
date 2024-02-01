package leetcode.programs;

public class MaxMin {

	public static void main(String[] args) {
		// find sum of max and min in given array
		int A[] = { -2, 1, -4, 5, 3 };
		int N = A.length;

		int res = findSum(A, N);
		System.out.println(res);
	}

	// optimized
	public static int findSum(int A[], int N) {
		// code here
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < N; i++) {
			if (A[i] > max) {
				max = A[i];
			}
			if (A[i] < min) {
				min = A[i];
			}
		}

		return max + min;
	}
}
