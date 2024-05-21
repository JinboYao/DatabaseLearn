package src.数组;

public class 缺失的第一个正整数 {
    public int minNumberDisappeared (int[] nums) {
        // write code here
        int n=nums.length;
        int res=1;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<n;i++){
            map.put(nums[i],i);
        }
        while(map.containsKey(res)){
            res++;
        }
        return res;
    }
}
