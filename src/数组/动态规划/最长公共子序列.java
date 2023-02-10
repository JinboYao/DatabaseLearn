package src.数组.动态规划;

public class 最长公共子序列 {
    //长度+字符串
    public String LCS (String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n + 1][m + 1];
        String[][] dp2=new String[n + 1][m + 1];
        for (int i = 0; i<=n; i++) {
            dp[i][0] = 0;
            dp2[i][0] ="";
        }
        for (int j = 0; j<=m; j++) {
            dp[0][j] = 0;
            dp2[0][j]="";
        }
        int res=0;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i-1)== s2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                    dp2[i][j]=dp2[i-1][j-1]+s1.charAt(i-1);
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                    dp2[i][j]=dp2[i][j-1].length()>dp2[i - 1][j].length()?dp2[i][j-1]:dp2[i - 1][j];
                }
                res=Math.max(dp[i][j],res);
            }
        }
        return dp2[n][m].length()==0?"-1":dp2[n][m];
    }
}
