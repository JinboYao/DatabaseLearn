package src.数组.动态规划;

public class 最长回文子串 {
    public int getLongestPalindrome(String A, int n) {
        // write code here
        int num=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<=n;j++){
                String s=A.substring(i,j);
                //if(fun(s)){
                if(isPalindrome(s)){
                    num=Math.max(s.length(),num);
                }
            }
        }
        return num;
    }
    public boolean isPalindrome(String s){
        int l = s.length();
        for(int i = 0; i < l/2; i++){
            if(s.charAt(i) != s.charAt(l-i-1))//不相等
                return false;
        }
        return true;
    }
}
