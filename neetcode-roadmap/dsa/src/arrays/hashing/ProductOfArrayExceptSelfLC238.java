package arrays.hashing;

import java.util.Arrays;

public class ProductOfArrayExceptSelfLC238 {

    public static int[] productExceptSelf(int[] nums){
        int zeroCnt = 0;
        int total = 1;
        for(int n:nums){
            if(n == 0){
                zeroCnt += 1;
            }else{
                total *= n;
            }
        }
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(zeroCnt > 0){
                if(nums[i] == 0)
                    res[i] = zeroCnt > 1 ? 0 : total;
                else
                    res[i] = 0;
            }else{
                res[i] = (int) total/nums[i];
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] nums = new int[]{-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
