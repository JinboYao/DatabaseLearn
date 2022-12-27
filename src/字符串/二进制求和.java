package src.字符串;

public class 二进制求和 {
    public String binaryAdd (String A, String B) {
        // write code here
        int n=A.length();
        int m=B.length();
        int c=0;//进位
        StringBuffer s=new StringBuffer();
        int res=0;
        for(int i=n-1,j=m-1;i>=0||j>=0||c!=0;i--,j--){
            int n1=(i>=0?A.charAt(i):'0')-'0';
            int n2=(j>=0?B.charAt(j):'0')-'0';
            res=n1+n2+c;
            s.append(res%2);
            c=res/2;
        }
        return s.reverse().toString();
    }
}
