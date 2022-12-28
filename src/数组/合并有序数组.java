package src.数组;

public class 合并有序数组 {
    public void merge(int A[], int m, int B[], int n) {
        int i=m-1,j=n-1,x=m+n-1;
        while(i>=0&&j>=0){
            if(A[i]>=B[j]){
                A[x]=A[i];
                i--;
            }
            else{
                A[x]=B[j];
                j--;
            }
            x--;
        }
        while(j>=0){
            A[x]=B[j];
            j--;
            x--;
        }
        while(i>=0){
            A[x]=A[i];
            i--;
            x--;
        }
    }
}
