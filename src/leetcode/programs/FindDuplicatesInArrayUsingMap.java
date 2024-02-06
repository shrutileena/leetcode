package leetcode.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicatesInArrayUsingMap {

	public static void main(String[] args) {
		
		int[] arr1 = {2,3,1,2,3};
		int[] arr2 = {0,3,1,2};
		
		List<Integer> res = findDuplicates(arr1);
		List<Integer> res2 = findDuplicates(arr2);
		
		System.out.println(res);
		System.out.println(res2);
	}

	public static List<Integer> findDuplicates(int arr[]) {
		
		Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        List<Integer> res = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++){
            if(countMap.containsKey(arr[i])){
                countMap.put(arr[i], countMap.get(arr[i])+1);
            } else {
                countMap.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> e: countMap.entrySet()){
            if(e.getValue() > 1){
                res.add(e.getKey());
            }
        }
        if(res.isEmpty()){
            res.add(-1); 
        }
        return res;
	}
}
