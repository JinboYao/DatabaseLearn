package src.位运算;

public class 二进制中1的个数 {
    public static  void main(String[] args){
    }
    public int hammingWeight(int n) {
        int res=0;
        while(n!=0){
            res+=n&1;
            n>>>=1;
        }
        return res;
    }
}
