package interviw_hot.NumberOf1Bits_191;

public class NumberOf1Bits_java {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res = 0;
        for(int i = 0; i < 32; ++i){
            if((n & 1) == 1){
                ++res;
            }
            n >>= 1;
        }
        return res;
    }
}
