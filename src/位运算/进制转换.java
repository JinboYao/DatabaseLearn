package src.位运算;

public class 进制转换 {
    public String solve (int M, int N) {
        // write code here
        char[] arr={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        StringBuffer str=new StringBuffer();
        int flag=1;
        if(M<0){ flag=0;M=-M;}
        while(M>0){
            str.append(arr[M%N]);
            M=M/N;
        }
        if(flag==0){str.append('-');}
        return str.reverse().toString();
    }
}
