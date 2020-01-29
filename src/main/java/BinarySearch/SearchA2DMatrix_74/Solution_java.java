package BinarySearch.SearchA2DMatrix_74;

public class Solution_java {

    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0)
            return false;
        int left = 0, right = matrix.length * matrix[0].length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            int y = mid % matrix[0].length;
            int x = mid / matrix[0].length;
            if(matrix[x][y] == target){
                return true;
            }
            if(target < matrix[x][y]){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return false;
    }
}
