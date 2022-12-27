package src.字符串;

public class 大数加法 {
    public String solve (String s, String t) {
        int n=s.length();
        int m=t.length();
        int c=0;
        StringBuffer str=new StringBuffer();
        for(int i=n-1,j=m-1;i>=0||j>=0||c!=0;i--,j--){
            int n1=(i>=0?s.charAt(i):'0')-'0';
            int n2=(j>=0?t.charAt(j):'0')-'0';
            int res=n1+n2+c;
            c=res/10;
            str.append(res%10);
        }
        return str.reverse().toString();
    }
}
