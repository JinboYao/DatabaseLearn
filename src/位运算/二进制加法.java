package src.位运算;

public class 二进制加法 {
    public int add(int a, int b) {
        while(b!=0){
            int carry=(a&b)<<1;//循环计算和+进位，直到进位为0
            a=a^b;//计算和（无进位）
            b=carry;//进位
        }
        return a;
    }
}
