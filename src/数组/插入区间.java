package src.数组;

import java.util.ArrayList;

public class 插入区间 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> list=new ArrayList<>();
        // Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int n=intervals.length,i=0;
        int left=newInterval[0];
        int right=newInterval[1];
        while(i<n&&intervals[i][1]<newInterval[0]){//不重叠
            list.add(intervals[i++]);
        }
        while(i<n&&intervals[i][0]<=newInterval[1]){//重叠部分
            left=Math.min(intervals[i][0],left);
            right=Math.max(intervals[i++][1],right);
        }
        list.add(new int[]{left,right});
        while(i<n){
            list.add(intervals[i++]);
        }
        return list.toArray(new int[list.size()][]);
    }
}
