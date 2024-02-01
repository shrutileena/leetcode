package leetcode.programs;

public class CheckIfArrayIsSorted {

	public static void main(String[] args) {
		
		int arr[] = {10, 20, 30, 40, 50};
		int arr1[] = {10, 20, 30, 50, 40};
		
		boolean res = arraySortedOrNot(arr, arr.length);
		boolean res2 = arraySortedOrNot(arr1, arr1.length);
		System.out.println(res);
		System.out.println(res2);
	}
	
	// optimized
	public static boolean arraySortedOrNot(int[] arr, int n) {
        // code here
        boolean isSorted = true;
        
        for(int i=1; i<n; i++){
            if(arr[i]<arr[i-1])
                isSorted = false;
        }
        
        return isSorted;
    }
}
