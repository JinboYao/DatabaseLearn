package src.数组;

import java.util.HashMap;

public class 最长无重复子数组 {
    public int maxLength (int[] arr) {
        // write code here
        int res=0,n=arr.length,start=-1;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                start=Math.max(map.get(arr[i]),start);
            }
            map.put(arr[i],i);
            res=Math.max(res,i-start);
        }
        return res;
    }
}