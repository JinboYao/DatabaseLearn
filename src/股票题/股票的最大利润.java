package src.股票题;

public class 股票的最大利润 {
    //解法一
    public int maxProfit1(int[] prices) {
        int minProfit=Integer.MAX_VALUE;
        int n=prices.length;
        int res=0;
        for(int i=0;i<n;i++){
            if(prices[i]<minProfit){
                minProfit=prices[i];
            }else if(prices[i]-minProfit>res){
                res=prices[i]-minProfit;
            }
        }
        return Math.max(res,0);
    }
    //暴力解法
    public int maxProfit(int[] prices) {
        int n=prices.length,res=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                res=Math.max(prices[j]-prices[i],res);
            }
        }
        return res;
    }
}