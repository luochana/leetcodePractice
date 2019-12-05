package interviw_hot.ValidSudoku_36;

import java.util.HashSet;

public class ValidSudoku_java {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<String>();
        for(int i = 0; i < 9; ++i){
            for(int j = 0; j < 9; ++j){
                if(board[i][j] != '.' && set.contains(String.valueOf(board[i][j])))
                    return false;
                set.add(String.valueOf(board[i][j]));
            }
            set.clear();
        }

        for(int i = 0; i < 9; ++i){
            for(int j = 0; j < 9; ++j){
                if(board[j][i] != '.' && set.contains(String.valueOf(board[j][i])))
                    return false;
                set.add(String.valueOf(board[j][i]));
            }
            set.clear();
        }

        for(int i = 0; i < 9; ){
            for(int j = 0; j < 9; ){
                for(int p = i; p < i + 3; ++p){
                    for(int q = j; q < j + 3; ++q){
                        if(board[p][q] != '.' && set.contains(String.valueOf(board[p][q])))
                            return false;
                        set.add(String.valueOf(board[p][q]));
                    }
                }
                set.clear();
                j +=3;
            }
            i += 3;
        }
        return true;
    }
}
