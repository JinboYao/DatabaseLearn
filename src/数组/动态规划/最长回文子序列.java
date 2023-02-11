package src.数组.动态规划;

public class 最长回文子序列 {
    public int longestPalindromeSubSeq (String s) {
        // write code here
        int n=s.length();
        int[][] dp=new int[n+1][n+1];
        for(int i=0;i<=n;i++){
            dp[0][i]=0;
            dp[i][0]=0;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(s.charAt(i-1)==s.charAt(n-j)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][n];
    }
}
