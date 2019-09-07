package hot_100.SearchA2DMatrixII;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class SearchA2DMatrixII_java {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowNum=matrix.length;
        if(rowNum==0)
            return false;
        int colNum=matrix[0].length;
        if(colNum==0)
            return false;
        List<Integer> row=new ArrayList<>();
        for(int i=0 ;i<rowNum;++i) {
            if(matrix[i][0]==target|| matrix[i][colNum - 1]==target)
                return true;
            else if (matrix[i][0] <= target && matrix[i][colNum - 1] >= target)
                row.add(i);
        }
        for(int i=0;i<row.toArray().length;++i)
        {
            if(binarySearch(matrix[row.get(i)],target))
                return true;
        }
        return false;
    }

    public boolean binarySearch(int[] arr,int target)
    {
        int head=0;
        int tail=arr.length-1;
        while(head<=tail)
        {
            int middle=(head+tail)/2;
            if(arr[middle]==target)
                return true;
            else if(arr[middle]>target)
                tail=middle-1;
            else
                head=middle+1;
        }
        return false;
    }

   /*
   对题目意思理解有点偏差,写了一个耗时的解法. 记录一下一个O(n+m)的解法
   从最右上角的元素开始找，如果这个元素比target大，则说明找更小的，往左走；如果这个元素比target小，则说明应该找更大的，往下走。
   总之就是从右上角开始找，如果矩阵的元素小了就往下走，如果矩阵元素大了就往左走。如果某个时刻相等了，就说明找到了，如果一直走出矩阵边界了还没找到，则说明不存在。
    */

    public boolean searchMatrix1(int[][] matrix, int target) {
        if(matrix == null || matrix.length < 1 || matrix[0].length < 1){
            return false;
        }
        //起点为最右上角的元素
        int row = 0, col = matrix[0].length - 1;
        //判断当前数组元素和target，如果当前大于target，往左走；小与target，往下走
        while(row < matrix.length && col >= 0){
            if(matrix[row][col] < target){
                row++;
            }else if(matrix[row][col] > target){
                col--;
            }else{
                return true;
            }
        }
        //走出边界了还没找到，说明不存在，返回false
        return false;
    }

}
