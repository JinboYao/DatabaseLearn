package src.数组;
public class 数组中出现次数超过一半的数字 {
    // 解法一：
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
    // 解法二：
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
            if(map.get(num)>n/2) return num;
        }
        return -1;
    }
    // 解法三：摩尔投票
    //最坏结果：数字被消耗到只剩最后一个
    public int majorityElement(int[] nums) {
        int res=nums[0];
        int cnt=0;
        for(int num:nums){
            if(num==res){
                cnt++;
            }else{
                if(cnt==0){
                    res=num;
                    cnt=1;
                }
                cnt--;
            }
        }
        return res;
    }
}
