package tencent.SpiralMatrix_54;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix_java {
    public List<Integer> spiralOrder(int[][] matrix) {

        ArrayList<Integer> res = new ArrayList<>();

        int m=matrix.length;
        if(m==0)
            return res;
        int n=matrix[0].length;
        int flag=0,i=0,j=0;
        int[][] ints = new int[m][n];

        while(flag<n*m){
            while (j<n && ints[i][j]==0){
                ints[i][j]=1;
                res.add(matrix[i][j++]);
                flag++;
            }
            j--;
            i++;

            while (i<m && ints[i][j]==0){
                ints[i][j]=1;
                res.add(matrix[i++][j]);
                flag++;
            }
            i--;
            j--;

            while (j>=0 && ints[i][j]==0){
                ints[i][j]=1;
                res.add(matrix[i][j--]);
                flag++;
            }
            j++;
            i--;

            while (i>=0 && ints[i][j]==0){
                ints[i][j]=1;
                res.add(matrix[i--][j]);
                flag++;
            }
            i++;
            j++;
        }

        return res;
    }
}
