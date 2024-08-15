package binary.search;

public class BinarySearchLC704 {

    public static int search(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        while (left <= right){
            int mid = (left+right)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                left++;
            else
                right--;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{4,9,10,45,60},45));
    }
}
