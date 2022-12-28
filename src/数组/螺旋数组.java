package src.数组;

import java.util.ArrayList;

public class 螺旋数组 {
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        if(matrix.length == 0) {
            return list;
        }
        int n=matrix.length,m=matrix[0].length;
        int left=0,right=m-1,buttom=n-1,top=0;
        while(buttom>=top&&left<=right){
            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            for(int j=top+1;j<=buttom;j++){
                list.add(matrix[j][right]);
            }
            if(buttom>top&&left<right){
                for(int i=right-1;i>left;i--){
                    list.add(matrix[buttom][i]);
                }
                for(int i=buttom;i>top;i--){
                    list.add(matrix[i][left]);
                }
            }
            left++;
            top++;
            right--;
            buttom--;
        }
        return list;
    }
}
