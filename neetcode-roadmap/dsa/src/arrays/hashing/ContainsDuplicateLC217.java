package arrays.hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 Given an integer array nums,
 return true if any value appears at least twice in the array,
 and return false if every element is distinct.
 **/
public class ContainsDuplicateLC217 {
    // Solution 1 - O(1) space but O(n log n) time
    public static boolean containsDuplicate(int[] nums){
        if(nums.length == 1)
            return false;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1])
                return true;
        }
        return false;
    }
    //  Solution 2 - 0(n) space and 0(n) time complexity
    public static boolean containsDuplicateSet(int[] nums){
        if(nums.length == 1)
            return false;
        Set<Integer> duplicates = new HashSet<>();
        for(int num:nums){
            if(duplicates.contains(num))
                return true;
            duplicates.add(num);
        }
        return false;
    }

    public static void main(String[] args){
        int[] nums1 = new int[]{1,2,3,1}; // true
        int[] nums2 = new int[]{1,2,3,4}; // false
        int[] nums3 = new int[]{1,1,1,3,3,4}; // true
        System.out.println(Arrays.toString(nums1) + " contains duplicate " + containsDuplicate(nums1));
        System.out.println(Arrays.toString(nums2) + " contains duplicate " + containsDuplicate(nums2));
        System.out.println(Arrays.toString(nums3) + " contains duplicate " + containsDuplicate(nums3));
    }
}

