package arrays.hashing;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumLC1 {

    public static int[] twoSum(int[] nums,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i]))
                return new int[]{i,map.get(target-nums[i])};
            map.put(nums[i],i);
        }
        return new int[]{};
    }
    public static void main(String args[]){
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
}
