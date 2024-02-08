package leetcode.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheDifferenceOfTwoArrays {
	public static void main(String[] args) {
		int[] nums1 = {1,2,3};
		int[] nums2 = {2,4,6};
	
        Set<Integer> l1 = new HashSet<Integer>();
        Set<Integer> l2 = new HashSet<Integer>();
        for(int i=0; i<nums1.length; i++) {
        	l1.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++) {
        	l2.add(nums2[i]);
        }
        
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> contains1 = new ArrayList<Integer>();
        List<Integer> contains2 = new ArrayList<Integer>();
        
        for(Integer l: l1){
            if(l2.contains(l)) {
            	contains1.add(l);
            }
        }
        
        for(Integer l: l2){
            if(l1.contains(l)) {
            	contains2.add(l);
            }
        }
        
        for(Integer c : contains1) {
        	l1.remove(c);
        }
        for(Integer c : contains2) {
        	l2.remove(c);
        }
        
        List<Integer> list1 = new ArrayList<Integer>(l1);
        List<Integer> list2 = new ArrayList<Integer>(l2);
        
        res.add(list1);
        res.add(list2);
        
        System.out.println(res);
	}


}