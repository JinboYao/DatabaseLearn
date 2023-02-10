package src.数组.动态规划;

public class 最长上升子序列 {
    public int LIS (int[] arr) {
        int n=arr.length;
        if(n==1) return 1;
        int[] dp=new int[n];
        for(int i=0;i<n;i++){
            dp[i]=1;
        }
        int res=0;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i]&&dp[i]<dp[j]+1){
                    dp[i]=dp[j]+1;
                    res=Math.max(res,dp[i]);
                }
            }
        }
        return res;
    }
}
