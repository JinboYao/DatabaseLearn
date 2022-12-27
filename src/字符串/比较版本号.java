package src.字符串;

public class 比较版本号 {
    public int compare (String version1, String version2) {
        // write code here
        String[] v1=version1.split("\\.");
        String[] v2=version2.split("\\.");
        int n=v1.length,m=v2.length;
        for(int i=0,j=0;i<n||j<m;i++,j++){
            int x=Integer.parseInt(i<n?v1[i]:"0");
            int y=Integer.parseInt(j<m?v2[j]:"0");
            if(x>y) return 1;
            if(x<y) return -1;
        }
        return 0;
    }
}
