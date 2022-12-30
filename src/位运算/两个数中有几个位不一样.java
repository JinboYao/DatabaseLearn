package src.位运算;

public class 两个数中有几个位不一样 {
    public int countBitDiff (int m, int n) {
        int res=0;
        int c=m^n;//求不一样的1
        while(c>0){//二进制中1的个数
            res+=c&1;
            c>>=1;
        }
        return res;
    }
}
