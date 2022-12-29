package src.数组;

public class Solution {
    // 解法一：
    public int findRepeatNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return nums[i];
            }
            map.put(nums[i],i);
        }
        return -1;
    }
    // 解法二：
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set=new HashSet<Integer>();
        for(int num:nums){
            if(set.contains(num)) return num;
            set.add(num);
        }
        return -1;
    }
    // 解法三：原地交换，计算索引
    public int findRepeatNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            while(nums[i]!= i) {
                if(nums[i]==nums[nums[i]]) return nums[i];
                int tmp=nums[i];
                nums[i]=nums[tmp];
                nums[tmp]=tmp;
            }
        }
        return -1;
    }
}