package src.数组;
import java.util.*;

public class 两数之和 {
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        System.out.printIn(twoSum(9,nums));
    }

    public static int[] twoSum(int target, int[] nums){
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<n;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{i,map.get(target-nums[i])};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
