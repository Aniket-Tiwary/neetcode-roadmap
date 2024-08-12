package two.pointers;

public class ContainerWithMostWaterLC11 {

    public static int maxArea(int[] height) {
        int result = 0;
        int j = height.length-1;
        int i = 0;
        while(i<j){
            int waterStorage = (j-i)*Math.min(height[j],height[i]);
            result = Math.max(result,waterStorage);
            if(height[i]<=height[j])
                i++;
            else
                j--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
