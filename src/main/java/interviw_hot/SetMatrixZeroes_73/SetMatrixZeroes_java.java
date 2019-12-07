package interviw_hot.SetMatrixZeroes_73;

public class SetMatrixZeroes_java {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        boolean iscol = false;
        for(int i = 0; i < row; ++i){
            if(matrix[i][0] == 0)
                iscol = true;
            for(int j = 1; j < col; ++j){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(int i = 1; i < row; ++i){
            if(matrix[i][0] == 0){
                for(int j = 1; j < col; ++j )
                    matrix[i][j] = 0;
            }
        }
        for(int i = 1; i < col; ++i){
            if(matrix[0][i] == 0){
                for(int j = 1; j < row; ++j)
                    matrix[j][i] = 0;
            }
        }
        if(matrix[0][0] == 0){
            for(int i = 1; i < col; ++i)
                matrix[0][i] = 0;
        }
        if(iscol){
            for(int i = 0; i < row; ++i)
                matrix[i][0] = 0;
        }
    }
}
