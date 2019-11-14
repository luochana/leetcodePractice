package tencent.PowerOfTwo_231;

public class PowerOfTwo_java {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
