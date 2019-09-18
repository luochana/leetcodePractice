package hot_100.NumberOfIslands;

//dfs. java提交中击败96%
public class NumberOfIslands_java {
    int res=0;
    public int numIslands(char[][] grid) {
        int colNum=grid.length;
        if(colNum==0)
            return 0;
        int rowNum=grid[0].length;
        if(rowNum==0)
            return 0;
        int[][] flags=new int[colNum][rowNum];
        for(int i=0;i<colNum;++i)
            for(int j=0;j<rowNum;++j) {
                if(dfs(i, j,grid,flags)) {
                    ++res;
                }
            }
        return res;
    }
    public boolean dfs(int col,int row,char[][] grid,int[][] flags)
    {
        if(flags[col][row]==1||grid[col][row]=='0')
            return false;
        flags[col][row]=1;
        if(col-1>=0&&flags[col-1][row]==0&&grid[col-1][row]=='1')
            dfs(col-1,row,grid,flags);
        if(col+1<grid.length&&flags[col+1][row]==0&&grid[col+1][row]=='1')
            dfs(col+1,row,grid,flags);
        if(row-1>=0&&flags[col][row-1]==0&&grid[col][row-1]=='1')
            dfs(col,row-1,grid,flags);
        if(row+1<grid[0].length&&flags[col][row+1]==0&&grid[col][row+1]=='1')
            dfs(col,row+1,grid,flags);
        return true;
    }

    public static void main(String[] args) {
        NumberOfIslands_java a=new NumberOfIslands_java();
        char[][] b={ {'1', '1', '1', '1', '0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        System.out.println(a.numIslands(b));
    }
}
