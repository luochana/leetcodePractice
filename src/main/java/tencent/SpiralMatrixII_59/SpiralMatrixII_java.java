package tencent.SpiralMatrixII_59;

//很直的解法
public class SpiralMatrixII_java {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int flag=1,i=0,j=0,direction=1;
        while(flag<=n*n){
            if(direction==1){
                while (j<n && res[i][j]==0){
                    res[i][j++]=flag++;
                }
                j--;
                i++;
                direction=2;
            }
            if(direction==2){
                while (i<n && res[i][j]==0){
                    res[i++][j]=flag++;
                }
                i--;
                j--;
                direction=3;
            }
            if(direction==3){
                while (j>=0 && res[i][j]==0){
                    res[i][j--]=flag++;
                }
                j++;
                i--;
                direction=4;
            }
            if(direction==4){
                while (i>=0 && res[i][j]==0){
                    res[i--][j]=flag++;
                }
                i++;
                j++;
                direction=1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        SpiralMatrixII_java aa = new SpiralMatrixII_java();
        aa.generateMatrix(3);
    }
}
