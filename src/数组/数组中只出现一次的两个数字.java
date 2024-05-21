package src.数组;
import java.util.*;


public class 数组中只出现一次的两个数字 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param array int整型一维数组
     * @return int整型一维数组
     */
    public int[] FindNumsAppearOnce (int[] array) {
        // write code here
        int[] list=new int[2];
        int index=0;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int n=array.length;
        for(int i=0;i<n;i++){
            int count =map.getOrDefault(array[i],0)+1;
            map.put(array[i],count);
        }
        for(int k:map.keySet()){
            if(map.get(k)==1){
                list[index++]=k;
            }
        }
        return list;
    }
}