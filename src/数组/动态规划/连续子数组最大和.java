package src.数组.动态规划;

import java.util.Arrays;

public class 连续子数组最大和 {
    //解法一
    public int FindGreatestSumOfSubArray(int[] array){
        int n=array.length,res=array[0];
        for(int i=0;i<n;i++){
            int tmp=array[i],re=array[i];
            for(int j=i+1;j<n;j++){
                re=re+array[j];
                tmp=Math.max(tmp,re);
            }
            res=Math.max(tmp,res);
        }
        return res;
    }
    //解法二
    public int FindGreatestSumOfSubArray02(int[] array){
        int n=array.length,res=array[0],tmp=array[0];
        for(int i=1;i<n;i++){
            if(res+array[i]<array[i]){
                res=array[i];
            }else{
                res+=array[i];
            }
            tmp=Math.max(tmp,res);
        }
        return tmp;
    }
    //求出数组
    //    输入：[1,-2,3,10,-4,7,2,-5]
    //    返回值：[3,10,-4,7,2]
    public int[] FindGreatestSumOfSubArray (int[] array) {
        // write code here
        int n=array.length;
        int res=array[0],tmp=array[0],start=0,end=1;
        int[] dp=new int[n];
        dp[0]=0;
        for(int i=1;i<n;i++){
            if(res+array[i]<array[i]){
                res=array[i];
                dp[i]=0;
            }else{
                res+=array[i];
                dp[i]=dp[i-1]+1;
            }
            if(tmp<=res){
                tmp=res;
                start=i-dp[i];
                end=i+1;
            }
        }
        return Arrays.copyOfRange(array,start,end);
    }
    //解法二
    public int[] FindGreatestSumOfSubArray (int[] array) {
        // write code here
        int n=array.length;
        int res=array[0],tmp=array[0],start=0,end=1,gap=0;
        for(int i=1;i<n;i++){
            if(res+array[i]<array[i]){
                res=array[i];
                gap=0;
            }else{
                res+=array[i];
                gap+=1;
            }
            if(tmp<=res){
                tmp=res;
                start=i-gap;
                end=i+1;
            }
        }
        return Arrays.copyOfRange(array,start,end);
    }
}
