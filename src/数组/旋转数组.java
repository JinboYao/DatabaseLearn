package src.数组;

public class 旋转数组 {
    public int[] solve (int n, int m, int[] a) {
        // write code here
        m%=n;
        reverse(0,n-1,a);
        reverse(0,m-1,a);
        reverse(m,n-1,a);
        return a;
    }
    public int[] reverse(int i,int j,int[] a){
        while(i<=j){
            int tmp=a[i];
            a[i]=a[j];
            a[j]=tmp;
            i++;
            j--;
        }
        return a;
    }
}
