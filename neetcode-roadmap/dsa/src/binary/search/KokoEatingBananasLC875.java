package binary.search;

import java.util.Arrays;

public class KokoEatingBananasLC875 {

    public static int minEatingSpeed(int[] piles, int h){
        int max = Arrays.stream(piles).max().getAsInt();
        int min = 1;
        int k = -1;
        while(min <= max){
            int mid = (max+min)/2;
            long hoursTaken = 0l;
            for(int n:piles){
                hoursTaken += (n+mid-1)/mid;
            }
            if(hoursTaken <= h){
                k = mid;
                max=mid-1;
            }
            else
                min=mid+1;
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(minEatingSpeed(new int[]{30,11,23,4,20},5));
    }
}
