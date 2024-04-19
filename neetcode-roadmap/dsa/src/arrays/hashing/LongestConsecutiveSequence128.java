package arrays.hashing;

import java.util.HashSet;
public class LongestConsecutiveSequence128 {
    public static int longestConsecutive(int[] nums) {
        if(nums.length == 0 || nums.length == 1){
            return nums.length;
        }
        HashSet<Integer> set = new HashSet<>();
        int maxValue = Integer.MIN_VALUE;
        for(int n:nums){
            set.add(n);
            maxValue = Math.max(maxValue,n);
        }
        int count = 1;
        int ans = 1;
        for(Integer it:set){
            if(!set.contains(it-1)){
                int nextVal = it+1;
                if(set.contains(nextVal)){
                    count = 1;
                    while(set.contains(nextVal)){
                        count++;
                        nextVal++;
                    }
                    ans = Math.max(count,ans);
                }else{
                    count = 1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int[] nums = {100,4,200,1,3,2};

        System.out.println(longestConsecutive(nums));
    }
}
