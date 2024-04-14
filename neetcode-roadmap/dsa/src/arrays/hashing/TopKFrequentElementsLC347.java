package arrays.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TopKFrequentElementsLC347 {

    public static int[] topKFrequent(int[] nums,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        List<Integer>[] bucket = new ArrayList[nums.length+1];
        for(int n:map.keySet()){
            int occ = map.get(n);
            if(bucket[occ] == null){
                bucket[occ] = new ArrayList<>();
            }
            bucket[occ].add(n);
        }

        int[] res = new int[k];
        int j = 0;
        for(int i=bucket.length-1;i>=0;i--){
            if(bucket[i]!=null){
                for(int n:bucket[i]){
                    res[j++] = n;
                    if(j==k) return res;
                }
            }
        }
        return res;
    }
    public static void main(String args[]){
        int[] nums = new int[]{1,1,1,2,2,3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums,k)));
    }
}
