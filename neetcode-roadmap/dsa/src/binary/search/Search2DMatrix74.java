package binary.search;

public class Search2DMatrix74 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int top = 0;
        int bottom = matrix.length-1;
        int n = matrix[0].length-1;
        while(top <= bottom){
            int mid = (top+bottom)/2;
            if(matrix[mid][0] <= target && matrix[mid][n] >= target){
                int left = 0;
                int right = n;
                while(left <= right){
                    int m = (left+right)/2;
                    if(matrix[mid][m] == target)
                        return true;
                    else if(matrix[mid][m] < target)
                        left++;
                    else
                        right--;
                }
                return false;
            }else if(matrix[mid][0] > target){
                bottom--;
            }else{
                top++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(matrix,20));
    }
}
