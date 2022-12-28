package src.数组;

public class 调整数组顺序使奇数位于偶数前面 {
    //解法一：时间复杂度 O(n)O(n)，空间复杂度 O(n)O(n)
    public int[] reOrderArray (int[] array) {
        // write code here
        int[] res=new int[array.length];
        int x=0,y=array.length-1;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==1){
                res[x++]=array[i];
            }
        }
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                res[x++]=array[i];
            }
        }
        return res;
    }
    //解法二：
}
