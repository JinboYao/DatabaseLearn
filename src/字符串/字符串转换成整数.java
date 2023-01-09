package src.字符串;

public class 字符串转换成整数 {
    public int strToInt(String str) {
        String s=str.trim();
        int n=s.length(),flag=1,res=0;
        for(int i=0;i<n;i++){
            if(i==0&&s.charAt(0)=='-'){
                flag=-1;
            }
            else if(i==0&&s.charAt(0)=='+'){
                continue;
            }
            else if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                int x=s.charAt(i)-'0';
                if(flag==1&&((res>Integer.MAX_VALUE/10)||(res==Integer.MAX_VALUE/10&&x>=Integer.MAX_VALUE%10))) return Integer.MAX_VALUE;
                else if(flag==-1&&((res>Integer.MAX_VALUE/10)||(res==Integer.MAX_VALUE/10&&x>=Integer.MAX_VALUE%10+1))) return Integer.MIN_VALUE;
                else res=res*10+x;
            }else{
                break;
            }
        }
        return flag*res;
    }
}
