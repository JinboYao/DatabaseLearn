package src.位运算;

public class two的幂 {
    public boolean isPowerOfTwo(int n) {
        return n>0&&(n&(n-1))==0;
    }
}
