package two.pointers;

public class TrappingRainWaterLC42 {

    public static int trap(int[] height) {
        int start = 0;
        int end = height.length-1;
        int leftTall = height[start];
        int rightTall = height[end];
        int water = 0;

        while(start < end){
            if(leftTall < rightTall){
                start++;
                leftTall = Math.max(leftTall,height[start]);
                water += leftTall - height[start];
            }else{
                end--;
                rightTall = Math.max(rightTall,height[end]);
                water += rightTall - height[end];
            }
        }

        return water;
    }

    public static void main(String[] args) {
        System.out.println(trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}
