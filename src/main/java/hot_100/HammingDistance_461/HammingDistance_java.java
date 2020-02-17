package hot_100.HammingDistance_461;

public class HammingDistance_java {
    public int hammingDistance(int x, int y) {
        //bitCount 数出整数二进制下 1 的个数
        //1^0 = 1 ,0^1 =1 ,0^0 = 0 ,1^1 = 0
        return Integer.bitCount(x^y);
    }
}
