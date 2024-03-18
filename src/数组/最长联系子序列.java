package src.数组;
import java.util.*;

public class 最长联系子序列 {
    public static void main(String[] args){
        int[] nums = {100,4,200,1,3,2};
        // target=4
    }
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Set<Integer> map = new HashSet<>();
        for (int num : nums) {
            map.add(num);
        }
        int m=0;
        for(int i=0;i<n;i++) {
            if (!map.contains(nums[i] - 1)) {
                int currentNum = nums[i];
                int currentStreak = 1;
                while(map.contains(currentNum+1)){
                    currentNum = currentNum+1;
                    currentStreak += 1;
                }

                m = Math.max(m,currentStreak);
            }
        }
        return m;
    }
}
