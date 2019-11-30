package interviw_hot.GameOfLife_289;


// 2: 1->0  3: 0->1
public class GameOfLife_java {
    public void gameOfLife(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                check(board,i,j);
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j] == 2)
                    board[i][j] = 0;
                if (board[i][j] == 3)
                    board[i][j] = 1;
            }
        }
    }

    public void check(int[][] board,int i,int j){
        int start_i = i - 1 < 0 ? 0 : i - 1;
        int start_j = j - 1 < 0 ? 0 : j - 1;
        int end_i = i + 1 > board.length - 1 ? board.length - 1 : i + 1;
        int end_j = j + 1 > board[0].length - 1 ? board[0].length - 1 : j + 1;

        int sum_1 = 0;
        for (int p = start_i; p <= end_i; p++) {
            for (int q = start_j; q <= end_j; q++) {
                if(board[p][q] == 1 || board[p][q] == 2)
                    ++sum_1;
            }
        }

        if(board[i][j] == 1 || board[i][j] == 2)
            --sum_1;
        if((board[i][j] == 1 || board[i][j]==2) && sum_1 < 2)
            board[i][j] = board[i][j] == 0 ? 0 : 2;        //1->0
        else if((board[i][j] == 1 || board[i][j]==2) && (sum_1 == 2 || sum_1 ==3))
            board[i][j] = board[i][j];// == 1 ? 1 : 3;        //0->1
        else if((board[i][j] == 1 || board[i][j]==2) && sum_1 > 3)
            board[i][j] = board[i][j] == 0 ? 0 : 2;
        else if((board[i][j] == 0 || board[i][j] == 3) && sum_1 == 3)
            board[i][j] = board[i][j] == 1 ? 1 : 3;
    }

    public static void main(String[] args) {
        GameOfLife_java aaa = new GameOfLife_java();
        int[][] b = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        aaa.gameOfLife(b);
    }
}
