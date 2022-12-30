package src.数组;

public class 除自身以外的乘积 {
    public int[] constructArr(int[] a) {
        if(a.length==0) return a;
        int[] right=new int[a.length];
        int[] left=new int[a.length];
        left[0]=a[0];
        right[a.length-1]=a[a.length-1];
        for(int i=1;i<a.length;i++){
            left[i]=left[i-1]*a[i];
        }
        for(int j=a.length-2;j>=0;j--){
            right[j]=right[j+1]*a[j];
        }
        for(int i=0;i<a.length;i++){
            if(i==0){a[i]=right[1];}
            else if(i==a.length-1){a[i]=left[i-1];}
            else{ a[i]=left[i-1]*right[i+1];}
        }
        return a;
    }
}
