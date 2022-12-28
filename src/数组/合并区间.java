package src.数组;

import java.util.ArrayList;
import java.util.Arrays;

public class 合并区间 {
    public int[][] merge(int[][] intervals) {
        if(intervals.length==0||intervals.length==1) return intervals;
        ArrayList<int[]> list=new ArrayList();
        Arrays.sort(intervals,(a, b)->a[0]-b[0]);
        int left=intervals[0][0];
        int right=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=right){//能够合并时
                left=Math.min(left,intervals[i][0]);
                right=Math.max(intervals[i][1],right);
            }
            else{
                list.add(new int[]{left,right});
                left=intervals[i][0];
                right=intervals[i][1];
            }
            if(i==intervals.length-1){
                list.add(new int[]{left,right});
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
