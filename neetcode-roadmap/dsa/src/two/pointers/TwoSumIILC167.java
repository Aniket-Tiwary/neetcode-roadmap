package two.pointers;

import java.util.Arrays;

public class TwoSumIILC167 {

    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int i = 0;
        int k = numbers.length-1;
        while(i<k){
            if(numbers[i] + numbers[k] == target){
                result[0] = i+1;
                result[1] = k+1;
                return result;
            }
            else if(numbers[i]+numbers[k] >= target){
                k--;
            }else if(numbers[i]+numbers[k] < target){
                i++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
          int[] numbers = new int[]{5,25,75};
          Arrays.stream(twoSum(numbers,100)).forEach(n -> System.out.print(n + " "));
    }
}
